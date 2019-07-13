package modelo;

// POJO (Plain Old Java Object)
public class Usuario {
	
	private String nombre;
	private String nick;
	private String password;
	private int idEmpleado;
	private String correo;

	public Usuario(String nombre, String nick, String password, int idEmpleado, String correo) {
		super();
		this.nombre = nombre;
		this.nick = nick;
		this.password = password;
		this.idEmpleado = idEmpleado;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
