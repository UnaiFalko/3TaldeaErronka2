package modelo;

	/*
     * @author EkainKepaUnai  
     * @version 1.0
     */

import javax.print.attribute.DateTimeSyntax;


	/**
	 * Atributuak deklaratzen duen metodo bat sortuko dugu
	 */

public class eguneratua  {

	private int eguneraketaID;
	private String taulakaltetua;
	private DateTimeSyntax eguneraketaData;
	private String datuak;
	
	/*
	 *Eguneratua konstruktorea zabaltzen du,aldagai barik
	 */
	public eguneratua() {
		super();
	}
	
	/**
	 * Eguneratua konstruktorea zabaltzen du,aldagai guztiekaz
	 * @param eguneraketaID Eguneratua klasearen atributua
	 * @param taulakaltetua Eguneratua klasearen atributua
	 * @param eguneraketaData Eguneratua klasearen atributua
	 * @param datuak Eguneratua klasearen atributua
	 */
	public eguneratua(int eguneraketaID, String taulakaltetua, DateTimeSyntax eguneraketaData, String datuak) {
		super();
		this.eguneraketaID = eguneraketaID;
		this.taulakaltetua = taulakaltetua;
		this.eguneraketaData = eguneraketaData;
		this.datuak = datuak;
	}
	
	 /**
	 * EguneraketaId-ren getterra
	 * @return eguneraketaID 
	 */
	
	public int getEguneraketaID() {
		return eguneraketaID;
	}
	
	 /**
	  * EguneraketaID-ren setterra
	  * @param eguneraketaID Eguneratua klasearen atributua
	  */
	public void setEguneraketaID(int eguneraketaID) {
		this.eguneraketaID = eguneraketaID;
	}
	
	/**
	 * Taulakaltetua-ren getterra
	 * @return taulakaltetua 
	 */
	public String getTaulakaltetua() {
		return taulakaltetua;
	}
	
	/**
	 * Taulakaltetua-ren setterra
	 * @param taulakaltetua Eguneratua klasearen atributua
	 */
	
	public void setTaulakaltetua(String taulakaltetua) {
		this.taulakaltetua = taulakaltetua;
	}
	
	/**
	 * EguneraketaDataren getterra
	 * @return eguneraketaData 
	 */ 
	
	public DateTimeSyntax getEguneraketaData() {
		return eguneraketaData;
	}
	
	/**
	 * EguneraketaData-ren setterra
	 * @param eguneraketaData Eguneratua klasearen atributua
	 */
	
	public void setEguneraketaData(DateTimeSyntax eguneraketaData) {
		this.eguneraketaData = eguneraketaData;
	}
	
	/**
	 * Datuak-ren getterra
	 * @return datuak 
	 */
	
	public String getDatuak() {
		return datuak;
	}
	
	/**
	 * Datuak-ren setterra
	 * @param datuak Eguneratua klasearen atributua
	 */
	
	public void setDatuak(String datuak) {
		this.datuak = datuak;
	}
	
	/**
	 * Klasearen datuak erakusten ditu
	 */
	
	@Override
	public String toString() {
		return "eguneratua [eguneraketaID=" + eguneraketaID + ", taulakaltetua=" + taulakaltetua + ", eguneraketaData="
				+ eguneraketaData + ", datuak=" + datuak + "]";
	}
}
