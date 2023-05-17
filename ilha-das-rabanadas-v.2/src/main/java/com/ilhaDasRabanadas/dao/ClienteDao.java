package com.ilhaDasRabanadas.dao;

import com.ilhaDasRabanadas.bean.Cliente;

public class ClienteDao extends Conexao {

	public static void register(Cliente cliente) {

		String idLogin = Integer.toString(cliente.getIdLogin());
		try {
			open();
			String sql = "INSERT INTO `cliente`(`nomeCliente`, `sobrenome`, `numeroCliente`, `cep`, `rua`, `bairro`, `numero`, `cidade`, `idLogin`)"
					+ "VALUES (?,?,?,?,?,?,?,?,?)";

			stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getSobreNome());
			stmt.setString(3, cliente.getNumeroCliente());
			stmt.setString(4, cliente.getCep());
			stmt.setString(5, cliente.getRua());
			stmt.setString(6, cliente.getBairro());
			stmt.setString(7, cliente.getNumero());
			stmt.setString(8, cliente.getCidade());
			stmt.setString(9, idLogin);

			stmt.execute();

		} catch (Exception e) {
			System.out.println(idLogin);
			System.out.println("error na insersasção");
			System.out.println(e);
		}
	}

	
	public static Cliente getElementByIdLogin(int idLogin) {
		
	String test = Integer.toString(idLogin);
		// pegar pelo idLogin
		Cliente cliente = new Cliente();

		try {
			open();

			String sql = "SELECT * FROM `cliente` WHERE idLogin=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, test);
			rs = stmt.executeQuery();

			while (rs.next()) {

				cliente.setIdCliente(rs.getInt("idCliente"));
				cliente.setNomeCliente(rs.getString("nomeCliente"));
				cliente.setSobreNome(rs.getString("sobrenome"));
				cliente.setNumeroCliente(rs.getString("numeroCliente"));
				cliente.setCep(rs.getString("cep"));
				cliente.setRua(rs.getString("rua"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setNumero(rs.getString("numero"));
				cliente.setCidade(rs.getString("cidade"));

			}
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}

		return cliente;
	}


	public static void update(Cliente cliente) {
		// TODO Auto-generated method stub
		String idCliente = Integer.toString(cliente.getIdCliente());
		try {
			open();
			String sql = "UPDATE `cliente` SET `nomeCliente`=?,`sobrenome`=?,`numeroCliente`=?,`cep`=?,`rua`=?,`bairro`=?,`numero`=?,`cidade`=?"
					+ "WHERE idCliente =?";

			stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getSobreNome());
			stmt.setString(3, cliente.getNumeroCliente());
			stmt.setString(4, cliente.getCep());
			stmt.setString(5, cliente.getRua());
			stmt.setString(6, cliente.getBairro());
			stmt.setString(7, cliente.getNumero());
			stmt.setString(8, cliente.getCidade());
			stmt.setString(9, idCliente);

			stmt.execute();

		} catch (Exception e) {
			
			System.out.println("error na insersasção");
			System.out.println(e);
		}
	}
	

}
