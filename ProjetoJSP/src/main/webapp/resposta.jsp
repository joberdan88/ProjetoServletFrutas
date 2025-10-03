<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Página de Resposta</title>
	</head>
	<body>
		<jsp:useBean id="usuario" scope="session" class="meupacote.UsuarioBean" />
		<jsp:setProperty name="usuario" property="*" />
		
		<h1>Olá, <jsp:getProperty name="usuario" property="usuario" /> Seja bem-vindo!</h1> 
	</body>
</html>