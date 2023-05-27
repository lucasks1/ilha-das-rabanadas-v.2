<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Ilha das Rabanadas| Minhas Encomendas</title>
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

<link rel="stylesheet" href="../public/css/style.css">
<link rel="stylesheet">
<link rel="icon" href="../public/imgs/img/palmeira.png">
	<href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">


</head>
<body>

	<%
	Integer id = (Integer) session.getAttribute("id");
	//---intanciando o obj cliente
	Cliente cliente = ClienteDao.getElementByIdLogin(id);
	int clienteId = cliente.getIdCliente();
	//---instacindo o obj pedido
	Pedido pedido = PedidoDao.getAllOrderedByIdCliente(clienteId);
	request.setAttribute("pedido", pedido);
	%>

	<jsp:include page="../Headers/header-dashboard-cliente.jsp"></jsp:include>

	<div class="table-responsive">
		<div class="container">
			<table class="table table-hover">

				<thead>
					<tr>
						<th scope="col">Código do Pedido</th>
						<th scope="col">Produto encomendado</th>
						<th scope="col">Data da entrega</th>
						<th scope="col">Hora da entrega</th>
						<th scope="col">Endereço</th>
						<th scope="col">Quantidade do Pedido</th>
						<th scope="col">Valor</th>
						<th scope="col">Forma de Pagamento</th>
						<th scope="col">troco</th>
						<th scope="col" colspan="2">Açoes</th>
					</tr>
				</thead>
				<tbody>



					<tr class=''>
						<td scope='row'>${pedido.getIdPedido()}</td>
						<td>${pedido.getNomeProduto()}</td>
						<td>${pedido.getDataEntrega()}</td>
						<td>${pedido.getHora()}</td>
						<td>${pedido.getEndereco()}</td>
						<td>${pedido.getQuantidadePedido()}</td>
						<td>${pedido.getValorPedido()}</td>

						<td>${pedido.getFormaPagamento()}</td>
						<td>${pedido.getTroco()}</td>

						<td>
							<button type='button' class='btn btn-outline-success '
								data-bs-toggle='modal' data-bs-target='#edit$idPedido'>
								<i class='bi bi-pencil'></i> <span>Editar Pedido</span>
							</button>
							<button type='button' class='btn btn-outline-danger'
								data-bs-toggle='modal' data-bs-target='#cancel$idPedido'>
								<i class='bi    bi-trash'></i> <span>Cancelar</span>
							</button>
						</td>
					</tr>
					<div class='modal fade' id='cancel$idPedido' tabindex='-1'
						role='dialog' aria-labelledby='modalTitleId' aria-hidden='true'>
						<div
							class='modal-dialog modal-dialog-scrollable modal-dialog-centered modal'
							role='document'>
							<div class='modal-content'>
								<div class='modal-header'>
									<h5 class='modal-title' id='modalTitleId'>Jutifique seu
										cancelamento!</h5>
									<button type='button' class='btn-close' data-bs-dismiss='modal'
										aria-label='Close'></button>
								</div>
								<div class='modal-body'>
									<h6>Codigo do Pedido</h6>
									<input type='text' name='justificativa' id='codigoPedido'
										value='$idPedido' required class='form-control'>
									<h6>Sua justificativa!</h6>
									<input type='text' name='justificativa' id='justify' required
										class='form-control'>
								</div>
								<div class='modal-footer'>
									<button type='button' class='btn btn-secondary'
										data-bs-dismiss='modal'>cancelar</button>
									<button id='justifyCancel' type='button'
										class='btn btn-primary'>Enviar</button>
								</div>
							</div>
						</div>
					</div>
					<div class='modal fade' id='edit$idPedido' tabindex='-1'
						role='dialog' aria-labelledby='modalTitleId' aria-hidden='true'>
						<div
							class='modal-dialog modal-dialog-scrollable modal-dialog-centered modal'
							role='document'>
							<div class='modal-content'>
								<div class='modal-header'>
									<h5 class='modal-title' id='modalTitleId'>Indique o dado
										que você quer mudar!</h5>
									<button type='button' class='btn-close' data-bs-dismiss='modal'
										aria-label='Close'></button>
								</div>
								<div class='modal-body'>
									<h6>Codigo do Pedido</h6>
									<input type='text' name='justificativa' id='codigoPedido'
										value='$idPedido' required readonly class='form-control'>
									<h6>Dados do pedido a ser mudado!</h6>
									<input type='text' name='dado' id='dado' required
										class='form-control'>
								</div>
								<div class='modal-footer'>
									<button type='button' class='btn btn-secondary'
										data-bs-dismiss='modal'>cancelar</button>
									<button id='edit' type='button' class='btn btn-primary'>Enviar</button>
								</div>
							</div>
						</div>
					</div>


				</tbody>
			</table>
		</div>


	</div>
	<script>
		const myModalCancel = new bootstrap.Modal(document
				.getElementsById('cancel$idPedido'), options);
		const myModalEdit = new bootstrap.Modal(document
				.getElementsById('edit$idPedido'), options);
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