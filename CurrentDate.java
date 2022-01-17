package com.shoeb.programs;
import java.util.*;
import java.util.Calendar;
public class CurrentDate {

	public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	System.out.println("The current date="+cal.getTime());
	cal.add(Calendar.DATE, -15);
	System.out.println("15 days ago="+cal.getTime());
		
		  Date objDate = new Date();
		 
		  System.out.println(objDate.toString());
		 
	}

}
