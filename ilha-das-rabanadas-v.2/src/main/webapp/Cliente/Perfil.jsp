<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="pt-br">

<head>
<title>Ilha das Rabanadas | Perfil</title>
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
<link rel="stylesheet" href="../public/css/form/forms.css">
<link rel="stylesheet" href="../public/css/style.css">

</head>
<body>
<body>
	<jsp:include page="../Headers/header-dashboard-cliente.jsp"></jsp:include>

	<div
		class="container d-flex justify-content-center align-items-center my-5 flex-column gap-3">
		<h1 class="text-center">Seu perfil</h1>
		<div id="informacoes" class="rounded">
			<input type="hidden" name="id" value="">
			<div class="mb-4 row">

				<div class="col">
					<h5>Nome</h5>
					<p></p>
				</div>

			</div>
			<div class="mb-3 row">

				<div class="col-6">
					<h5>Telefone celular</h5>
					<p></p>
				</div>
			</div>
			<div class="mb-3 row">
				<div class="col-6">
					<h5>CEP</h5>
					<p></p>
				</div>
			</div>


			<div class="mb-4 row">
				<div class="col">
					<h5>Rua</h5>
					<p></p>
				</div>
				<div class="col">
					<h5>Número</h5>
					<p></p>
				</div>
			</div>




			<div class="mb-4 row">
				<div class="col">
					<h5>Bairro</h5>
					<p></p>
				</div>
			</div>
			<div class="col">
				<h5>Cidade</h5>
				<p></p>
			</div>



			<a href="./atualizarPerfil" id="button-submit "
				class=" nav-link d-flex justify-content-center"><input
				id="finalizar" class="btn" type="submit" value="Editar"></a>

		</div>
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
</body>

</html>
