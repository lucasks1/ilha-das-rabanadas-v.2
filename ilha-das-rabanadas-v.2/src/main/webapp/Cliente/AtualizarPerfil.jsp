<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.ilhaDasRabanadas.bean.Cliente"%>

<%@ page import="com.ilhaDasRabanadas.dao.ClienteDao"%>


<!doctype html>
<html lang="pt-br">

<head>
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
	<link rel="stylesheet" href="../public/css/style.css">
<link rel="stylesheet" href="../public/css/form/forms.css">
<link rel="icon" href="../public/imgs/img/palmeira.png">

</head>
<body>


<%
Integer id = (Integer) session.getAttribute("id");
Cliente cliente = ClienteDao.getElementByIdLogin(id);
request.setAttribute("cliente", cliente);
%>


	<div class="container-fluid " id="header">
		<header
			class="container d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">


			<a href="../Cliente/Perfil.jsp"
				class="nav  col-md-auto mb-2 justify-content-center mb-md-0"
				id="return"> <lord-icon
					src="https://cdn.lordicon.com/zmkotitn.json" trigger="hover"
					colors="primary:#121331" state="hover-2"
					style="width:50px;height:50px"> </lord-icon>
			</a>

			<div class="col-md-3 text-center m-auto">
				  <img width="60%" src="../public/imgs/img/logo-dashboards.webp" alt="">
			</div>
		</header>
	</div>


	<div
		class="container d-flex justify-content-center align-items-center my-5 flex-column gap-3">
		<h1 class="text-center">Atualizar</h1>
		<form action="../ClienteUpdateServlet" method="POST" class="rounded">
			<input type="hidden" name="idCliente"
				value="${cliente.getIdCliente()}">
			<div class="mb-4 row">

				<div class="col-6">
					<label for="nome" class="form-label">Nome</label> <input
						type="text" required value="${cliente.getNomeCliente()}"
						name="nome" id="nome" class="form-control" placeholder=""
						aria-describedby="helpId">
				</div>
				<div class="col-6">
					<label for="sobrenome" class="form-label">Sobrenome</label> <input
						type="text" value="${cliente.getSobreNome()}" required
						name="sobrenome" id="sobrenome" class="form-control"
						placeholder="" aria-describedby="helpId">
				</div>

			</div>
			<div class="mb-3 row">

				<div class="col-6">
					<label for="numeroCelular" class="form-label">Telefone
						celular</label> <input type="text" required name="numeroCliente"
						id="numeroCelular" value="${cliente.getNumeroCliente()}"
						class=" form-control" placeholder="(99) 9999-9999"
						pattern="(\([0-9]{2}\))\s([9]{1})?([0-9]{4})-([0-9]{4})"
						title="Número de telefone precisa ser no formato (99) 9999-9999"
						required="required">
				</div>
			</div>
			<div class="mb-3 row">
				<div class="col-6">
					<label for="cep" class="form-label">Cep</label> <input type="text"
						value="${cliente.getCep()}" required name="cep" id="cep"
						class="form-control" placeholder="99999-999"
						aria-describedby="helpId" pattern="\d{5}-?\d{3}" maxlength="9">
				</div>
			</div>

			<div class="mb-4 row">
				<div class="col-10">
					<label for="rua" class="form-label">Rua</label> <input type="text"
						required name="rua" value="${cliente.getRua()}" id="logradouro"
						class="form-control" placeholder="" aria-describedby="helpId">
				</div>
				<div class="col">
					<label for="numero" class="form-label">Número</label> <input
						type="text" value="${cliente.getNumero()}" required name="numero"
						id="numero" class="form-control" placeholder=""
						aria-describedby="helpId">

				</div>
			</div>
			<div class="mb-4 row">
				<div class="col">
					<label for="bairro" class="form-label">Bairro</label> <input
						type="text" required name="bairro" value="${cliente.getBairro()}"
						id="bairro" class="form-control" placeholder=""
						aria-describedby="helpId">
				</div>
				<div class="col">
					<label for="cidade" class="form-label">Cidade</label> <input
						readonly value="${cliente.getCidade()}" name="cidade"
						id="localidade" class="form-control " placeholder=""
						aria-describedby="helpId">
				</div>
			</div>



			<div id="button-submit " class="d-flex justify-content-center">
				<input id="finalizar" class="btn" type="submit" value="Atualizar">
			</div>

		</form>
	</div>

	</main>

	<script src="https://cdn.lordicon.com/ritcuqlt.js"></script>

	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha484-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous">
		
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
		integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
		crossorigin="anonymous">
		
	</script>

	</script>
</body>

</html>
