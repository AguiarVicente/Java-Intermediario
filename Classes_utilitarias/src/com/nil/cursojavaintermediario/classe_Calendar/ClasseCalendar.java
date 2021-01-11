package com.nil.cursojavaintermediario.classe_Calendar;

import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		int ano = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minuto = calendario.get(Calendar.MINUTE);
		int segundo = calendario.get(Calendar.SECOND);
		
		System.out.println(ano);
		System.out.println(mes + 1);
		System.out.println(dia);
		System.out.println(hora);
		System.out.println(minuto);
		System.out.println(segundo);
		System.out.println(Calendar.JANUARY);
		
		System.out.printf("Hoje é: %02d/%02d/%d - %02d:%02d:%02d", dia, (mes + 1), ano, hora, minuto, segundo);
		
		// adicionar datas no Java
		calendario.add(Calendar.DAY_OF_MONTH, 4);
		
		System.out.println();
		
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));

	}

}
