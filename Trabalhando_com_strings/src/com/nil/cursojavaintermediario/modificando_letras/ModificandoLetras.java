package com.nil.cursojavaintermediario.modificando_letras;

public class ModificandoLetras {

	public static void main(String[] args) {
		
		String teste = "Teste";
		
		// minusculas
		System.out.println(teste.toLowerCase());
		
		// maisculas
		System.out.println(teste.toUpperCase());
		
		if(teste.toLowerCase().equals(teste.toLowerCase())) {
			System.out.println(true);
		}
	}
}
