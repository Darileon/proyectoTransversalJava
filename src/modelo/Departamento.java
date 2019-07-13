package modelo;

import java.time.LocalDateTime;

public class Departamento {
	
	private int id;
	private String nombre;
	private int idJefe;
	private String descripcion;
	
	public Departamento(int id, String nombre, int idJefe) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idJefe = idJefe;
	}

	public Departamento(int id, String nombre, int idJefe, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idJefe = idJefe;
		this.descripcion = descripcion;
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

	public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}

