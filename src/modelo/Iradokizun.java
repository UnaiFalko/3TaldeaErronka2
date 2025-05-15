package modelo;

import javax.print.attribute.DateTimeSyntax;

public class Iradokizun {

		private int Iradokizunid;
		private String IradokizunNAN;
		private DateTimeSyntax SortzeData;
		private String deskribapena;
		
		public Iradokizun() {
			super();
		}

		public Iradokizun(int iradokizunid, String iradokizunNAN, DateTimeSyntax sortzeData, String deskribapena) {
			super();
			Iradokizunid = iradokizunid;
			IradokizunNAN = iradokizunNAN;
			SortzeData = sortzeData;
			this.deskribapena = deskribapena;
		}

		public int getIradokizunid() {
			return Iradokizunid;
		}

		public void setIradokizunid(int iradokizunid) {
			Iradokizunid = iradokizunid;
		}

		public String getIradokizunNAN() {
			return IradokizunNAN;
		}

		public void setIradokizunNAN(String iradokizunNAN) {
			IradokizunNAN = iradokizunNAN;
		}

		public DateTimeSyntax getSortzeData() {
			return SortzeData;
		}

		public void setSortzeData(DateTimeSyntax sortzeData) {
			SortzeData = sortzeData;
		}

		public String getDeskribapena() {
			return deskribapena;
		}

		public void setDeskribapena(String deskribapena) {
			this.deskribapena = deskribapena;
		}

		@Override
		public String toString() {
			return "Iradokizun [Iradokizunid=" + Iradokizunid + ", IradokizunNAN=" + IradokizunNAN + ", SortzeData="
					+ SortzeData + ", deskribapena=" + deskribapena + "]";
		}
		
		
}
