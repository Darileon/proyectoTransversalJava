package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.TimeZone;

// La clase siguientes implementa el acceso 
// a  base de datos utilizando el protocolo
// JDBC (Java Data Base Connectivity),
// que es una capa de abstraccion de SQL,
// que permite conectarnos a diferentes sistemas
// de gestion de bases de datos, solo con 
// cambiar la URL de conexion y el driver de
// conexion a la base de datos
public class DBConnection {
	private String usario;
	private String password;
	private static final String DATE_FORMATTER = "yyyy-MM-dd HH:mm:ss";

	// Si todo va bien, devuelve un objeto de conexion con
	// la base de datos especificada
	private Connection conn;

	public DBConnection(String usario, String password) {
		super();
		this.usario = usario;
		this.password = password;
	}

	// Metodo que devuelve la conexion a la base de datos
	public Connection getConexion() throws ClassNotFoundException {
		conn = null;
		String urlConexion;
		urlConexion = "jdbc:mysql://localhost:3306/empresa?" + "serverTimezone=" + TimeZone.getDefault().getID();

		Properties infoConexion;
		infoConexion = new Properties();

		infoConexion.put("user", this.usario);
		infoConexion.put("password", this.password);

		try {
			// Registrar el driver de conexion a la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(urlConexion, infoConexion);
			System.out.println("Conexion establecida con la base de datos vuelos");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	// Metodo que recupere el registro asociado a un loggin
	// concreto
	public ResultSet getLogginRecord(String login) throws SQLException {
		ResultSet rs = null;
		String query = "SELECT * \n" + "FROM empresa.usuario\n" + "WHERE nick = ?";

		PreparedStatement stmt;

		try {
			conn = getConexion();
			stmt = conn.prepareStatement(query);
			stmt.setString(1, login);
			rs = stmt.executeQuery();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

	// Metodo para insertar un usuario en la base de datos
	public void insertaUsuario(Usuario usuario) throws SQLException {
		String query = "INSERT INTO `empresa`.`usuario` " + "(`nombre`, `nick`, `password`, `idEmpleado`, `correo`) VALUES " + "(?, ?, ?, ?, ?)";
		PreparedStatement stmt;

		try {
			conn = getConexion();
			stmt = conn.prepareStatement(query);
			stmt.setString(1, usuario.getNombre());
			stmt.setString(2, usuario.getNick());
			stmt.setString(3, usuario.getPassword());
			stmt.setInt(4, usuario.getIdEmpleado());
			stmt.setString(5, usuario.getCorreo());
			stmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodo para recuperar todos los usuarios
	public ResultSet getUsuarios() throws SQLException {
		ResultSet rs = null;
		String query = "SELECT * FROM vuelos.usuarios";

		Statement stmt;

		try {
			conn = getConexion();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

	// Metodo para insertar un vuelo en la base de datos
	public void insertaVuelo(Departamento departamento) throws SQLException {
		String query = "INSERT INTO `vuelos`.`vuelos` (`destino`, `fechaHoraSalida`, `fechaHoraLlegada`, `totalPasajeros`) "
				+ "VALUES (?, ?, ?, ?)";
		PreparedStatement stmt;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);

		try {
			conn = getConexion();
			stmt = conn.prepareStatement(query);
			stmt.setString(1, departamento.getDestino());
			stmt.setString(2, departamento.getFechaLlegada().format(formatter));
			stmt.setString(3, departamento.getFechaSalida().format(formatter));
			stmt.setInt(4, departamento.getTotalPasajeros());
			stmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodo para recuperar todos los vuelos
	public ResultSet getVuelos() throws SQLException {
		ResultSet rs = null;
		String query = "SELECT * FROM vuelos.vuelos";

		Statement stmt;

		try {
			conn = getConexion();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

	// Metodo para insertar un pasajero en la base de datos
	public void insertaPasajero(Empleado empleado) throws SQLException {
		String query = "INSERT INTO `vuelos`.`pasajeros` "
				+ "(`idVuelo`, `nombre`, `primerApellido`, `segundoApellido`, `telefono`, `correo`) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);

		try {
			conn = getConexion();
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, empleado.getIdVuelo());
			stmt.setString(2, empleado.getNombre());
			stmt.setString(3, empleado.getPrimApellido());
			stmt.setString(4, empleado.getSegApellido());
			stmt.setInt(5, empleado.getTelefono());
			stmt.setString(6, empleado.getCorreo());
			stmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodo para recuperar todos los pasajeros
	public ResultSet getPasajeros() throws SQLException {
		ResultSet rs = null;
		String query = "SELECT * FROM vuelos.pasajeros";

		Statement stmt;

		try {
			conn = getConexion();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

	// Metodo para insertar un telefono en la base de datos
	public void insertaTelefono(Telefono telefono) throws SQLException {
		String query = "INSERT INTO `vuelos`.`telefono` (`idPasajero`, `numero`, `tipo`) VALUES (?, ?, ?)";
		PreparedStatement stmt;

		try {
			conn = getConexion();
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, telefono.getIdPasajero());
			stmt.setInt(2, telefono.getNumero());
			stmt.setInt(3, telefono.getTipo());
			stmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodo para recuperar todos los telefonos
	public ResultSet getTelefonos() throws SQLException {
		ResultSet rs = null;
		String query = "SELECT * FROM vuelos.telefono";

		Statement stmt;

		try {
			conn = getConexion();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

	// Metodo para insertar un correo en la base de datos
	public void insertaCorreo(Correo correo) throws SQLException {
		String query = "INSERT INTO `vuelos`.`correos` (`idPasajero`, `correo`) VALUES (?, ?)";
		PreparedStatement stmt;

		try {
			conn = getConexion();
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, correo.getIdPasajero());
			stmt.setString(2, correo.getCorreo());
			stmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodo para recuperar todos los correos
	public ResultSet getCorreos() throws SQLException {
		ResultSet rs = null;
		String query = "SELECT * FROM vuelos.correos";

		Statement stmt;

		try {
			conn = getConexion();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}
}
