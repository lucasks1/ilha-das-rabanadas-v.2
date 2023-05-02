package com.ilhaDasRabanadas.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilhaDasRabanadas.bean.Produto;

/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		executar(request,response);
	}

	private void executar(HttpServletRequest request, HttpServletResponse response) {
		try {
			String url = request.getServletPath();
			if(url.equalsIgnoreCase("/ProdutoServlet")) {
				cadastrar(request,response);
			}else if(url.equalsIgnoreCase("/buscarCliente")) {
			//	buscar(request,response);
			
			}else if(url.equalsIgnoreCase("/confirmarCliente")) {
				//confirmar(request,response);
			} else if (url.equalsIgnoreCase("/editarCliente")) {
				//editar(request,response);
			}else if(url.equalsIgnoreCase("/excluirCliente")) {
				//excluir(request,response);
			}
			else {
				throw new Exception("URL Inválida");
			}
		}catch(Exception e) {
			//response.sendRedirect("cliente.jsp");
			e.printStackTrace();
		}
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String nomeProduto = request.getParameter("nomeProduto");
		String descricao = request.getParameter("descricao");
		String categoria = request.getParameter("categoria");
		String preco = request.getParameter("preco");
		
		Produto produto = new Produto();
		produto.setNomeProduto(nomeProduto);
		produto.setCategoria(categoria);
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		try {
			ProdutoDao produtoDao=  new ProdutoDao();
			ProdutoDao.adicionar(produto);
			response.sendRedirect("Home/home.jsp");
		} catch (Exception e) {
			System.out.println("errorrrr");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
