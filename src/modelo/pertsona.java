package modelo;


/*
 * @author EkainKepaUnai
 * @version 1.0
 */

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

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
	
	
	
	public pertsona() {
		super();
	}


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


	public String getNAN() {
		return NAN;
	}


	public void setNAN(String nAN) {
		this.NAN = nAN;
	}


	public String getIzena() {
		return izena;
	}


	public void setIzena(String izena) {
		this.izena = izena;
	}


	public String getAbizena() {
		return abizena;
	}


	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}


	public String getRola() {
		return rola;
	}


	public void setRola(String rola) {
		this.rola = rola;
	}


	public String getEmaila() {
		return emaila;
	}


	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}


	public int getTelefonoa() {
		return telefonoa;
	}


	public void setTelefonoa(int telefonoa) {
		this.telefonoa = telefonoa;
	}


	public String getPasahitza() {
		return pasahitza;
	}


	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}


	@Override
	public String toString() {
		return "pertsona [NAN=" + NAN + ", izena=" + izena + ", abizena=" + abizena + ", rola=" + rola + ", emaila="
				+ emaila + ", telefonoa=" + telefonoa + ", pasahitza=" + pasahitza + "]";
	}
	
	
	
}


