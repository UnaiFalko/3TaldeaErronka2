package modelo;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

/**
 * Atributuak deklaratzen duen metodo bat sortuko dugu
 */

public class obra {

	private int obraID;
	private String izena;
	private String deskribapena;
	private boolean interaktiboa;
	
	/**
	 * Konstruktorea aldagai barik sortzen du
	 */
	public obra() {
		super();
	}
	/**
	 * Konstruktorea aldagai guztixegaz sortzen du
	 * @param obraID Obraren aldagaia
	 * @param izena Obraren aldagaia
	 * @param deskribapena Obraren aldagaia
	 * @param interaktiboa Obraren aldagaia
	 */
	public obra(int obraID, String izena, String deskribapena, boolean interaktiboa) {
		super();
		this.obraID = obraID;
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.interaktiboa = interaktiboa;
	}
	/**
	 * Obra-ren getterra
	 * @return obraID
	 */
	public int getObraID() {
		return obraID;
	}
	/**
	 * ObraID-ren setterra
	 * @param obraID Obra-ren atributua
	 */
	public void setObraID(int obraID) {
		this.obraID = obraID;
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
	 * @param izena Obra-ren atributua
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}
	/**
	 * Izena-ren getterra
	 * @return deskribapena
	 */
	public String getDeskribapena() {
		return deskribapena;
	}
	/**
	 * Deskribapena-ren setterra
	 * @param deskribapena Obra-ren atributua
	 */
	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}
	/**
	 * 
	 * @return interaktiboa
	 */
	public boolean isInteraktiboa() {
		return interaktiboa;
	}
	/**
	 * 
	 * @param interaktiboa
	 */
	public void setInteraktiboa(boolean interaktiboa) {
		this.interaktiboa = interaktiboa;
	}
	/**
	 * Klaseen datuak erakusten ditu
	 */
	@Override
	public String toString() {
		return "obra [obraID=" + obraID + ", izena=" + izena + ", deskribapena=" + deskribapena + ", interaktiboa="
				+ interaktiboa + "]";
	}
}
