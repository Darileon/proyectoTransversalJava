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
			<li class="nav-item active"><a class="nav-link" href="index.jsp">Inicio/Registro</a></li>
			<li class="nav-item"><a class="nav-link" href="visorEmpleados.jsp">Visor de empleados</a></li>
		</ul>
	</nav>
	<div id="main" class="container-fluid mt-3" style="margin: auto">
		<div class="row text-center" id="formRegistro">
			<div class="col-3 colLateral"></div>
			<div class="col-12 col-lg-6 col-xl-6 m-auto white-op">
				<h3>Registro de Usuarios</h3>
				<form id="form1" class="row">
					<label class="col-2 colLateral2"></label> 
					<label class="col-md-3 col-lg-3 col-xl-2  m-auto" for="nick">Nick: </label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="text" name="nick" id="nick">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<output id="infologin"></output>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-2 colLateral2"></label> 
					<label class="col-md-3 col-lg-3 col-xl-2  m-auto" for="password">Contraseña: </label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="password" id="password" name="password">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-2 colLateral2"></label> 
					<label class="col-md-3 col-lg-3 col-xl-2  m-auto" for="correo">Correo: </label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="email" name="correo" id="correo">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-2 colLateral2"></label> 
					<label class="col-md-3 col-lg-3 col-xl-2  m-auto" for="nombre">Nombre: </label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="text" name="nombre" id="nombre">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-1 colLateral2"></label> 
					<label class="col-3" for="ap1">Primer apellido:</label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="text" name="ap1" id="ap1">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-1 colLateral2"></label>
					<label class="col-3" for="ap2">Segundo apellido:</label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="text" name="ap2" id="ap2">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-2 colLateral2"></label>
					<label class="col-md-3 col-lg-3 col-xl-2  m-auto" for="dni">DNI:</label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="text" name="dni" id="dni">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-1 colLateral2"></label> 
					<label class="col-3" for="dep">Departamento:</label>
					<select class="col-6">
						<option></option>
						<option value="1">RRSS</option>
					</select>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-2 colLateral2"></label>
					<label class="col-md-3 col-lg-3 col-xl-2  m-auto" for="telef">Telefono:</label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="tel" name="telef" id="telef"> <label class="col-2 colLateral2"></label>
					<label class="col-1 colLateral3" style="display: none"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-2 colLateral2"></label>
					<label class="col-md-3 col-lg-3 col-xl-2  m-auto"	for="salario">Salario:</label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="number" name="salario" id="salario">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<div class="col-5"></div>
					<input class="col-2" type="submit" id="enviar" value="Registrar" class="button">
					<div class="col-5"></div>
					<div class="col-12" style="height: 20px"></div>
				</form>
			</div>
			<div class="col-3 colLateral"></div>
			<div class="col-3 colLateral"></div>
			<div class="col-6 mr-auto ml-auto mt-3 white-op">
				<div class="row">
				<div class="col-12" style="height: 20px"></div>
				<p class="col-12">Si tienes usario, puedes iniciar sesión ahora mismo</p>
				<label class="col-4"></label> 
				<button class="col-4" onclick="change()" type="button" id="registro">Iniciar sesión</button>
				<label class="col-4"></label> 
				<div class="col-12" style="height: 20px"></div>
				</div>
			</div>
			<div class="col-3 colLateral"></div>
		</div>

		<div class="row text-center" id="formLogin" style="display: none">
			<div class="col-3 colLateral"></div>
			<div class="col-12 col-lg-6 col-xl-6 m-auto white-op">
				<h3>Iniciar Sesión</h3>
				<form class="row" id="form2">
					<label class="col-2 colLateral2"></label>
					<label class="col-2" for="nick2">Nick:	</label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="text" name="nick2" id="nick2">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<output id="infologin"></output>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-2 colLateral2"></label>
					<label class="col-2" for="password2">Contraseña:</label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="password" id="password2"	name="password2"> <label class="col-2 colLateral2"></label>
					<label class="col-1 colLateral3" style="display: none"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-2 colLateral2"></label>
					<label class="col-2" for="correo2">Correo:</label>
					<input class="col-md-8 col-lg-8 col-xl-6" type="email" name="correo2" id="correo2">
					<label class="col-1 colLateral3" style="display: none"></label>
					<label class="col-2 colLateral2"></label>
					<div class="col-12" style="height: 20px"></div>

					<label class="col-5"></label> 
					<input class="col-2" type="submit" id="enviar2" value="Acceder">
					<label class="col-5"></label>
					<div class="col-12" style="height: 20px"></div>
				</form>
			</div>
			<div class="col-3 colLateral"></div>
			<div class="col-3 colLateral"></div>
			<div class="col-6 mr-auto ml-auto mt-3 white-op">
				<div class="row">
				<div class="col-12" style="height: 20px"></div>
				<p class="col-12">¿No tienes usuario? Registrate ahora mismo</p>
				<label class="col-5"></label> 
				<button class="col-2" onclick="change()" type="button" id="registro">Registrarse</button>
				<label class="col-5"></label> 
				<div class="col-12" style="height: 20px"></div>
				</div>
			</div>
			<div class="col-3 colLateral"></div>
		</div>
	</div>

	<!--Script ajax -->
	<script>
		// Cuando tenga lugar el evento submit
		// los controles del formulario se enviaran
		// por AJAX al servidor, y la respuesta sera
		// todos los usuarios existentes, con los cuales
		// renderizaremos una tabla en el navegador,
		// todo esto sin que se recargue la pagina
		document
				.getElementById("form1")
				.addEventListener(
						"submit",
						function(e) {
							e.preventDefault();
							e.stopPropagation();
							// Por AJAX asumo el control y envio del formulario
							var objUsuario = new Object();
							objUsuario.nombre = document
									.getElementById("nombre").value;
							objUsuario.login = document.getElementById("login").value;
							objUsuario.password = document
									.getElementById("password").value;
							console.log(objUsuario);

							// El objeto anterior hay que convertirlo a JSON para poderlo 
							// enviar en la peticion por AJAX
							var objUsuarioJSON = JSON.stringify(objUsuario);
							console.log(objUsuarioJSON);

							var http = new XMLHttpRequest();

							http.onreadystatechange = function() {
								if (this.readyState === 4
										&& this.status === 200) {
									// Recuperar la respuesta enviada por el servidor
									// a la peticion de AJAX
									// La respuesta recibida es un array de objetos,
									// en formato de JSON
									console.log(this.responseText);
									var arrayObjRespuesta = JSON
											.parse(this.responseText);
									console.log(arrayObjRespuesta);

									// Renderizar la tabla
									/*var filasTabla = "";
									for(i = 1; i < arrayObjRespuesta.length; i++) {
										filasTabla += "<tr><td>" + arrayObjRespuesta[i].nombre + "</td><td>" 
										             + arrayObjRespuesta[i].login + "</td><td>" 
										             + arrayObjRespuesta[i].password + "</td></tr>";
										               
									}

									document.getElementById("filasTabla").innerHTML = filasTabla;*/

								}
							};

							http.open("POST", "AJAXRegistraUsuario", true);
							http.setRequestHeader("Content-type",
									"application/x-www-form-urlencoded");
							http.send("usuario=" + objUsuarioJSON);

						});

		document
				.getElementById("login")
				.addEventListener(
						"blur",
						function() {
							// Para comprobar si este manejador de evento
							// esta funcionando
							var loginValue = this.value;

							console.log(loginValue);

							// Se genera la peticion al servidor por AJAX
							// para comprobar si el login ya esta siendo utilizado
							var http = new XMLHttpRequest();

							// Preparar las condiciones para recibir la respuesta
							// enviada por el servidor, antes de enviar la peticion.
							http.onreadystatechange = function() {
								if (this.readyState === 4
										&& this.status === 200) {
									// La respuesta del servidor esta lista
									// para ser procesada
									document.getElementById("infologin").innerHTML = this.responseText;
								}
							};

							// Enviar la peticion al servidor
							http.open("POST", "AJAXloginController", true);
							http.setRequestHeader("Content-type",
									"application/x-www-form-urlencoded");
							http.send("login=" + loginValue);
						});
	</script>
	<script>
		function change() {
			if (document.getElementById("formLogin").style.display == "none") {
				document.getElementById("formLogin").style.display = "block";
				document.getElementById("formRegistro").style.display = "none";
			} else {
				document.getElementById("formLogin").style.display = "none";
				document.getElementById("formRegistro").style.display = "block";
			}
		}
	</script>
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