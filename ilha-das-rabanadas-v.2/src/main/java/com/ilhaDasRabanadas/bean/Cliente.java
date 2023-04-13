package com.ilhaDasRabanadas.bean;

public class Cliente {
	protected int idCliente;
	public String nomeCliente;
	public String sobrenome;
	public String numeroCliente;
	public String cep;
	public String rua;
	public String bairro;
	public String numero;
	public String cidade;
	public Login login;
	
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getSobreNome() {
		return sobrenome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobrenome = sobreNome;
	}
	public String getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Cliente(int idCliente,String nomeCliente,String sobrenome,String numeroCliente,String cep,String rua,String bairro,String numero,String cidade,Login login ) {
			 
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.sobrenome = sobrenome;
		this.numeroCliente = numeroCliente;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.login = login;
		
	}
	
}
