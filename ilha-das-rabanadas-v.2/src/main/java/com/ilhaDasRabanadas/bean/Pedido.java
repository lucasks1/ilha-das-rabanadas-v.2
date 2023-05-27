package com.ilhaDasRabanadas.bean;

public class Pedido {
	protected int idPedido;
	protected int idCliente;
	public String nomeProduto;
	public String dataEntrega;
	public String hora;
	public String valorPedido;
	public String quantidadePedido;	
	public String endereco;


	public int getIdPedido() {
		return idPedido;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
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
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	

	

}
