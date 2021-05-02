package com.learning.springmvcthroughxml.demo.practise;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class StreamFun {

	public static void main(String[] args) {
		
	System.out.println(LocalDate.now().minus(Period.of(1, 0, 0)));
	System.out.println(LocalDate.now().minus(1,ChronoUnit.YEARS));
	System.out.println(LocalDate.now().minusYears(1));
		

	}

}
