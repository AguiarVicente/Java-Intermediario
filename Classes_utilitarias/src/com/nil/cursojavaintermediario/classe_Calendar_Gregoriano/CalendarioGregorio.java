package com.nil.cursojavaintermediario.classe_Calendar_Gregoriano;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarioGregorio {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		
		GregorianCalendar hoje1 = new GregorianCalendar();
		
//		System.out.println(hoje1);
		
		imprimirData(hoje1);
		System.out.println();
		imprimirData(hoje);
		
		System.out.println();
		
		System.out.println(hoje1.isLeapYear(2021));
		
		GregorianCalendar hoje2 = new GregorianCalendar(2021, 0, 10, 21, 00, 35);
		imprimirData(hoje2);

	}
	
	public static void imprimirData(Calendar calendario) {
		int ano = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minuto = calendario.get(Calendar.MINUTE);
		int segundo = calendario.get(Calendar.SECOND);
		
		System.out.printf("Hoje é: %02d/%02d/%d - %02d:%02d:%02d", dia, (mes + 1), ano, hora, minuto, segundo);
	}

}
