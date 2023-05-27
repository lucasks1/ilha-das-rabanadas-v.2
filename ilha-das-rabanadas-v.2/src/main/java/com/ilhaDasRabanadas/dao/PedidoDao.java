package com.ilhaDasRabanadas.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ilhaDasRabanadas.bean.Pedido;
import com.ilhaDasRabanadas.bean.Produto;

public class PedidoDao extends Conexao {

	public void insert(Pedido pedido) {
		String stringIdCliente = Integer.toString(pedido.getIdCliente());

		try {
			open();
			String sql = "INSERT INTO `pedido`(`idCliente`,`nomeProduto`,`endereco`,`hora`,`dataEntrega`,`quantidadePedido`,`valorPedido`,`formaPagamento`,`troco`) VALUES (?,?,?,?,?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, stringIdCliente);
			stmt.setString(2, pedido.getNomeProduto());
			stmt.setString(3, pedido.getEndereco());
			stmt.setString(4, pedido.getHora());
			stmt.setString(5, pedido.getDataEntrega());
			stmt.setString(6, pedido.getQuantidadePedido());
			stmt.setString(7, pedido.getValorPedido());
			stmt.setString(8, pedido.getFormaPagamento());
			stmt.setString(9, pedido.getTroco());
			stmt.execute();

		} catch (Exception e) {
			System.out.println("err na inserção");

			System.out.println(e.getMessage());
		}
	}

	public static Pedido getAllOrderedByIdCliente(int idCliente) {
		Pedido pedido = new Pedido();
		String stringIdCliente = Integer.toString(idCliente);
		try {
			String sql = "SELECT * FROM `pedido` WHERE idCliente=?;";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, stringIdCliente);
			rs = stmt.executeQuery();

			while (rs.next()) {
				pedido.setIdPedido(Integer.parseInt(rs.getString("idPedido")));
				pedido.setDataEntrega(rs.getString("dataEntrega"));
				pedido.setEndereco(rs.getString("endereco"));
				pedido.setHora(rs.getString("hora"));
				pedido.setQuantidadePedido(rs.getString("quantidadePedido"));
				pedido.setValorPedido(rs.getString("valorPedido"));
				pedido.setNomeProduto(rs.getString("nomeProduto"));
				pedido.setFormaPagamento(rs.getString("formaPagamento"));
				pedido.setTroco(rs.getString("troco"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("aqui dao");

		}
		return pedido;
	}

	public static List<Pedido> getAllOrdered() {
		List<Pedido> list = new ArrayList<Pedido>();
		try {
			open();
			String sql = "SELECT * FROM pedido";
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Pedido pedido = new Pedido();
				pedido.setIdPedido(Integer.parseInt(rs.getString("idPedido")));
				pedido.setDataEntrega(rs.getString("dataEntrega"));
				pedido.setEndereco(rs.getString("endereco"));
				pedido.setHora(rs.getString("hora"));
				pedido.setQuantidadePedido(rs.getString("quantidadePedido"));
				pedido.setValorPedido(rs.getString("valorPedido"));
				pedido.setNomeProduto(rs.getString("nomeProduto"));
				pedido.setFormaPagamento(rs.getString("formaPagamento"));
				pedido.setTroco(rs.getString("troco"));
				list.add(pedido);

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}

}
