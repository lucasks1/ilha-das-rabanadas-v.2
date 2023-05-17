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

</style>


<body>

<nav id="header" class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <img width="15%" src="../public/imgs/img/logo-dashboards.webp" alt="">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active links" aria-current="page" href="../Home/home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-black links" href="../Produto/Cardapio.jsp"> Cardápio  </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-black links" href="../Sobre/Sobre.jsp">  Sobre </a>
        </li>
      </ul>
      <span class="navbar-text">
        <a href="../Adm/Dashboard.jsp"><lord-icon src="https://cdn.lordicon.com/dxjqoygy.json" trigger="hover" colors="primary:#000000,secondary:#000000" style="width:60px;height:60px">
          </lord-icon></a>
      </span>
    </div>
  </div>
</nav>

</body>
</html>