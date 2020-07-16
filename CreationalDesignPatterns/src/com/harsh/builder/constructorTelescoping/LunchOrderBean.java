package com.harsh.builder.constructorTelescoping;

public class LunchOrderBean {

		private String bread;
		private String dressing;
		private String juice;
		private String butter;
		
		
		public LunchOrderBean(String bread) {
			this.bread=bread;
		}
		
		// use of constructor Telescoping
		// No Setters
		
		public LunchOrderBean(String bread, String dressing) {
			this(bread);			
			this.dressing = dressing;
		}
		

		public LunchOrderBean(String bread, String dressing, String juice) {
			this(bread,dressing);			
			this.juice = juice;
		}
		
		public LunchOrderBean(String bread, String dressing, String juice, String butter) {
			this(bread,dressing,juice);
			this.butter = butter;
		}

		public final String getBread() {
			return bread;
		}
		
		public final String getDressing() {
			return dressing;
		}
	
		public final String getJuice() {
			return juice;
		}
		
		public final String getButter() {
			return butter;
		}
	

		@Override
		public String toString() {
			return "LunchOrderBean [bread=" + bread + ", dressing=" + dressing + ", juice=" + juice + ", butter="
					+ butter + "]";
		}
		
		
}
