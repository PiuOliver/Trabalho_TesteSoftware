<%-- 
    Document   : banco
    Created on : 02/05/2018, 13:31:21
    Author     : gabrieldeoliveira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <!-- Bootstrap core CSS -->
            <link href="css/bootstrap.min.css" rel="stylesheet">

            <!-- Custom styles for this template -->
            <link href="css/jumbotron-narrow.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h2>Cadastro do Banco</h2> 
            <div class="col-sm-5">
                <form action="sessionBancos">
                    <label>Nome Empresarial:</label> 
                    <input class="form-control" type="text" placeholder="Nome Empresarial" name="nameEmpresarial"><br> 
                    <label>Tipo Participante:</label> 
                    <input class="form-control" type="text" placeholder="Tipo Participante" name="tipoParticipante"><br>
                    <label>Data de Construção:</label> 
                    <input class="form-control" type="text" placeholder="Data de Construção" name="dataConstrucao"><br>
                    <label>CNPJ:</label> 
                    <input class="form-control" type="text" placeholder="CNPJ" name="CNPJ"><br>
                    <label>Código CVM:</label> 
                    <input class="form-control" type="text" placeholder="Código CVM" name="codigoCVM"><br>
                    <label>Data de Registro CVM:</label> 
                    <input class="form-control" type="text" placeholder="Data de Registro CVM" name="dataRegistroCVM"><br>
                    <label>Situação do Registro CVM:</label> 
                    <input class="form-control" type="text" placeholder="Situação do Registro CVM" name="situacaoRegistroCVM"><br>
                    <label>Data de Início da Situação:</label> 
                    <input class="form-control" type="text" placeholder="Data de Inicio da Situação" name="dataInicioSituacao"><br>
                    <label>País de Origem:</label> 
                    <input class="form-control" type="text" placeholder="País de Origem" name="paisOrigem"><br>
                    <input class="btn btn-primary" type="submit" value="Enviar">
                </form>
            </div>
        </div>
    </body>
</html>
