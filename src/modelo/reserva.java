package modelo;

import javax.print.attribute.DateTimeSyntax;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

/**
 * Atributuak deklaratzen duen metodo bat sortuko dugu,kasu honetan reserva 
 */
public class reserva {

	private int id_sesion;
	private String nombre;
	private String apellido;
	private String dni;
	private String metodoPago;
	
	/**
	 * Konstruktorea atributu barik sortzen du
	 */
	public reserva() {
		super();
	}
	/**
	 * Konstruktorea atributu guztiekaz sortzen du
	 * @param id_sesion
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param metodoPago
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
	 * Id_sesion-em setterra
	 * @param id_sesion
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
	 * @param nombre
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
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 *Dni-ren getterra 
	 * @return DNI
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Dni-ren setterra
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * MetodoPago-ren getterra
	 * @return MetodoPago
	 */
	public String getMetodoPago() {
		return metodoPago;
	}
	/**
	 * MetodoPago-ren setterra
	 * @param metodoPago
	 */
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	/**
	 * Klaseen datuak bistaratzeko erabiltzen da
	 */
	@Override
	public String toString() {
		return "reserva [id_sesion=" + id_sesion + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", metodoPago=" + metodoPago + "]";
	}
	
}