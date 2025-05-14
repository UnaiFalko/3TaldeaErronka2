package modelo;

import javax.print.attribute.DateTimeSyntax;

public class eguneratua {

	private int eguneraketaID;
	private String taulakaltetua;
	private DateTimeSyntax eguneraketaData;
	private String datuak;
	public eguneratua() {
		super();
	}
	public eguneratua(int eguneraketaID, String taulakaltetua, DateTimeSyntax eguneraketaData, String datuak) {
		super();
		this.eguneraketaID = eguneraketaID;
		this.taulakaltetua = taulakaltetua;
		this.eguneraketaData = eguneraketaData;
		this.datuak = datuak;
	}
	public int getEguneraketaID() {
		return eguneraketaID;
	}
	public void setEguneraketaID(int eguneraketaID) {
		this.eguneraketaID = eguneraketaID;
	}
	public String getTaulakaltetua() {
		return taulakaltetua;
	}
	public void setTaulakaltetua(String taulakaltetua) {
		this.taulakaltetua = taulakaltetua;
	}
	public DateTimeSyntax getEguneraketaData() {
		return eguneraketaData;
	}
	public void setEguneraketaData(DateTimeSyntax eguneraketaData) {
		this.eguneraketaData = eguneraketaData;
	}
	public String getDatuak() {
		return datuak;
	}
	public void setDatuak(String datuak) {
		this.datuak = datuak;
	}
	@Override
	public String toString() {
		return "eguneratua [eguneraketaID=" + eguneraketaID + ", taulakaltetua=" + taulakaltetua + ", eguneraketaData="
				+ eguneraketaData + ", datuak=" + datuak + "]";
	}
}
