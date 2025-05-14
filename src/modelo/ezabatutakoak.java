package modelo;

import javax.print.attribute.DateTimeSyntax;

public class ezabatutakoak {

	private int ezabatutakoakID;
	private String taulakaltetua;
	private DateTimeSyntax ezabatutakoData;
	private String datuak;
	
	
	public ezabatutakoak() {
		super();
	}
	public ezabatutakoak(int ezabatutakoakID, String taulakaltetua, DateTimeSyntax ezabatutakoData, String datuak) {
		super();
		this.ezabatutakoakID = ezabatutakoakID;
		this.taulakaltetua = taulakaltetua;
		this.ezabatutakoData = ezabatutakoData;
		this.datuak = datuak;
	}
	public int getEzabatutakoakID() {
		return ezabatutakoakID;
	}
	public void setEzabatutakoakID(int ezabatutakoakID) {
		this.ezabatutakoakID = ezabatutakoakID;
	}
	public String getTaulakaltetua() {
		return taulakaltetua;
	}
	public void setTaulakaltetua(String taulakaltetua) {
		this.taulakaltetua = taulakaltetua;
	}
	public DateTimeSyntax getEzabatutakoData() {
		return ezabatutakoData;
	}
	public void setEzabatutakoData(DateTimeSyntax ezabatutakoData) {
		this.ezabatutakoData = ezabatutakoData;
	}
	public String getDatuak() {
		return datuak;
	}
	public void setDatuak(String datuak) {
		this.datuak = datuak;
	}
	@Override
	public String toString() {
		return "ezabatutakoak [ezabatutakoakID=" + ezabatutakoakID + ", taulakaltetua=" + taulakaltetua
				+ ", ezabatutakoData=" + ezabatutakoData + ", datuak=" + datuak + "]";
	}
}
