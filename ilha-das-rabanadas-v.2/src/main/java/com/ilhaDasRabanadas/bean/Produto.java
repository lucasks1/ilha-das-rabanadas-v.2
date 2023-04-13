package com.ilhaDasRabanadas.bean;

class Produto {
	protected int idProduto;
	public String nomeProduto;
	public double preco;
	public String descricao;
	public String imagem;
	public String categoria;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Produto(String nomeProduto,Double preco,String descricao,String imagem,int idProduto,String categoria) {
		
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.descricao = descricao;
		this.imagem = imagem;
		this.idProduto = idProduto;
		this.categoria = categoria;
		
		
	}

}
