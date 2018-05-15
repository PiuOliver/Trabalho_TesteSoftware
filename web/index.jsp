<%-- 
    Document   : index
    Created on : 21/04/2018, 19:06:46
    Author     : jeanv
--%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:if test="${mensagem==null}">
    <c:set var="mensagem" value="Não Aplicavel." />   
</c:if>
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
       <div class="col-sm-12" align="center">
            
            <button class="btn btn-primary" onclick="document.location='banco.jsp'">Cadastro do Banco</button>
            <button class="btn btn-primary" onclick="document.location='simulacaoRenda.jsp'">Simulação</button>
       </div>
       <br><br>
            <b>Resultado da Simulação:</b> <c:out value="${mensagem}" />
    </body>
</html>
