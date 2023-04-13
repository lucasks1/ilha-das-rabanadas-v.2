package com.ilhaDasRabanadas.bean;

public class Login {
	protected int idLogin;
	public String login;
	public String senha;
	public int getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Login(int idLogin,String login,String senha) {
		this.idLogin = idLogin;
		this.login = login;
		this.senha = senha;
	}

}
