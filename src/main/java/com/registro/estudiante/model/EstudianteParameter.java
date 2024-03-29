package com.registro.estudiante.model;

public class EstudianteParameter {
	public Integer codigo;
	public String dni;
	public String nombre;
	public String apellido;
	public String telefono;

	public EstudianteParameter(Integer codigo, String dni, String nombre, String apellido, String telefono) {
		this.codigo = codigo;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
}