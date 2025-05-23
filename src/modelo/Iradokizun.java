package modelo;

import javax.print.attribute.DateTimeSyntax;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

/**
 * Atributuak deklaratzen duen metodo bat sortuko dugu
 */

public class Iradokizun {

		private int Iradokizunid;
		private String IradokizunNAN;
		private DateTimeSyntax SortzeData;
		private String deskribapena;
		
		/**
		 * Konstruktorea aldagai barik sortzen du
		 */
		public Iradokizun() {
			super();
		}
		/**
		 * Konstruktorea aldagai guztixegaz sortzen du
		 * @param iradokizunid Iradokizun klasearen atributua
		 * @param iradokizunNAN Iradokizun klasearen atributua
		 * @param sortzeData Iradokizun klasearen atributua
		 * @param deskribapena Iradokizun klasearen atributua
		 */
		public Iradokizun(int iradokizunid, String iradokizunNAN, DateTimeSyntax sortzeData, String deskribapena) {
			super();
			Iradokizunid = iradokizunid;
			IradokizunNAN = iradokizunNAN;
			SortzeData = sortzeData;
			this.deskribapena = deskribapena;
		}
		/**
		 * IradokizunId-ren getterra
		 * @return IradokizunId
		 */
		public int getIradokizunid() {
			return Iradokizunid;
		}
		/**
		 * IradokizunId-ren setterra
		 * @param iradokizunid Iradokizun klasearen atributua
		 */
		public void setIradokizunid(int iradokizunid) {
			Iradokizunid = iradokizunid;
		}
		
		/**
		 * IradokizunNAN-ren getterra
		 * @return IradokizunNAN
		 */
		public String getIradokizunNAN() {
			return IradokizunNAN;
		}
		
		/**
		 * IradokizunNAN-en setterra
		 * @param iradokizunNAN Iradokizun klasearen atributua
		 */
		public void setIradokizunNAN(String iradokizunNAN) {
			IradokizunNAN = iradokizunNAN;
		}
		
		/**
		 * Sortze Datan getterra
		 * @return Sortze-Data
		 */
		public DateTimeSyntax getSortzeData() {
			return SortzeData;
		}
		/**
		 *Sortze Datan setterra 
		 * @param sortzeData Iradokizun klasearen atributua
		 */
		public void setSortzeData(DateTimeSyntax sortzeData) {
			SortzeData = sortzeData;
		}
		
		/**
		 * Deskribapena-ren getterra
		 * @return deskribapena
		 */
		public String getDeskribapena() {
			return deskribapena;
		}
		/**
		 * Deskribapena-ren setterra
		 * @param deskribapena Iradokizun klasearen atributua
		 */
		public void setDeskribapena(String deskribapena) {
			this.deskribapena = deskribapena;
		}
		/**
		 * Klasearen atributuak bistaratzen ditu
		 */
		@Override
		public String toString() {
			return "Iradokizun [Iradokizunid=" + Iradokizunid + ", IradokizunNAN=" + IradokizunNAN + ", SortzeData="
					+ SortzeData + ", deskribapena=" + deskribapena + "]";
		}
		
		
}
