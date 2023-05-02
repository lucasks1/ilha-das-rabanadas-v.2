package com.ilhaDasRabanadas.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilhaDasRabanadas.bean.Cliente;
import com.ilhaDasRabanadas.bean.Login;


@WebServlet(name="/ClienteServelet",
urlPatterns = {
		"/cadastrarCliente",
		"/buscarCliente",
		"/adicionarCliente",
		"/editarCliente",
		"/excluirCliente"
})
public class ClienteServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 public ClienteServelet() {
	 super();
 }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		executar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
	
	public void executar(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		try {
			String url = request.getServletPath();
			if(url.equalsIgnoreCase("/cadastrarCliente")) {
			
				cadastrar(request,response);
			}else if(url.equalsIgnoreCase("/buscarCliente")) {
				buscar(request,response);
			}else if(url.equalsIgnoreCase("adicionarCliente")) {
				adicionar(request,response);
			}else if(url.equalsIgnoreCase("/editarCliente")) {
				editar(request,response);
		}else if(url.equalsIgnoreCase("/excluirCliente")) {
			excluir(request,response);
		
	}
		else {
			throw new Exception("URL Inválida");
		}

}catch(Exception e){
	response.sendRedirect("Cadastro.jsp");
	e.printStackTrace();
	
}
	}
	
	protected void cadastrar(HttpServletRequest request, HttpServletResponse response, String nome, String sobrenome, String numero, String cep, String rua, String bairro, String numerocliente, String cidade, Login Login)
			throws ServletException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNomeCliente(nome);
		cliente.setSobreNome(sobrenome);
		cliente.setNumero(numerocliente);
		cliente.setCep(cep);
		cliente.setRua(rua);
		cliente.setBairro(bairro);
		cliente.setNumero(numero);
		cliente.setCidade(cidade);
		cliente.setLogin(Login);
		
		try {
			Clientedao dao = new Clientedao();
			dao.adicionar(cliente);
			//request.setAttribute("msg", "<div class='alert alert-danger'>Cliente Cadastrado!!!!</div>");
		} catch (Exception e) {
			e.printStackTrace();
			//request.setAttribute("msg", "<div class='alert alert-danger'>Cliente não Cadastrado!!!!");
		} finally {		
			request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
		}
		
	
}
	
	
}
