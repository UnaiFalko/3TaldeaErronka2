package modelo;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */
public class antzerkia {

	private String cif;
	private String izena;
	private String helbidea;
	
	public antzerkia() {
		super();
	}

	public antzerkia(String cif, String izena, String helbidea) {
		super();
		this.cif = cif;
		this.izena = izena;
		this.helbidea = helbidea;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	@Override
	public String toString() {
		return "antzerkia [cif=" + cif + ", izena=" + izena + ", helbidea=" + helbidea + "]";
	}
	
}
