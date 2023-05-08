package com.ilhaDasRabanadas.dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilhaDasRabanadas.bean.Cliente;

@WebServlet(name = "/ClienteServlet")
public class ClienteServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		executar(request, response);
	}

	

		
	

	public void executar(HttpServletRequest request, HttpServletResponse response)
			{

		try {
			String url = request.getServletPath();
			if (url.equalsIgnoreCase("/clienteServlet")) {

				 cadastrar(request,response);
			} else if (url.equalsIgnoreCase("/buscarCliente")) {
				// buscar(request,response);
			} else if (url.equalsIgnoreCase("adicionarCliente")) {
				// adicionar(request,response);
			} else if (url.equalsIgnoreCase("/editarCliente")) {
				// editar(request,response);
			} else if (url.equalsIgnoreCase("/excluirCliente")) {
				// excluir(request,response);

			} else {
				throw new Exception("URL Inválida");
			}

		} catch (Exception e) {
			//response.sendRedirect("Cadastro.jsp");
			e.printStackTrace();

		}
	}

	protected void cadastrar(HttpServletRequest request, HttpServletResponse response)
			 {
String nome = request.getParameter("nome");
String sobrenome = request.getParameter("sobrenome");
String numeroCliente = request.getParameter("numeroCliente");
String cep = request.getParameter("cep");
String bairro = request.getParameter("bairro");
String numero = request.getParameter("numero");
String cidade = request.getParameter("cidade");


		Cliente cliente = new Cliente();
		
		
		cliente.setNomeCliente(nome);
		cliente.setSobreNome(sobrenome);
		cliente.setNumeroCliente(numeroCliente);
		cliente.setCep(cep);
		cliente.setBairro(bairro);
		cliente.setNumero(numero);
		cliente.setCidade(cidade);
		
		
		

		try {
			Clientedao clientedao = new Clientedao();
			clientedao.adicionar(cliente);
			response.sendRedirect("Home/home.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			
		} 

	}

}
