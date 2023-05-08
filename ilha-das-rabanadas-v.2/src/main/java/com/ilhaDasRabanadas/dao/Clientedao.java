package com.ilhaDasRabanadas.dao;

import com.ilhaDasRabanadas.bean.Cliente;

public class Clientedao extends Conexao {

	public void adicionar(Cliente cliente) throws ClassNotFoundException {
		
		
		try {
			open();
			String sql ="INSERT INTO `cliente`(nomeCliente,sobrenome,numeroCliente,cep,rua,bairro,numero,cidade) "
					+ "VALUES (?,?,?,?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2,cliente.getSobreNome());
			stmt.setString(3,cliente.getNumeroCliente());
			stmt.setString(4,cliente.getCep());
			stmt.setString(5,cliente.getRua());
			stmt.setString(6,cliente.getBairro());
			stmt.setString(7,cliente.getNumero());
			stmt.setString(8,cliente.getCidade());
			
			stmt.execute();
			
			
		}catch (Exception e) {
			System.out.println(cliente.getNomeCliente());
			System.out.println("error na inserção");
			System.out.println(e);
		} 
	}

}
