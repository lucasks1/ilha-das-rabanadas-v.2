package com.ilhaDasRabanadas.Servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.ilhaDasRabanadas.bean.Produto;
import com.ilhaDasRabanadas.dao.ProdutoDao;

/**
 * Servlet implementation class ProdutoEditServlet
 */
@WebServlet("/ProdutoEditServlet")
@MultipartConfig
public class ProdutoEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoEditServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{ // TODO Auto-generated method stub
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
	int idProduto = Integer.parseInt(request.getParameter("idProduto"));      
	String nomeProduto = request.getParameter("nomeProduto");
	String descricao = request.getParameter("descricao");
	String categoria = request.getParameter("categoria");
	String preco = request.getParameter("preco");

	Produto produto = new Produto();
	produto.setIdProduto(idProduto);
	produto.setNomeProduto(nomeProduto);
	produto.setCategoria(categoria);
	produto.setDescricao(descricao);
	produto.setPreco(preco);

	produto.setImagem(imageDb);
	try {
		ProdutoDao produtoDao = new ProdutoDao();
		ProdutoDao.editProduct(produto);
		request.setAttribute("msg", "Adicionado com sucesso");
		response.sendRedirect("Adm/Produtos.jsp");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

}
