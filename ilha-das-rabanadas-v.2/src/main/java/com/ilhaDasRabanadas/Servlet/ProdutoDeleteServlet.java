package com.ilhaDasRabanadas.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilhaDasRabanadas.bean.Produto;
import com.ilhaDasRabanadas.dao.ProdutoDao;

/**
 * Servlet implementation class ProdutoDeleteServlet
 */
@WebServlet("/ProdutoDeleteServlet")
public class ProdutoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idProduto = Integer.parseInt(request.getParameter("idProduto"));
		Produto produto = new Produto();
		produto.setIdProduto(idProduto);
		try {
			ProdutoDao produtoDao = new ProdutoDao();
			produtoDao.deleteProduct(produto);
			response.sendRedirect("Adm/Produtos.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
