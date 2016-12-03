package com.humanbooster.mediabuzz;

import java.util.Calendar;

import com.humanbooster.mediabuzz.utils.DateManager;

public class DateClient {

	public static void main(String[] args) {
		java.util.Date utilDate = new java.util.Date();
		System.out.println("------TEST convertion utilDate To Sql Date-------");
		
		System.out.println(" utilDate : "+utilDate);
		System.out.println(" sqlDate après convertion utilDate : "+DateManager.convertUtilDateToSqlDate(utilDate));
		
		System.out.println("------TEST convertion sqlDate To utilDate-------");
		Calendar c = Calendar.getInstance();
		c.set(1984, 10, 5);
		java.sql.Date sqlDate = new java.sql.Date(c.getTimeInMillis());
		
		System.out.println(" sqlDate : "+sqlDate);
		
		System.out.println(" utilDate après convertion sqlDate "
				+DateManager.convertSqlDateToUtilDate(sqlDate));
		
		

	}

}
