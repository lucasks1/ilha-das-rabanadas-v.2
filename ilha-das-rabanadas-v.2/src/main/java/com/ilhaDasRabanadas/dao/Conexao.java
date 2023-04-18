package com.ilhaDasRabanadas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexao {
	protected PreparedStatement stmt;// linguagem sql
	protected ResultSet rs; // atingir o banco
	protected Connection con;// conexão

	private final String url = "jdbc:mysql://localhost:3306/rabanada";
	private final String user = "root";
	private final String pass = "";

	protected static void open() {
		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
