package com.ilhaDasRabanadas.dao;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



import com.ilhaDasRabanadas.bean.Produto;

/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/ProdutoServlet")
@MultipartConfig
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String imageDb = "";
		Part filePart = request.getPart("imagem");

		// Obtém o nome original do arquivo
		String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

		String path = getServletContext().getRealPath("/uploads-rabanadas/upload-");
		// Grava o arquivo em disco
		File file = new File(path + fileName);
		try (InputStream fileContent = filePart.getInputStream()) {
			System.out.println(path);
			Files.copy(fileContent, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
			imageDb = "http://localhost:8080/ilhaDasRabanadas/uploads-rabanadas/upload-" + fileName;
			System.out.println(imageDb);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		// =====================================================

		String nomeProduto = request.getParameter("nomeProduto");
		String descricao = request.getParameter("descricao");
		String categoria = request.getParameter("categoria");
		String preco = request.getParameter("preco");

		Produto produto = new Produto();
		produto.setNomeProduto(nomeProduto);
		produto.setCategoria(categoria);
		produto.setDescricao(descricao);
		produto.setPreco(preco);

		produto.setImagem(imageDb);
		try {
			ProdutoDao produtoDao = new ProdutoDao();
			ProdutoDao.adicionar(produto);
			request.setAttribute("msg", "Adicionado com sucesso");
			response.sendRedirect("Adm/Produtos.jsp");
		} catch (Exception e) {
			request.setAttribute("msg", "Falha ao adicionar!");
			response.sendRedirect("Adm/Produtos.jsp");
		}
	}
}
