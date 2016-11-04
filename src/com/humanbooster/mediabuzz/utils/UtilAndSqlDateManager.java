package com.humanbooster.mediabuzz.utils;

import java.util.Calendar;

public class UtilAndSqlDateManager {
	
	public static java.sql.Date convertUtilDateToSqlDate(java.util.Date utilDate){
		return new java.sql.Date(utilDate.getTime());
	}
	
	public static java.util.Date convertSqlDateToUtilDate(java.sql.Date sqlDate){
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(sqlDate.getTime());
		return c.getTime();
	}
}
