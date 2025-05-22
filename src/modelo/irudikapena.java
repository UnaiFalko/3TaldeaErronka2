package modelo;

import java.sql.Date;
import java.sql.Time;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

	/**
	 * Atributuak deklaratzen duen metodo bat sortuko dugu
	 */


public class irudikapena {

	private int irudikapenID;
	private String antzerkiCIF;
	private int obraID;
	private Time ordua;
	private Date eguna;
	private int edukiera;
	
	/**
	 * Konstruktorea aldagai barik sortzen du
	 */
	public irudikapena() {
		super();
	}
	/**
	 * Konstruktorea aldagai guztixegaz sortzen du
	 * @param irudikapenID Irudikapen klasearen aldagaia
	 * @param antzerkiCIF Irudikapen klasearen aldagaia
	 * @param obraID Irudikapen klasearen aldagaia
	 * @param ordua Irudikapen klasearen aldagaia
	 * @param eguna Irudikapen klasearen aldagaia
	 * @param edukiera Irudikapen klasearen aldagaia
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
	 * IrudikapenID-ren getterra sortzen du
	 * @return irudikapenID
	 */
	public int getIrudikapenID() {
		return irudikapenID;
	}
	/**
	 * IrudikapenID-ren setterra
	 * @param irudikapenID Irudikapen klasearen aldagaia
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
	 * @param antzerkiCIF Irudikapen klasearen aldagaia
	 */
	public void setAntzerkiCIF(String antzerkiCIF) {
		this.antzerkiCIF = antzerkiCIF;
	}
	/**
	 * ObraID-ren getterra
	 * @return ObraID
	 */
	public int getObraID() {
		return obraID;
	}
	/**
	 * ObraID-ren setterra
	 * @param obraID Irudikapen klasearen aldagaia
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
	 * @param ordua Irudikapen klasearen aldagaia
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
	 * @param eguna Irudikapen klasearen aldagaia
	 */
	public void setEguna(Date eguna) {
		this.eguna = eguna;
	}
	/**
	 * Edukiera-ren getterra
	 * @return Edukiera
	 */
	public int getEdukiera() {
		return edukiera;
	}
	/**
	 * Edukiera-ren setterra
	 * @param edukiera Irudikapen klasearen aldagaia
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
