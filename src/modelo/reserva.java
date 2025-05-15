package modelo;

import javax.print.attribute.DateTimeSyntax;

public class reserva {

	private int id_sesion;
	private String nombre;
	private String apellido;
	private String dni;
	private String metodoPago;
	
	public reserva() {
		super();
	}

	public reserva(int id_sesion, String nombre, String apellido, String dni, String metodoPago) {
		super();
		this.id_sesion = id_sesion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.metodoPago = metodoPago;
	}

	public int getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(int id_sesion) {
		this.id_sesion = id_sesion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	@Override
	public String toString() {
		return "reserva [id_sesion=" + id_sesion + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", metodoPago=" + metodoPago + "]";
	}

	public static void add(reserva r) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
