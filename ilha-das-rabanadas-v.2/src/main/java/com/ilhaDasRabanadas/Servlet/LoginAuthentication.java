package com.ilhaDasRabanadas.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ilhaDasRabanadas.bean.Cliente;
import com.ilhaDasRabanadas.bean.Login;
import com.ilhaDasRabanadas.dao.LoginDao;

/**
 * Servlet implementation class LoginAuthentication
 */
@WebServlet("/LoginAuthentication")
public class LoginAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginAuthentication() {
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
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		// Obtém o nome de usuário e senha enviados pelo formulário
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		LoginDao loginDao = new LoginDao();

		try {
			LoginDao.Authentication(email, senha);
			int id = LoginDao.Authentication(email, senha).getIdLogin();
			if (id == 0) {
				response.sendRedirect("./Adm/Dashboard.jsp");
				

			}

		
			if (id != 0) {
				response.sendRedirect("./Cliente/Dashboard.jsp");
				
			}

		} catch (Exception e) {
			System.out.println("erro no servlet ><");
			System.out.println(e.getMessage());

		}

	}

}
