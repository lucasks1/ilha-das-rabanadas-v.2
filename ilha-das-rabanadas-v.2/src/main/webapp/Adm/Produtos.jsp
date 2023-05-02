<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<title>Ilha das Rabanadas</title>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link rel="stylesheet" href="../public/css/produto/cardapio.css">
<link rel="stylesheet" href="../public/css/style.css">
<link rel="icon" href="../public/imgs/img/palmeira.png">

<head>
<meta charset="ISO-8859-1">
</head>
<body>


	<%@ page import="com.ilhaDasRabanadas.bean.Produto"%>

	<%@ page import="com.ilhaDasRabanadas.dao.ProdutoDao"%>
	<%@ page import="java.util.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%
	List<Produto> list = ProdutoDao.getAllProdutos();
	request.setAttribute("list", list);
	%>
	<jsp:include page="../Headers/header-dashboards-adm-acessado.jsp"></jsp:include>
	<main>
		<h1 class="text-center">Seus produtos</h1>

		<div class="container">
			<a href="./CadastrarProduto.jsp"><span class="btn btn-success">Adicionar
					novo produto</span></a>
			<div>
				<h4 class="text-start">Rabanadas Doces</h4>
				<div class="d-flex flex-row  align-items-center  flex-wrap gap-5 ">
					<c:forEach items="${list}" var="produto">
						<c:if test="${produto.getCategoria()=='Doce'}">
							<div class="card">
								<div class="card-img">
									<img class="card-img-top " src="${produto.getImagem()}"
										alt="Title">
								</div>
								<div class="card-body ">
									<h5 class="card-title fw-bold">${produto.getNomeProduto()}</h5>
									<p class="card-text">${produto.getDescricao()}</p>
									<p>${produto.getPreco()}</p>
								</div>
								<div
									class="card-footer d-flex align-items-center justify-content-center gap-2">
									<a id="edit"
										href="../adm/atualizarproduto?id=<?php echo $idProduto; ?>"><button
											class="btn btn-success">Editar</button></a>
									<button type="button" class="btn btn-outline-danger W"
										data-bs-toggle="modal"
										data-bs-target="#modal<?php echo $idProduto; ?>">
										Deletar</button>
								</div>
							</div>
						</c:if>
					</c:forEach>
				</div>
			</div>
			<div>
				<h4 class="text-start">Rabanadas Salgadas</h4>
				<div class="d-flex flex-row  align-items-center  flex-wrap gap-5 ">
					<c:forEach items="${list}" var="produto">
						<c:if test="${produto.getCategoria()=='Salgado'}">
							<div class="card">
								<div class="card-img">
									<img class="card-img-top " src="${produto.getImagem()}"
										alt="Title">
								</div>
								<div class="card-body ">
									<h5 class="card-title fw-bold">${produto.getNomeProduto()}</h5>
									<p class="card-text">${produto.getDescricao()}</p>
									<p>${produto.getPreco()}</p>
								</div>
								<div
									class="card-footer d-flex align-items-center justify-content-center gap-2">
									<a id="edit"
										href="../adm/atualizarproduto?id=<?php echo $idProduto; ?>"><button
											class="btn btn-success">Editar</button></a>
									<button type="button" class="btn btn-outline-danger W"
										data-bs-toggle="modal"
										data-bs-target="#modal<?php echo $idProduto; ?>">
										Deletar</button>
								</div>
							</div>
						</c:if>
					</c:forEach>
				</div>
			</div>
			<div>
				<h4 class="text-start">Rabanadas Veganas</h4>
				<div class="d-flex flex-row  align-items-center  flex-wrap gap-5 ">
					<c:forEach items="${list}" var="produto">
						<c:if test="${produto.getCategoria()=='Vegana'}">
							<div class="card">
								<div class="card-img">
									<img class="card-img-top " src="${produto.getImagem()}"
										alt="Title">
								</div>
								<div class="card-body ">
									<h5 class="card-title fw-bold">${produto.getNomeProduto()}</h5>
									<p class="card-text">${produto.getDescricao()}</p>
									<p>${produto.getPreco()}</p>
								</div>
								<div
									class="card-footer d-flex align-items-center justify-content-center gap-2">
									<a id="edit"
										href="../adm/atualizarproduto?id=<?php echo $idProduto; ?>"><button
											class="btn btn-success">Editar</button></a>
									<button type="button" class="btn btn-outline-danger W"
										data-bs-toggle="modal"
										data-bs-target="#modal<?php echo $idProduto; ?>">
										Deletar</button>
								</div>
							</div>
						</c:if>
					</c:forEach>
				</div>
			</div>
		</div>
	</main>




	<!-- Optional: Place to the bottom of scripts -->
	<script>
		const myModal = new bootstrap.Modal(document.getElementById('modalId'),
				options)
	</script>


	<script src="https://cdn.lordicon.com/ritcuqlt.js"></script>


	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous">
		
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
		integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
		crossorigin="anonymous">
		
	</script>
</body>

</html>
