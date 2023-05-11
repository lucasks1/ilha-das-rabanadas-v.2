package com.ilhaDasRabanadas.dao;

import java.util.ArrayList;
import java.util.List;
import com.ilhaDasRabanadas.bean.Produto;

public class ProdutoDao extends Conexao {
	public static List<Produto> getAllProdutos() {
		List<Produto> list = new ArrayList<Produto>();
		try {
			open();
			String sql = "SELECT * FROM produto";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(rs.getInt("idProduto"));
				produto.setNomeProduto(rs.getString("nomeProduto"));
				produto.setImagem(rs.getString("imagem"));
				produto.setPreco(rs.getString("preco"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setCategoria(rs.getString("categoria"));
				list.add(produto);

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}

	public static Produto getElementById(String idProduto) {

		Produto produto = new Produto();
		try {
			open();
			String sql = "SELECT *  FROM produto WHERE idProduto=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, idProduto);
			rs = stmt.executeQuery();

			while (rs.next()) {

				produto.setIdProduto(rs.getInt("idProduto"));
				produto.setNomeProduto(rs.getString("nomeProduto"));
				produto.setImagem(rs.getString("imagem"));
				produto.setPreco(rs.getString("preco"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setCategoria(rs.getString("categoria"));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return produto;
	}

	public static void editar(Produto produto) {
String id = Integer.toString(produto.getIdProduto());
		try {
			open();
			String sql = "UPDATE `produto` SET nomeProduto=?,descricao=?,categoria=?,preco=?,imagem=?  WHERE idProduto = ?;";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, produto.getNomeProduto());
			stmt.setString(2, produto.getDescricao());
			stmt.setString(3, produto.getCategoria());
			stmt.setString(4, produto.getPreco());
	
			stmt.setString(5, produto.getImagem());
			
			stmt.setString(6, id);
			stmt.execute();
		} catch (Exception e) {
			System.out.println(produto);
			System.out.println("error na inserção");
			System.out.println(e);
		}
	}

	public static void adicionar(Produto produto) {

		try {
			open();
			String sql = "INSERT INTO `produto`(`nomeProduto`, `preco`, `descricao`,`imagem`,`categoria`) VALUES"
					+ "(?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, produto.getNomeProduto());
			stmt.setString(2, produto.getPreco());
			stmt.setString(3, produto.getDescricao());
			stmt.setString(4, produto.getImagem());
			stmt.setString(5, produto.getCategoria());
			stmt.execute();
		} catch (Exception e) {
			System.out.println(produto.getNomeProduto());
			System.out.println("error na inserção");
			System.out.println(e);
		}
	}
}
