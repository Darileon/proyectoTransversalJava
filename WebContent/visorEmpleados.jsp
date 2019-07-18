<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="modelo.Modelo" %>
	<%@ page import="modelo.Empleado" %>
	<%@ page import="modelo.DatosEmpleado" %>
	<%@ page import="java.util.ArrayList" %>
	<%@ page import="java.util.List" %>
	<%
		Modelo modelo = new Modelo();
	%>
	
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
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
				<%
					List<DatosEmpleado> empleados = new ArrayList<>();
					empleados = modelo.getDatosEmpleados();
					for(DatosEmpleado e: empleados){
				%>
						<div class="row">
							<div class="col-2"><%=e.getNombre() %></div>
							<div class="col-2"><%=e.getApellido1(), e.getApellido2() %></div>
							<div class="col-1"><%=e.getTelefono() %></div>
							<div class="col-1"><%=e.getDNI() %></div>
							<div class="col-1"><%=e.getDescripcion() %></div>
							<div class="col-2"><%=e.getNick() %></div>	
							<div class="col-2"><%=e.getCorreo() %></div>
							<div class="col-1"><%=e.getSalario() %></div>
						</div>	
				<%
					}
				
				%>
				
			</div>
			<div class="col-1"></div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>