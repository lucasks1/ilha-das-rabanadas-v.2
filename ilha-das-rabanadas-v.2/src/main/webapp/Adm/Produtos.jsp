<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<title>Ilhas das Rabanadas</title>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS v5.2.1 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="../public/css/produto/cardapio.css">
    <link rel="stylesheet" href="../public/css/style.css">
   
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<div class="container-fluid " id="header">
  <header class="container d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">


    <a href="./Produtos/Produtos.jsp" class="nav  col-md-auto mb-2 justify-content-center mb-md-0" id="return">

      <lord-icon src="https://cdn.lordicon.com/zmkotitn.json" trigger="click" colors="primary:#121331" state="hover-2" style="width:50px;height:50px">
</lord-icon>
    </a>

    <div class="col-md-3 text-center m-auto">
     <img width="60%" src="../public/imgs/img/logo-dashboards.webp" class="btn" type="submit" alt="">
    </div>
  </header>
</div>

   

    <main>
        <h1 class="text-center">Seus produtos</h1>

        <div class="container">
            <a href="./CadastrarProduto.jsp"><span class="btn btn-success"><span>Adicionar novo produto</span></span></a>
            <div id="doces">
                <h3>Doces</h3>

                <div class="d-flex flex-row  align-items-center  flex-wrap gap-5 ">
                    
                   
                </div>
            </div>

            <div id="salgados">
                <h3>Salgados</h3>

                <div class="d-flex flex-row  align-items-center  flex-wrap gap-5">
                    
                  
                    
                    

                </div>
            </div>
            <div id="Vegana">
                <h3>Vegana</h3>

                <div class="d-flex flex-row  align-items-center  flex-wrap gap-5">
                    
                    
                    
                    
                </div>
            </div>


        </div>

    </main>





    <!-- Optional: Place to the bottom of scripts -->
    <script>
        const myModal = new bootstrap.Modal(document.getElementById('modalId'), options)
    </script>
    
    
    <script src="https://cdn.lordicon.com/ritcuqlt.js"></script>


    <!-- Bootstrap JavaScript Libraries -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js" integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
    </script>
</body>

</html>
