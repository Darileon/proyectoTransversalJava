package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Modelo;

/**
 * Servlet implementation class AJAXLoginController
 */
@WebServlet("/AJAXLoginController")
public class AJAXLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AJAXLoginController() {
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
		String login = request.getParameter("login");
		
		// Instanciar el modelo, para comprobar si el loggin existe
		// en la tabla de usuarios.
		Modelo modelo;
		modelo = new Modelo();
		
		String mensajeDeRespuesta;
		
		if(modelo.getLoginExistente(login)) {
			mensajeDeRespuesta = "LoginExistente";
		} else {
			mensajeDeRespuesta = "El login no esta siendo utilizado "
					+ "por ningun usuario todavia";
		}
		
		// Enviar la respuesta al cliente (Al navegar)
		PrintWriter out = response.getWriter();
		
		out.print(mensajeDeRespuesta);
	}

}












