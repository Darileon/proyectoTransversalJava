package modelo;

public class Empleado {
	
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private int idDep;
	private boolean jefeDep;
	private int telefono;
	private double salario;
	
	public Empleado(int id, String nombre, String apellido1, String apellido2, String dni, int idDep, boolean jefeDep,
			int telefono, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.idDep = idDep;
		this.jefeDep = jefeDep;
		this.telefono = telefono;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public boolean isJefeDep() {
		return jefeDep;
	}

	public void setJefeDep(boolean jefeDep) {
		this.jefeDep = jefeDep;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
