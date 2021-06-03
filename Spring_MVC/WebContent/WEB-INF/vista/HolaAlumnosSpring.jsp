<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hola alumnos spring</title>
</head>
<body>

	<!-- utilizamos un jsp tag -->

	Hola ${param.nombreAlumno} . Bienvenido a Spring MVC

	<br>

	<p>el siguiente mensaje estaba en el modelo! , fue seteado mediante
		el metod addAtribute();</p>
	<h3>${mensaje}</h3>

</body>
</html>