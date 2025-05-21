package modelo;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

/**
 * Atributuak deklaratzen duen metodo bat sortuko dugu,kasu honetan pertsona 
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
	 * Konstruktorea parametro barik zabaltzen du
	 */
	public pertsona() {
		super();
	}

	/**
	 * Konstruktorea parametro guztiekaz zabaltzen du
	 * @param nAN
	 * @param izena
	 * @param abizena
	 * @param rola
	 * @param emaila
	 * @param telefonoa
	 * @param pasahitza
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
	 * @param NAN
	 */
	public void setNAN(String nAN) {
		NAN = nAN;
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
	 * @param izena
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
	 * @param abizena
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
	 * @param rola
	 */
	public void setRola(String rola) {
		this.rola = rola;
	}

	/**
	 * Emaila-ren getterra
	 * @return Email
	 */
	public String getEmaila() {
		return emaila;
	}

	/**
	 * Emaila-ren setterra
	 * @param emaila
	 */
	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}

	/**
	 * Telefonoa-ren getterra
	 * @return Telefonoa
	 */
	public int getTelefonoa() {
		return telefonoa;
	}

	/**
	 * Telefonoa-ren setterra
	 * @param telefonoa
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
	 * @param pasahitza
	 */
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	/**
	 * Klasearen datuak bistaratzen ditu
	 */
	@Override
	public String toString() {
		return "pertsona [NAN=" + NAN + ", izena=" + izena + ", abizena=" + abizena + ", rola=" + rola + ", emaila="
				+ emaila + ", telefonoa=" + telefonoa + ", pasahitza=" + pasahitza + "]";
	}
	
}