package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	private final int legajo; 
	private String puesto;
	private static int contadorLegajo = 1000;

	// Constructor vacio
	public Empleado() {
		super();
		this.legajo = contadorLegajo;
		contadorLegajo++;
	}
		
	// Segundo constructor con parámetros
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
		this.legajo = contadorLegajo;
		contadorLegajo++;
	}
	
	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return puesto;
	}

	public static int devuelveProximoLegajo() {
		return contadorLegajo;
	}
	
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + "] " + super.toString();
	}
	
}