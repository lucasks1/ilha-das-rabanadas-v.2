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

 <script>

 if (!isset($_SESSION['idLogin'])) {
    include('./app/Views/Headers/headerPadrao.php');
} else {
    if ($_SESSION['idLogin'] == 1) {
        //sem sessao
        include('./app/Views/Headers/headerAdm.php');
    } else if ($_SESSION["idLogin"] > 1) {
        //clientes
        include('./app/Views/Headers/headerCliente.php');
    }
}
   </script>


</body>
</html>