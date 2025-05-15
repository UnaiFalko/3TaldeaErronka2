package modelo;

import javax.print.attribute.DateTimeSyntax;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class reserva {

	private int iradokizunID;
	private String iradokizunNAN;
	private DateTimeSyntax sorkuntzadata;
	private String datuak;
	
	public reserva() {
		super();
	}
	public reserva(int iradokizunID, String iradokizunNAN, DateTimeSyntax sorkuntzadata, String datuak) {
		super();
		this.iradokizunID = iradokizunID;
		this.iradokizunNAN = iradokizunNAN;
		this.sorkuntzadata = sorkuntzadata;
		this.datuak = datuak;
	}
	public int getIradokizunID() {
		return iradokizunID;
	}
	public void setIradokizunID(int iradokizunID) {
		this.iradokizunID = iradokizunID;
	}
	public String getIradokizunNAN() {
		return iradokizunNAN;
	}
	public void setIradokizunNAN(String iradokizunNAN) {
		this.iradokizunNAN = iradokizunNAN;
	}
	public DateTimeSyntax getSorkuntzadata() {
		return sorkuntzadata;
	}
	public void setSorkuntzadata(DateTimeSyntax sorkuntzadata) {
		this.sorkuntzadata = sorkuntzadata;
	}
	public String getDatuak() {
		return datuak;
	}
	public void setDatuak(String datuak) {
		this.datuak = datuak;
	}
	@Override
	public String toString() {
		return "reserva [iradokizunID=" + iradokizunID + ", iradokizunNAN=" + iradokizunNAN + ", sorkuntzadata="
				+ sorkuntzadata + ", datuak=" + datuak + "]";
	}
	
	
}
