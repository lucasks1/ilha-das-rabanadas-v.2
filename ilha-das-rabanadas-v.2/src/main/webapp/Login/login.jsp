<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="pt-br">

<head>
  <title>Login</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS v5.2.1 -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
	
	<link rel="stylesheet" href="../public/css/login/animacao.css">
	<link rel="stylesheet" href="../public/css/login/login.css">
	<link rel="stylesheet" href="../public/css/style.css">
	<link rel="icon" href="../public/imgs/img/palmeira.png">


  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">

</head>
<style>
  @media (max-width: 600px) {
    .facet_sidebar {
      display: none;
    }

   
  }
</style>

<body>
<jsp:include page="./animacao.jsp"></jsp:include>
  <main class="m-auto d-flex flex-column align-items-center">

    <div id="container-form" class="m-auto d-flex flex-column align-items-center rounded">
      <div class="header text-center ">
        <img src="../public/imgs/img/logo-dashboards.webp" alt="" width="70%">
      </div>
      
      <form method="POST" class="d-flex justify-content-center align-items-center flex-column">
        <div class="inputs mb-3">
          <label for="email" class="form-label">Email</label>
          <input type="email" class="form-control" name="email" id="email" placeholder="abc@mail.com">
        </div>
        
        <div class="inputs mb-3">
          <label for="" class="form-label">Senha</label>
          <input type="password" class="form-control" name="password" id="password" placeholder="">
        </div>
        
        <p style=" width: max-content;" class="text-danger">
          
        </p>
        <p class="text-start">Esqueceu a senha?</p>
        <div class="d-flex align-items gap-3">
          <input id="entrar" class="btn " type="submit" value="Entrar" name="sendLogin">
          <a href="../Login/Cadastro.jsp" id="cadastrar" class="btn btn-outline-primary">Cadastrar</a>

        </div>
      </form>
      <a class="nav-link links mt-3" href="../Home/home.jsp">
        <h6>Retornar ao site</h6>
      </a>
    </div>

  </main>
  

  <!-- Bootstrap JavaScript Libraries -->
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
  </script>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js" integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
  </script>
</body>

</html>
