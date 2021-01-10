package com.nil.cursojavaintermediario.modificando_string;

public class ModificandoString {

	public static void main(String[] args) {
		
		String teste = "Isso é um teste.";
		
		System.out.println(teste);
		
		// substring
		System.out.println(teste.substring(10));
		
		String ola = "Olá ";
		String mundo = "mundo";
		// concat
		String olaMundo = ola.concat(mundo); 
		System.out.println(olaMundo);
		
		// replace
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		// trim
		String nome = " Meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());	
		
	}
}
