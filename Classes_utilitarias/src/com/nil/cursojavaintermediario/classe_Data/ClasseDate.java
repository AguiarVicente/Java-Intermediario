package com.nil.cursojavaintermediario.classe_Data;

import java.util.Date;

public class ClasseDate {

	public static void main(String[] args) {

		Date hoje = new Date();
		System.out.println(hoje);
		
		System.out.println("Milissegundos desde 1 Jan de 1970 " + hoje.getTime());
		
		System.out.println(hoje.getDate());

	}

}
