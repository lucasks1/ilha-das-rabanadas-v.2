package com.ilhaDasRabanadas.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilhaDasRabanadas.bean.Cliente;
import com.ilhaDasRabanadas.bean.Login;
import com.ilhaDasRabanadas.dao.ClienteDao;
import com.ilhaDasRabanadas.dao.LoginDao;

/**
 * Servlet implementation class ClienteInsertServlet
 */
@WebServlet("/ClienteInsertServlet")
public class ClienteInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClienteInsertServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// criando o login
		LoginDao loginDao = new LoginDao();

		String email = request.getParameter("email");
		String password = request.getParameter("senha");

		Login login = new Login();
		login.setEmail(email);
		login.setPassword(password);
		try {
			LoginDao.insert(login);

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println(e.getMessage());

		}
		Login loginDb = LoginDao.getLogin(email);

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String numeroCliente = request.getParameter("numeroCliente");
		String rua = request.getParameter("rua");
		String numero = request.getParameter("numero");
		String bairro = request.getParameter("bairro");
		String cep  = request.getParameter("cep");
		String cidade = request.getParameter("cidade");
		Cliente cliente = new Cliente();
		cliente.setIdCliente(loginDb.getIdLogin());
		cliente.setNomeCliente(nome);
		cliente.setSobreNome(sobrenome);
		cliente.setNumeroCliente(numeroCliente);
		cliente.setRua(rua);
		cliente.setCidade(cidade);
		cliente.setCep(cep);
		cliente.setNumero(numero);
		cliente.setBairro(bairro);

		try {
			ClienteDao clienteDao = new ClienteDao();
			ClienteDao.register(cliente);
			response.sendRedirect("Adm/Produtos.jsp");
		} catch (Exception e) {
		
			System.out.println("errora");
			System.out.println(e);
		}

	}

}
