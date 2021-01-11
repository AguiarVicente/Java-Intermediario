package com.nil.cursojavaintermediario.classe_Formatando_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormatandoDatas {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss a z");
		
		Calendar hoje = new GregorianCalendar(2021, 0, 10, 21, 04, 35);
		
		System.out.println(sdf.format(hoje.getTime()));
		
		Date hoje1 = new Date();
		
		System.out.println(sdf.format(hoje1));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "10/01/2021";
		
		
		try {
			Date minhaDataEmDAte = sdf1.parse(minhaData);
			System.out.println(minhaDataEmDAte);
			
			System.out.println(sdf.format(minhaDataEmDAte));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
