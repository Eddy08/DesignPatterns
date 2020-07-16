package com.harsh.factory;

import java.util.Calendar;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Factory Method usually used in frameworks
		// Factory method Example IN CMS (Content Management System)
		Calendar cal = Calendar.getInstance(Locale.ENGLISH);
		System.out.println(cal);
		cal = Calendar.getInstance();
		System.out.println(cal.getWeekYear());
	}

}
