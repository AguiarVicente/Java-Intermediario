package com.nil.cursojavaIntermediario.coletor_lixo;

public class ColetorLixo {
	
	public static void obterMemoriaUsada() {
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime(); // pattern singleton
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory()));		
		
	}

	public static void main(String[] args) {

		Contato[] contatos = new Contato[10000000];

		for (int i = 0; i < contatos.length; i++) {
			Contato contato = new Contato("Contato " + i, "1234-56789 " + i, "contato" + i + "@email.com");
			contatos[i] = contato;
		}

		System.out.println("Contatos criados!");
		
		obterMemoriaUsada();

		contatos = null;
		
		Runtime.getRuntime().runFinalization();
		
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memória!");
		
		obterMemoriaUsada();
	}

}
