package modelo;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;


/*
 * @author EkainKepaUnai
 * @version 1.0
 */

/**
 * Atributuak deklaratzen duen metodo bat sortuko dugu
 */

public class pertsona {

	private String NAN;
	private String izena;
	private String abizena;
	private String rola;
	private String emaila;
	private int telefonoa;
	private String pasahitza;
	
	
	/**
	 * Konstruktorea aldagai barik sortzen du
	 */
	public pertsona() {
		super();
	}

	/**
	 * Konstruktorea aldagai guztixegaz sortzen du
	 * @param nAN Pertsonaren atributoa
	 * @param izena Pertsonaren atributoa
	 * @param abizena Pertsonaren atributoa
	 * @param rola Pertsonaren atributoa
	 * @param emaila Pertsonaren atributoa
	 * @param telefonoa Pertsonaren atributoa
	 * @param pasahitza Pertsonaren atributoa
	 */
	public pertsona(String nAN, String izena, String abizena, String rola, String emaila, int telefonoa,
			String pasahitza) {
		super();
		NAN = nAN;
		this.izena = izena;
		this.abizena = abizena;
		this.rola = rola;
		this.emaila = emaila;
		this.telefonoa = telefonoa;
		this.pasahitza = pasahitza;
	}

	/**
	 * NAN-ren getterra
	 * @return NAN
	 */
	public String getNAN() {
		return NAN;
	}

	/**
	 * NAN-ren setterra
	 * @param nAN Pertsonaren atributoa
	 */
	public void setNAN(String nAN) {
		this.NAN = nAN;
	}

	/**
	 * Izena-ren getterra
	 * @return Izena
	 */
	public String getIzena() {
		return izena;
	}

	/**
	 * Izena-ren setterra
	 * @param izena Pertsonaren atributoa
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}

	/**
	 * Abizena-ren getterra
	 * @return Abizena
	 */
	public String getAbizena() {
		return abizena;
	}

	/**
	 * Abizena-ren setterra
	 * @param abizena Pertsonaren atributoa
	 */
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	/**
	 * Rola-ren getterra
	 * @return Rola
	 */
	public String getRola() {
		return rola;
	}

	/**
	 * Rola-ren setterra
	 * @param rola Pertsonaren atributoa
	 */
	public void setRola(String rola) {
		this.rola = rola;
	}

	/**
	 * Emaila-ren getterra
	 * @return Emaila
	 */
	public String getEmaila() {
		return emaila;
	}

	/**
	 * Emaila-ren setterra
	 * @param emaila Pertsonaren atributoa
	 */
	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}

	/**
	 * Telefonoaren-getterra
	 * @return Telefonoa
	 */
	public int getTelefonoa() {
		return telefonoa;
	}

	/**
	 * Telefonoa-ren setterra
	 * @param telefonoa Pertsonaren atributoa
	 */
	public void setTelefonoa(int telefonoa) {
		this.telefonoa = telefonoa;
	}

	/**
	 * Pasahitza-ren getterra
	 * @return Pasahitza
	 */
	public String getPasahitza() {
		return pasahitza;
	}

	/**
	 * Pasahitza-ren setterra
	 * @param pasahitza Pertsonaren atributoa
	 */
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	/**
	 * Klasearen datuak bistaratzeko balio du
	 */
	@Override
	public String toString() {
		return "pertsona [NAN=" + NAN + ", izena=" + izena + ", abizena=" + abizena + ", rola=" + rola + ", emaila="
				+ emaila + ", telefonoa=" + telefonoa + ", pasahitza=" + pasahitza + "]";
	}
	
	
	
}


