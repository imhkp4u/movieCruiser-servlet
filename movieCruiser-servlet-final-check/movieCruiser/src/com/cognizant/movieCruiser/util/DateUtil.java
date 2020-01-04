package com.cognizant.movieCruiser.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {
	
	public Date convertToDate(String input) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dateOfLaunch = format.parse(input);
			return dateOfLaunch;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String convertToString(Date input) {
		SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dformat.format(input);
		return date;
	}

}
