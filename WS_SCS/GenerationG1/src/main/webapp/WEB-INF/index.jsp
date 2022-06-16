<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nicole</title>
</head>
<body>
	<h1>
		Hola
		<!-- Capturar el contenido que hay dentro del atributo -->
		<c:out value="${nombres}"></c:out>
		<c:out value="${apellidos}"></c:out>
		<!--br salto de linea-->
		<c:out value="${color}"></c:out>
		<c:out value="${edad}"></c:out>
		<c:out value="${password}"></c:out>
		<c:out value="${nusuario.nombre} ${usuario.apellido} ${usuario.getEdad()} ${usuario.password}"></c:out>
	</h1>
</body>
</html>
