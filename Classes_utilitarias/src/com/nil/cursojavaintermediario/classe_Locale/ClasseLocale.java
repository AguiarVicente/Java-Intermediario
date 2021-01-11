package com.nil.cursojavaintermediario.classe_Locale;

import java.text.NumberFormat;
import java.util.Locale;

public class ClasseLocale {

	public static void main(String[] args) {
		
		// dd/MM/yyyy
		// MM/dd/yyyy
		
		// 1.000,02
		// 1,000.02
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		
		for( Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Cod da língua: " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("País: " + loc.getDisplayCountry());
			
			System.out.println("**********");
		}

		
		Locale br = new Locale("pt", "Brazil");
		System.out.println(br);
		
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(5000000d));
		
	}

}
