package com.ilhaDasRabanadas.dao;

import java.sql.SQLException;

import com.ilhaDasRabanadas.bean.Pedido;

public class PedidoDao extends Conexao {

	public void insert(Pedido pedido) {
		String stringIdCliente = Integer.toString(pedido.getIdCliente());
		
		try {
			open();
			String sql = "INSERT INTO `pedido`(`idCliente`,`nomeProduto`,`endereco`,`hora`,`dataEntrega`,`quantidadePedido`,`valorPedido`) VALUES (?,?,?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, stringIdCliente);
			stmt.setString(2, pedido.getNomeProduto());
			stmt.setString(3, pedido.getEndereco());
			stmt.setString(4, pedido.getHora());
			stmt.setString(5, pedido.dataEntrega);
			stmt.setString(6, pedido.quantidadePedido);
			stmt.setString(7, pedido.valorPedido);
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
			String sql = "SELECT * FROM `pedido` WHERE idCliente = ?;";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, stringIdCliente);
			rs = stmt.executeQuery();

			while (rs.next()) {
				pedido.setDataEntrega(rs.getString("dataEntrega"));
				pedido.setEndereco(rs.getString("endereco"));
				pedido.setHora(rs.getString("hora"));
				pedido.setQuantidadePedido(rs.getString("quantidadePedido"));
				pedido.setValorPedido(rs.getString("valorPedido"));
				pedido.setNomeProduto(rs.getString("nomeProduto"));
				pedido.setIdCliente(rs.getInt("idCliente"));
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("aqui dao");

		}
		return pedido;
	}

}
