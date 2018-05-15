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
   <style>
      
      input{
         margin-bottom: 1em;
      }
      
   </style>      
    <body>
        <h1>Formulario para Cadastro Minha Casa Minha Vida</h1>    
        <form  action="sessionConsultas" >
            <div class="container">
                <div class="col-sm-5">
                <label>Cadastro Pessoa Principal</label> 
                    <input class="form-control" type="text" name="name" placeholder="nome"><br> 
                    <input class="form-control" type="text" name="telefone" placeholder="telefone"><br>
                    <input class="form-control" type="text" name="email" placeholder="email"><br>
                    <input class="form-control" type="text" name="UF" placeholder="UF"><br>
                    <input class="form-control" type="text" name="cidade" placeholder="cidade"><br>
                    <input class="form-control" type="text" name="bairro" placeholder="bairro"><br>
                    <input class="form-control" type="text" name="numero" placeholder="numero"><br>
                </div>
                <div class="col-sm-5">
                    <label>Quantidades de Pessoas da Renda</label>
                    <input class="form-control" type="text" name="qntdePessoas" placeholder="pessoas"><br>
                    <label>Renda Mensal</label>
                    <input class="form-control" type="text" name="renda" placeholder="R$"><br>
                </div>
                
                <input class="btn btn-primary" type="submit" value="enviar">
            </div>
        </form>
    </body>
</html>
