package modelo;

import javax.print.attribute.DateTimeSyntax;

/**
 * Atributuak deklaratzen duen metodo bat sortuko dugu
 */


public class ezabatutakoak {

	private int ezabatutakoakID;
	private String taulakaltetua;
	private DateTimeSyntax ezabatutakoData;
	private String datuak;
	
	/**
	 * Konstruktorea aldagai barik zabaltzen du
	 */
	public ezabatutakoak() {
		super();
	}
	/**
	 * Konstruktorea aldagai guztiekaz zabaltzen du
	 * @param ezabatutakoakID Ezabatutakoak klasearen atributua
	 * @param taulakaltetua Ezabatutakoak klasearen atributua
	 * @param ezabatutakoData Ezabatutakoak klasearen atributua
	 * @param datuak Ezabatutakoak klasearen atributua
	 */
	public ezabatutakoak(int ezabatutakoakID, String taulakaltetua, DateTimeSyntax ezabatutakoData, String datuak) {
		super();
		this.ezabatutakoakID = ezabatutakoakID;
		this.taulakaltetua = taulakaltetua;
		this.ezabatutakoData = ezabatutakoData;
		this.datuak = datuak;
	}
	/**
	 * EzabatutakoakId-aren getterra
	 * @return ezabatutakoakId
	 */
	public int getEzabatutakoakID() {
		return ezabatutakoakID;
	}
	/**
	 * EzabatutakoakId-aren setterra
	 * @param ezabatutakoakID Ezabatutakoak klasearen atributua
	 */
	public void setEzabatutakoakID(int ezabatutakoakID) {
		this.ezabatutakoakID = ezabatutakoakID;
	}
	/**
	 * TaulaKaltetua-ren getterra
	 * @return TaulaKaltetua
	 */
	public String getTaulakaltetua() {
		return taulakaltetua;
	}
	/**
	 * TaulaKaltetua-ren setterra
	 * @param taulakaltetua Ezabatutakoak klasearen atributua
	 */
	public void setTaulakaltetua(String taulakaltetua) {
		this.taulakaltetua = taulakaltetua;
	}
	/**
	 * EzabatutakoData-ren getterra
	 * @return EzabatutakoData
	 */
	public DateTimeSyntax getEzabatutakoData() {
		return ezabatutakoData;
	}
	/**
	 * EzabatutakoData-ren setterra
	 * @param ezabatutakoData Ezabatutakoak klasearen atributua
	 */
	public void setEzabatutakoData(DateTimeSyntax ezabatutakoData) {
		this.ezabatutakoData = ezabatutakoData;
	}
	/**
	 * Datuak-ren getterra
	 * @return Datuak
	 */ 
	public String getDatuak() {
		return datuak;
	}
	/**
	 * Datuak-ren setterra
	 * @param datuak Ezabatutakoak klasearen atributua
	 */
	public void setDatuak(String datuak) {
		this.datuak = datuak;
	}
	/**
	 * Klasearen datuak erakusten ditu
	 */
	@Override
	public String toString() {
		return "ezabatutakoak [ezabatutakoakID=" + ezabatutakoakID + ", taulakaltetua=" + taulakaltetua
				+ ", ezabatutakoData=" + ezabatutakoData + ", datuak=" + datuak + "]";
	}
}