package modelo;

import java.sql.Date;
import java.sql.Time;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class irudikapena {

	private int irudikapenID;
	private String antzerkiCIF;
	private int obraID;
	private Time ordua;
	private Date eguna;
	private int edukiera;
	
	/**
	 * Konstruktorea parametro barik zabaltzen du.
	 */
	public irudikapena() {
		super();
	}
	/**
	 * Konstruktorea parametro guztiekaz zabaltzen du.
	 * @param irudikapenID
	 * @param antzerkiCIF
	 * @param obraID
	 * @param ordua
	 * @param eguna
	 * @param edukiera
	 */
	public irudikapena(int irudikapenID, String antzerkiCIF, int obraID, Time ordua, Date eguna, int edukiera) {
		super();
		this.irudikapenID = irudikapenID;
		this.antzerkiCIF = antzerkiCIF;
		this.obraID = obraID;
		this.ordua = ordua;
		this.eguna = eguna;
		this.edukiera = edukiera;
	}
	/**
	 * IrudikapenId-ren getterra
	 * @return IrudikapenId
	 */
	public int getIrudikapenID() {
		return irudikapenID;
	}
	/**
	 * IrudikapenId-ren setterra
	 * @param irudikapenID
	 */
	public void setIrudikapenID(int irudikapenID) {
		this.irudikapenID = irudikapenID;
	}
	/**
	 * AntzerkiCIF-ren getterra
	 * @return AntzerkiCIF
	 */
	public String getAntzerkiCIF() {
		return antzerkiCIF;
	}
	/**
	 * AntzerkiCIF-ren setterra
	 * @param antzerkiCIF
	 */
	public void setAntzerkiCIF(String antzerkiCIF) {
		this.antzerkiCIF = antzerkiCIF;
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
	 * Ordua-ren getterra
	 * @return Ordua
	 */
	public Time getOrdua() {
		return ordua;
	}
	/**
	 * Ordua-ren setterra
	 * @param ordua
	 */
	public void setOrdua(Time ordua) {
		this.ordua = ordua;
	}
	/**
	 * Eguna-ren getterra
	 * @return Eguna
	 */
	public Date getEguna() {
		return eguna;
	}
	/**
	 * Eguna-ren setterra
	 * @param eguna
	 */
	public void setEguna(Date eguna) {
		this.eguna = eguna;
	}
	/**
	 * Edukiera-ren getterra
	 * @return
	 */
	public int getEdukiera() {
		return edukiera;
	}
	/**
	 * Edukiera-ren setterra
	 * @param edukiera
	 */
	public void setEdukiera(int edukiera) {
		this.edukiera = edukiera;
	}
	
	/**
	 * Klasearen datuak erakusten ditu
	 */
	@Override
	public String toString() {
		return "irudikapena [irudikapenID=" + irudikapenID + ", antzerkiCIF=" + antzerkiCIF + ", obraID=" + obraID
				+ ", ordua=" + ordua + ", eguna=" + eguna + ", edukiera=" + edukiera + "]";
	}
	
}
