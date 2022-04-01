package bodegas;

import java.time.LocalDate;

public class Arrendatario {
	private String nombre,rut,telefono;
	private LocalDate fechaNacimiento;
	
	
	public Arrendatario() {
		super();
	}


	public Arrendatario(String nombre, String rut, String telefono, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "Arrendatario [nombre=" + nombre + ", rut=" + rut + ", telefono=" + telefono + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	
}
