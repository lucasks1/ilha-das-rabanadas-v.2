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
			stmt.setString(5,produto.getCategoria());
			stmt.execute();
		} catch (Exception e) {
			System.out.println(produto.getNomeProduto());
			System.out.println("error na inserção");
			System.out.println(e);
		}
	}
}
