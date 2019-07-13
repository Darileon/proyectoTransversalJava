<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="main.css">
<title>Gestión de empleados</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="index.jsp">Inicio/Registro</a></li>
			<li class="nav-item active"><a class="nav-link" href="visorEmpleados.jsp">Visor de empleados</a></li>
		</ul>
	</nav>

	<div id="main" class="container-fluid mt-3" style="margin: auto">
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10 white-op text-center">
				<div class="row">
					<div class="col-2">Nombre</div>
					<div class="col-2">Apellidos</div>
					<div class="col-1">Telefono</div>
					<div class="col-1">DNI</div>
					<div class="col-1">Dept</div>
					<div class="col-2">Nick</div>	
					<div class="col-2">Correo</div>
					<div class="col-1">Salario</div>
				</div>
				<div class="row">
					<div class="col-2">Francisco José</div>
					<div class="col-2">Pelaez Rámirez</div>
					<div class="col-1">666778899</div>
					<div class="col-1">05897456R</div>
					<div class="col-1">RRSS</div>
					<div class="col-2">pacoPepe</div>	
					<div class="col-2">pacoramirez@gmail.com</div>
					<div class="col-1">1000€</div>
				</div>
			</div>
			<div class="col-1"></div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>