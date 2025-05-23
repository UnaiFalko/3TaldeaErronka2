package modelo;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */


import java.sql.Date;
import java.sql.Time;

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
	
	
	public irudikapena() {
		super();
	}
	public irudikapena(int irudikapenID, String antzerkiCIF, int obraID, Time ordua, Date eguna, int edukiera) {
		super();
		this.irudikapenID = irudikapenID;
		this.antzerkiCIF = antzerkiCIF;
		this.obraID = obraID;
		this.ordua = ordua;
		this.eguna = eguna;
		this.edukiera = edukiera;
	}
	public int getIrudikapenID() {
		return irudikapenID;
	}
	public void setIrudikapenID(int irudikapenID) {
		this.irudikapenID = irudikapenID;
	}
	public String getAntzerkiCIF() {
		return antzerkiCIF;
	}
	public void setAntzerkiCIF(String antzerkiCIF) {
		this.antzerkiCIF = antzerkiCIF;
	}
	public int getObraID() {
		return obraID;
	}
	public void setObraID(int obraID) {
		this.obraID = obraID;
	}
	public Time getOrdua() {
		return ordua;
	}
	public void setOrdua(Time ordua) {
		this.ordua = ordua;
	}
	public Date getEguna() {
		return eguna;
	}
	public void setEguna(Date eguna) {
		this.eguna = eguna;
	}
	public int getEdukiera() {
		return edukiera;
	}
	public void setEdukiera(int edukiera) {
		this.edukiera = edukiera;
	}
	@Override
	public String toString() {
		return "irudikapena [irudikapenID=" + irudikapenID + ", antzerkiCIF=" + antzerkiCIF + ", obraID=" + obraID
				+ ", ordua=" + ordua + ", eguna=" + eguna + ", edukiera=" + edukiera + "]";
	}
	
}
