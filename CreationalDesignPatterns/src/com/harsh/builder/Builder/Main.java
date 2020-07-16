package com.harsh.builder.Builder;

import com.harsh.builder.Builder.LunchOrder.Builder;

public class Main {
	public static void main(String[] args) {
		LunchOrder.Builder builder=new LunchOrder.Builder();
		builder.bread("Brown").bread("Wheat");
		LunchOrder lunch=builder.build();
		System.out.println(lunch);
	}
}
