<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="card">
    <div class="card-img"><img class="card-img-top " src="<?php echo $imagem; ?>" alt="Title"></div>
    <div class="card-body ">
        <h5 class="card-title fw-bold"><?php echo $nomeProduto; ?></h5>
        <p class="card-text"><?php echo $descricao; ?></p>
        <p><?php echo $preco; ?></p>
    </div>
    <div class="card-footer d-flex align-items-center justify-content-center gap-2">
        <a id="edit" href="../carrinho/index?id=<?php echo $idProduto; ?>"><button class="btn btn-success">Encomendar</button></a>

    </div>
</div>

</body>
</html>