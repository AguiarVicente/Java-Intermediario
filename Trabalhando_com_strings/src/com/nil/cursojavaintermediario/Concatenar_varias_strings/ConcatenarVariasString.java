package com.nil.cursojavaintermediario.Concatenar_varias_strings;

public class ConcatenarVariasString {

	public static void main(String[] args) {
		
		String[] letras = { "B", "C", "D", "E", "F" };
		
		String alfabeto = "";
		
		for( String letra : letras) {
			alfabeto += letra;
		}
		
		System.out.println(alfabeto);
		
		// StringBuffer
		
		StringBuffer sb = new StringBuffer();
		
		for( String letra: letras) {
			sb.append(letra);
		}
		
		alfabeto = sb.toString();
		
		System.out.println(alfabeto);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.delete(1, 4));
		
		StringBuilder sb_ = new StringBuilder();
		
		for(String letra : letras) {
			sb_.append(letra);
		}
		
		alfabeto = sb_.toString();
		
		System.out.println(alfabeto);
	}

}
