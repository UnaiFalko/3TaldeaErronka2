package modelo;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

/**
 * Atributuak deklaratzen duen metodo bat sortuko dugu,kasu honetan obra 
 */
public class obra {

	private int obraID;
	private String izena;
	private String deskribapena;
	private boolean interaktiboa;
	
	/**
	 * Konstruktorea irekitzen da atributu barik
	 */
	public obra() {
		super();
	}
	/**
	 * Konstruktorea irekitzen da atributu guztiekaz
	 * @param obraID
	 * @param izena
	 * @param deskribapena
	 * @param interaktiboa
	 */
	public obra(int obraID, String izena, String deskribapena, boolean interaktiboa) {
		super();
		this.obraID = obraID;
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.interaktiboa = interaktiboa;
	}
	/**
	 * ObraId-ren getterra
	 * @return ObraId
	 */
	public int getObraID() {
		return obraID;
	}
	/**
	 * ObraId-ren setterra
	 * @param obraID
	 */
	public void setObraID(int obraID) {
		this.obraID = obraID;
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
	 * Deskribapena-ren getterra
	 * @return Deskribapena
	 */
	public String getDeskribapena() {
		return deskribapena;
	}
	/**
	 * Deskribapena-ren setterra
	 * @param deskribapena
	 */
	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}
		
	public boolean isInteraktiboa() {
		return interaktiboa;
	}
	/**
	 * Interaktiboa-ren setterra
	 * @param interaktiboa
	 */
	public void setInteraktiboa(boolean interaktiboa) {
		this.interaktiboa = interaktiboa;
	}
	/**
	 * Klasearen datuak bistaratzen ditu.
	 */
	@Override
	public String toString() {
		return "obra [obraID=" + obraID + ", izena=" + izena + ", deskribapena=" + deskribapena + ", interaktiboa="
				+ interaktiboa + "]";
	}
}