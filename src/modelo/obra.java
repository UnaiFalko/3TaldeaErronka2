package modelo;

public class obra {

	private int obraID;
	private String izena;
	private String deskribapena;
	private boolean interaktiboa;
	
	public obra() {
		super();
	}
	public obra(int obraID, String izena, String deskribapena, boolean interaktiboa) {
		super();
		this.obraID = obraID;
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.interaktiboa = interaktiboa;
	}
	public int getObraID() {
		return obraID;
	}
	public void setObraID(int obraID) {
		this.obraID = obraID;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getDeskribapena() {
		return deskribapena;
	}
	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}
	public boolean isInteraktiboa() {
		return interaktiboa;
	}
	public void setInteraktiboa(boolean interaktiboa) {
		this.interaktiboa = interaktiboa;
	}
	@Override
	public String toString() {
		return "obra [obraID=" + obraID + ", izena=" + izena + ", deskribapena=" + deskribapena + ", interaktiboa="
				+ interaktiboa + "]";
	}
}
