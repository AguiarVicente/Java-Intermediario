package com.nil.cursojavaintermediario.classe_TimeZone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class ClasseTimeZone {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz);
		
		String[] fusos = TimeZone.getAvailableIDs();
		
//		for(String fuso : fusos) {
//			System.out.println(fuso);
//		}
		
		TimeZone tzsp = TimeZone.getTimeZone("America/Sao_Paulo");
		System.out.println(tzsp.getDisplayName());
		System.out.println(tzsp.getID());
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraSP = Calendar.getInstance(tzsp);
		System.out.println(agoraSP.getTimeZone());
		System.out.println(sdf.format(agoraSP.getTime()));
		
		agoraSP.add(Calendar.HOUR_OF_DAY, tzsp.getOffset(System.currentTimeMillis() / 1000 / 60 / 60));

	}

}
