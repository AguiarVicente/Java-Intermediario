package com.nil.cursojavaintermediario.comparando_string;

public class ComparandoStrings {

	public static void main(String[] args) {
		
		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);
		
		System.out.println("Ola equals ola2 = " + ola.equals(ola2));
		System.out.println("Ola equals ola3 = " + ola.equals(ola3));
		
		System.out.println("Ola equals ola2 = " + ola.equalsIgnoreCase(ola2));
		System.out.println("Ola equals ola2 = " + ola.equalsIgnoreCase(ola3));

		System.out.println("ola == ola2 " + (ola == ola2));
		System.out.println("ola == ola3 " + (ola == ola3));
		
		System.out.println("ola == ola4 " + (ola == ola4));
		System.out.println("ola == ola4 " + (ola.equals(ola4)));
		System.out.println("ola == ola4 " + ola.equalsIgnoreCase(ola4));
		
		String banana = "Banana";
		String ana = "ana";
		String ban = "ban";
		
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));
		
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));
		
		String a = "a";
		String b = "b";
		String aMaisculo = "A";
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(aMaisculo));
		
		// comparam de acordo a tabela ascii
		// -1 quando a > b
		// 0 quando a == b
		// 1 ou >1 quando a < b
	}

}
