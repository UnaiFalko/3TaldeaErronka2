package modelo;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

	/**
	 * Atributuak deklaratzen duen metodo bat sortuko dugu
	 */


public class antzerkia {

	private String cif;
	private String izena;
	private String helbidea;
	
	
	/**
	 *Konstruktorea aldagai barik sortzen du
	 */
	
	public antzerkia() {
		super();
	}
	
	/**
	 * Konstruktorea aldagai guztiegaz sortzen ditu
	 * @param cif Antzerkia klasearen atributua
	 * @param izena Antzerkia klasearen atributua
	 * @param helbidea Antzerkia klasearen atributua
	 */
	
	public antzerkia(String cif, String izena, String helbidea) {
		super();
		this.cif = cif;
		this.izena = izena;
		this.helbidea = helbidea;
	}
	
	/**
	 * CIF-ren getterra
	 * @return CIF
	 */
	
	public String getCif() {
		return cif;
	}
	
	/**
	 * CIF-ren setterra
	 * @param cif Antzerkia klasearen atributua
	 */
	
	public void setCif(String cif) {
		this.cif = cif;
	}
	
	/**
	 * Izena-ren getterra
	 * @return izena
	 */
	public String getIzena() {
		return izena;
	}
	
	/**
	 * Izena-ren setterra
	 * @param izena Antzerkia klasearen atributua
	 */
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	/**
	 * Helbidea-ren getterra
	 * @return helbidea
	 */
	public String getHelbidea() {
		return helbidea;
	}
	
	/**
	 * Helbidea-ren setterra
	 * @param helbidea Antzerkia klasearen atributua
	 */
	
	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}
	
	/**
	 * Klasearen datuak erakusten ditu
	 */
	@Override
	public String toString() {
		return "antzerkia [cif=" + cif + ", izena=" + izena + ", helbidea=" + helbidea + "]";
	}
	
}
