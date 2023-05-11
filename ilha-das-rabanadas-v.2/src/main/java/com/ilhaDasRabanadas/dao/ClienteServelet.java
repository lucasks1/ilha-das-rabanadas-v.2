package com.ilhaDasRabanadas.dao;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLException;

import com.ilhaDasRabanadas.bean.Cliente;

@WebServlet("/ClienteServlet")
@MultipartConfig


public class ClienteServelet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpRequest request, HttpResponse response)
			throws SQLException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:").append(request.getContextPath());
		

	}
	
	protected void doPost(HttpRequest request, HttpResponse response)
			throws SQLException, IOException {
		doGet(request, response);
		try {
		String url = request.getServletPath();
		if(url.equalsIgnoreCase("/ClienteServlet")) {
			cadastrar(request,response);
		}else {
			throw new Exception("Url invalida");
		}
		}catch(Exception e) {
			response.sendRedirect("Cadastro.jsp");
			e.printStackTrace();
		}
}

	private void cadastrar(HttpRequest request, HttpResponse response) 
		// TODO Auto-generated method stub
		throws SQLException, IOException{
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String numeroCliente = request.getParameter("numeroCliente");
		String cep = request.getParameter("cep");
		String rua = request.getParameter("rua");
		String bairro = request.getParameter("bairro");
		String numero = request.getParameter("numero");
		String cidade = request.getParameter("cidade");
		
		Cliente  cliente = new Cliente();
		cliente.setNomeCliente(nome);
		cliente.setSobreNome(sobrenome);
		cliente.setNumeroCliente(numeroCliente);
		cliente.setCep(cep);
		cliente.setRua(rua);
		cliente.setBairro(bairro);
		cliente.setNumero(numero);
		cliente.setCidade(cidade);
		
		try {
			Clientedao clientedao = new Clientedao();
			clientedao.adicionar(cliente);
		}catch(Exception e) {
			request.setAttribute("msg", "Falha ao adicionar!");
			response.sendRedirect("Cadastro.jsp");
		}
	}
}

