package com.nil.cursojavaIntermediario.enumeradores_como_classes;

public class Teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);

	}

}
