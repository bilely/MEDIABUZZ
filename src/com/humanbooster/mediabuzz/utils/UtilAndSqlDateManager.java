package com.humanbooster.mediabuzz.utils;

import java.sql.Timestamp;
import java.util.Calendar;

public class UtilAndSqlDateManager {

	public static java.sql.Date convertUtilDateToSqlDate(
			java.util.Date utilDate) {
		return new java.sql.Date(utilDate.getTime());
	}

	public static Timestamp convertDateToSqlDateStamp(java.util.Date utilDate) {
		return new java.sql.Timestamp(utilDate.getTime());
	}

	public static java.util.Date convertSqlDateToUtilDate(
			java.sql.Date sqlDate) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(sqlDate.getTime());
		return c.getTime();

	}

	public static java.util.Date convertSqlTimeStampToUtilDate(
			java.sql.Timestamp sqlDateStamp) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(sqlDateStamp.getTime());
		return c.getTime();
	}
}
