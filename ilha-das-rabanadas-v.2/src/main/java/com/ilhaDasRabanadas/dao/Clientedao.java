package com.ilhaDasRabanadas.dao;

import com.ilhaDasRabanadas.bean.Cliente;

public class Clientedao extends Conexao {

	public void adicionar(Cliente cliente) throws ClassNotFoundException {
		String sql ="INSERT INTO `cliente`(`nomeCliente`, `sobrenome`, `numeroCliente`, `cep`, `rua`, `bairro`, `numero`, `cidade`) "
				+ "VALUES (?,?,?,?,?,?,?,?)";
		
		try {
			open();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getNomeCliente());
			
		}
	}

}
