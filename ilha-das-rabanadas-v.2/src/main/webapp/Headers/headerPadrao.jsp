<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>

<style>

nav{
font-weight:bold;
}
@media  (max-width:500px){

#img2{
	width:35%;
}
}

@media  (max-width:920px){

#img2{
	width:30%;
}
}
</style>

<body>


<nav id="header" class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
  
    <img id="img2" width="20%" src="../public/imgs/img/logo-dashboards.webp" alt="">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active links" aria-current="page" href="../Home/home.jsp"> Home  </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-black links" href="../Produto/Cardapio.jsp"> Card�pio  </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-black links" href="../Sobre/Sobre.jsp">  Sobre </a>
        </li>
      </ul>
      <span class="navbar-text">
        <a href="../Login/login.jsp"><button id="btn-login" class="btn btn-success" type="submit">Login </button></a>
      </span>
    </div>
  </div>
</nav>

</body>
</html>