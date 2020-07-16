package com.harsh.builder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("This is a String \n");
		sb.append(true);
		HashMap<Integer, String>hmap=new HashMap<>();
		hmap.put(1, "Harsh");
		sb.append(hmap);
		int arr[]= {1,2,3};
		List<int[]> arraysList=Arrays.asList(arr);
		sb.append(arraysList);
		System.out.println(sb.toString());
	}
}
