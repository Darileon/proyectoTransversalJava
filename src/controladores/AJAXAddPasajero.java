package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import modelo.Correo;
import modelo.Modelo;
import modelo.Empleado;
import modelo.Telefono;
import modelo.Usuario;

/**
 * Servlet implementation class AJAXRegistraUsuario
 */
@WebServlet("/AJAXAddPasajero")
public class AJAXAddPasajero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AJAXAddPasajero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("Content-Type: application/json; "
				+ "charset=UTF-8");
		
		// Java no entiende el formato de JSON, 
		// por lo cual se utiliza
		// la biblioteca de Google GSON
		Empleado empleado;
		
		Gson gson = new Gson();
		
		empleado = gson.fromJson(request.getParameter("pasajero"), 
				              Empleado.class);
		
		// Ahora ya tenemos el dato recibido, en JSON, convertido
		// a un objeto de Java
		// Y lo que sigue es insertarlo en la tabla correspondiente
		Modelo modelo = new Modelo();
		
		modelo.setPasajero(empleado);
		
		List <Empleado> lista = modelo.getPasajeros();
		
		int last = lista.size() - 1;
		
		modelo.setCorreo(new Correo(lista.get(last).getId(),empleado.getCorreo()));
		
		modelo.setTelefono(new Telefono(lista.get(last).getId(),empleado.getTelefono(),1));
		
		List<Empleado> empleados = modelo.getPasajeros();
		
		PrintWriter out = response.getWriter();
		
		out.print(gson.toJson(empleados));
		
	}

}










