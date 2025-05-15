package modelo;

import javax.print.attribute.DateTimeSyntax;

/*
 * @author EkainKepaUnai
 * @version 1.0
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
		 * @param iradokizunid
		 * @param iradokizunNAN
		 * @param sortzeData
		 * @param deskribapena
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
		 * @param iradokizunid
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
		 * @param iradokizunNAN
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
		 * @param sortzeData
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
		 * @param deskribapena
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
