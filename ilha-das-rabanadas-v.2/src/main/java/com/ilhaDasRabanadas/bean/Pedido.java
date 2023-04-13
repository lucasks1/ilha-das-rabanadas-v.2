package com.ilhaDasRabanadas.bean;

public class Pedido {
	protected int idPedido;
	public String dataEntrega;
	public String hora;
	public String valorPedido;
	public String quantidadePedido;
	public Cliente cliente;
	public Produto produto;
	public String endereco;
	public String formaPagamento;
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataProduto) {
		this.dataEntrega = dataProduto;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(String valorPedido) {
		this.valorPedido = valorPedido;
	}
	public String getQuantidadePedido() {
		return quantidadePedido;
	}
	public void setQuantidadePedido(String quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public Pedido(int idPedido,String dataEntrega,String hora,String valorPedido,String quantidadePedido,Cliente cliente,Produto produto,String endereco,String formaPagamento) {
		this.idPedido = idPedido;
		this.dataEntrega = dataEntrega;
		this.hora = hora;
		this.valorPedido = valorPedido;
		this.quantidadePedido = quantidadePedido;
		this.cliente = cliente;
		this.produto = produto;
		this.endereco = endereco;
		this.formaPagamento = formaPagamento;
	}
	

}
