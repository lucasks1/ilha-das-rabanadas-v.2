package com.ilhaDasRabanadas.bean;

public class Carrinho {
	
	protected int idCarrinho;
	public Cliente cliente;
	public Produto produto;
	public int getIdCarrinho() {
		return idCarrinho;
	}
	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Carrinho(int idCarrinho,Cliente cliente,Produto produto) {
	
		this.idCarrinho = idCarrinho;
		this.cliente = cliente;
		this.produto = produto;
	
	}

}
