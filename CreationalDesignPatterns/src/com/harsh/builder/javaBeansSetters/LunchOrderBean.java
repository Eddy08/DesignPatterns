package com.harsh.builder.javaBeansSetters;

public class LunchOrderBean {

		private String bread;
		private String dressing;
		private String juice;
		private String butter;
		
		
		
		public LunchOrderBean() {
		
		
		}
		
		public final String getBread() {
			return bread;
		}
		public final void setBread(String bread) {
			this.bread = bread;
		}
		public final String getDressing() {
			return dressing;
		}
		public final void setDressing(String dressing) {
			this.dressing = dressing;
		}
		public final String getJuice() {
			return juice;
		}
		public final void setJuice(String juice) {
			this.juice = juice;
		}
		public final String getButter() {
			return butter;
		}
		public final void setButter(String butter) {
			this.butter = butter;
		}

		@Override
		public String toString() {
			return "LunchOrderBean [bread=" + bread + ", dressing=" + dressing + ", juice=" + juice + ", butter="
					+ butter + "]";
		}
		
		
}
