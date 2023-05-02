

<%@ page import="com.ilhaDasRabanadas.bean.Produto"%>

<%@ page import="com.ilhaDasRabanadas.dao.ProdutoDao"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
List<Produto> list = ProdutoDao.getAllProdutos();
request.setAttribute("list", list);
%>
<div class="card">
	<div class="card-img">
		<img class="card-img-top " src="${produto.getImagem()}" alt="Title">
	</div>
	<div class="card-body ">
		<h5 class="card-title fw-bold">${produto.getNomeProduto()}</h5>
		<p class="card-text">${produto.getDescricao()}</p>
		<p>${produto.getPreco()}</p>
	</div>
	<div
		class="card-footer d-flex align-items-center justify-content-center gap-2">
		<a id="edit" href="../carrinho/index?id=<?php echo $idProduto; ?>"><button
				class="btn btn-success">Encomendar</button></a>

	</div>
</div>