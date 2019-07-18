package modelo;

import java.applet.Applet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Modelo
 */
@Stateless
@LocalBean
public class Modelo extends Applet {
	private Usuario usuario;
	private Boolean loginExistente;
	private List<Usuario> usuarios;
	private List<Departamento> departamentos;
	private List<Empleado> empleados;
	private List<Telefono> telefonos;
	private List<Correo> correos;
	private List<DatosEmpleado> datosEmpleado;

    public Boolean getLoginExistente(String login) {
    	loginExistente = false;    	
    	// Hay que instanciar a la capa de datos
    	// para consultar a la base de datos
    	DBConnection dbConnection;
    	dbConnection = new DBConnection("dleong", "Temp3000$$");
    	
    	try {
			ResultSet rs = dbConnection.getLogginRecord(login);
			if(rs.next()) {
				loginExistente = true;
			} else {
				loginExistente = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
		return loginExistente;
	}

	public void setLoginExistente(Boolean logginExistente) {
		this.loginExistente = logginExistente;
	}

	/**
     * Default constructor. 
     */
    public Modelo() {
        // TODO Auto-generated constructor stub
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		// this.usuario = usuario;
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		try {
			dbConnection.insertaUsuario(usuario);
	
			// Recuperar todos los usuarios existentes
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Usuario> getUsuarios() {
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		usuarios = new ArrayList<>();
		
		try {
			ResultSet rs = dbConnection.getUsuarios();
			while(rs.next()) {
				usuarios.add(new Usuario(rs.getString("nombre"),
						rs.getString("login"),
						rs.getString("password")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void setVuelo(Departamento departamento) {
		// this.usuario = usuario;
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		try {
			dbConnection.insertaVuelo(departamento);
	
			// Recuperar todos los usuarios existentes
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Departamento> getVuelos() {
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		departamentos = new ArrayList<>();
		
		try {
			ResultSet rs = dbConnection.getVuelos();
			while(rs.next()) {
				departamentos.add(new Departamento(rs.getInt("id"),
						rs.getString("destino"),
						LocalDateTime.parse(rs.getString("fechaHoraSalida"), formatter),
						LocalDateTime.parse(rs.getString("fechaHoraSalida"), formatter),
						rs.getInt("totalPasajeros")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return departamentos;
	}
	
	public void setPasajero(Empleado empleado) {
		// this.usuario = usuario;
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		try {
			dbConnection.insertaPasajero(empleado);
	
			// Recuperar todos los usuarios existentes
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Empleado> getPasajeros() {
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		empleados = new ArrayList<>();
		
		try {
			ResultSet rs = dbConnection.getUsuarios();
			while(rs.next()) {
				empleados.add(new Empleado(rs.getInt("idVuelo"),
						rs.getString("nombre"),
						rs.getString("primerApellido"),
						rs.getString("segundoApellido"),
						rs.getInt("telefono"),
						rs.getString("correo")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empleados;
	}
	
	public void setTelefono(Telefono telefono) {
		// this.usuario = usuario;
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		try {
			dbConnection.insertaTelefono(telefono);
	
			// Recuperar todos los usuarios existentes
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Telefono> getTelefonos() {
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		telefonos = new ArrayList<>();
		
		try {
			ResultSet rs = dbConnection.getUsuarios();
			while(rs.next()) {
				telefonos.add(new Telefono(rs.getInt("idPasajero"),
						rs.getInt("telefono"),
						rs.getInt("tipo")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return telefonos;
	}
	
	public void setCorreo(Correo correo) {
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		try {
			dbConnection.insertaCorreo(correo);
	
			// Recuperar todos los usuarios existentes
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Correo> getCorreos() {
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		correos = new ArrayList<>();
		
		try {
			ResultSet rs = dbConnection.getUsuarios();
			while(rs.next()) {
				correos.add(new Correo(rs.getInt("idPasajero"),
						rs.getString("correo")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return correos;
	}

	
	public List<DatosEmpleado> getDatosEmpleados() {
		DBConnection dbConnection;
		dbConnection = new DBConnection("dleong", "Temp3000$$");
		
		datosEmpleado = new ArrayList<>();
		
		try {
			ResultSet rs = dbConnection.getDatosEmpleados();
			while(rs.next()) {
				datosEmpleado.add(rs.getString("nombre"), rs.getString("apellido1"), rs.getString("apellido2"), rs.getString("telefono"), rs.getString("DNI"),
						rs.getString("descripcion"), rs.getString("nick"), rs.getString("correo"), rs.getDouble("salario"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datosEmpleado;
	}
}












