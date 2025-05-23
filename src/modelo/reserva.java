package modelo;

import javax.print.attribute.DateTimeSyntax;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

/**
 * Atributuak deklaratzen duen metodo bat sortuko dugu
 */

public class reserva {

	private int id_sesion;
	private String nombre;
	private String apellido;
	private String dni;
	private String metodoPago;
	
	/**
	 * Konstruktorea sortzen da atributu barik
	 */
	public reserva() {
		super();
	}
	/**
	 * Konstruktorea sortzen da atributu guztixegaz
	 * @param id_sesion Reserva-ren atributua
	 * @param nombre Reserva-ren atributua
	 * @param apellido Reserva-ren atributua
	 * @param dni Reserva-ren atributua
	 * @param metodoPago Reserva-ren atributua
	 */
	public reserva(int id_sesion, String nombre, String apellido, String dni, String metodoPago) {
		super();
		this.id_sesion = id_sesion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.metodoPago = metodoPago;
	}
	/**
	 * Id_sesion-en getterra
	 * @return Id_sesion
	 */
	public int getId_sesion() {
		return id_sesion;
	}
	/**
	 * Id-sesion-en setterra
	 * @param id_sesion Reserva-ren atributua
	 */
	public void setId_sesion(int id_sesion) {
		this.id_sesion = id_sesion;
	}
	/**
	 * Nombre-ren getterra
	 * @return Nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Nombre-ren setterra
	 * @param nombre Reserva-ren atributua
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Apellido-ren getterra
	 * @return Apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Apellido-ren setterra
	 * @param apellido Reserva-ren atributua
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * DNI-gettera
	 * @return DNI
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * DNI-ren setterra
	 * @param dni Reserva-ren atributua
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * DNI-ren setterra
	 * @return DNI
	 */
	public String getMetodoPago() {
		return metodoPago;
	}
	/**
	 * MetodoPago-ren setterra
	 * @param metodoPago Reserva-ren atributua
	 */
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	/**
	 * Klasearen datuak bistaratzeko balio du
	 */
	@Override
	public String toString() {
		return "reserva [id_sesion=" + id_sesion + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", metodoPago=" + metodoPago + "]";
	}
	
}