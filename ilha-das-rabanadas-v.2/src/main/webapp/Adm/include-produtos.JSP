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
    <div class="card-img"><img class="card-img-top " src="" alt="Title"></div>
    <div class="card-body ">
        <h5 class="card-title fw-bold"></h5>
        <p class="card-text"></p>
        <p></p>
    </div>
    <div class="card-footer d-flex align-items-center justify-content-center gap-2">
        <a id="edit" href="../adm/atualizarproduto?id=""><button class="btn btn-success">Editar</button></a>
        <button type="button" class="btn btn-outline-danger W" data-bs-toggle="modal" data-bs-target="#modal=">
            Deletar
        </button>
    </div>
</div>
<div class="modal fade" id="" tabindex="-1" role="dialog" aria-labelledby="modalTitleId" aria-hidden="true">
    <div class="modal-dialog modal-dialog-scrollable modal-dialog-centered modal-sm " role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="modalTitleId">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <p>Tem certeza que quer deletar esse item?</p>
            </div>
            <div class="modal-footer">
                <form action='../produto/delete' method='POST'>
                    <input type='hidden' name='id' value=''>

                    <button name='deletar' type='submit' class='btn btn-outline-danger'>
                        Sim, quero deletar!
                    </button>
                </form>
                <button type='button' data-bs-dismiss='modal' class='btn btn-outline-primary'>
                    Cancelar
                </button>
            </div>
        </div>
    </div>
</div>

</body>
</html>