package com.ilhaDasRabanadas.dao;

import com.ilhaDasRabanadas.bean.Login;

public class LoginDao extends Conexao {
	public static void insert(Login login) {
		try {
			open();
			String sql = "INSERT INTO `login`(`login`, `senha`)" + " VALUES (?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, login.getEmail());
			stmt.setString(2, login.getPassword());
			stmt.execute();

		} catch (Exception e) {
			System.out.println("erro inserção");
		}

	}

	public static Login getLogin(String email) {
		Login login = new Login();
		try {
			open();
			String sql = "SELECT idLogin FROM `login` WHERE login=(?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, email);
			rs = stmt.executeQuery();
			while (rs.next()) {
				
				
				login.setIdLogin(rs.getInt("idLogin"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return login;

	}

}
