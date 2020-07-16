package com.harsh.builder.Builder;

public class LunchOrder {
	//it's own container Builder
	public static class Builder{
		private String bread;
		private String dressing;
		private String juice;
		private String butter;
		
		public Builder() {
			//we can validate or mandatory fields!
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread) {
			this.bread=bread;
			//returning Builder object by using this keyword
			return this;
		}
		public Builder dressing(String dressing) {
			this.dressing=dressing;
			return this;
		}
		public Builder juice(String juice) {
			this.juice=juice;
			return this;
		}
		public Builder butter(String butter) {
			this.butter=butter;
			return this;
		}
		}
	
	private final String bread;
	private final String dressing;
	private final String juice;
	private final String butter;
	
	
	private LunchOrder(Builder builder) {
			this.bread=builder.bread;
			this.dressing=builder.dressing;
			this.juice=builder.juice;
			this.butter=builder.butter;
	}
	// Only Getters
	// --> Flexibility of Beans
	// --> Contract Nature of Constructors
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
		return "LunchOrder [bread=" + bread + ", dressing=" + dressing + ", juice=" + juice + ", butter=" + butter
				+ "]";
	}
	

	       
}
