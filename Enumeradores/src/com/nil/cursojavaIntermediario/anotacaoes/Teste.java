package com.nil.cursojavaIntermediario.anotacaoes;

@InformacaoAula(
		autor = "Nil",
		aulaNumero = 65,
		blog = "nil.com",
		site = "nil.com"
)
public class Teste {

	@InformacaoAula(
			autor = "Nil",
			aulaNumero = 65,
			blog = "nil.com",
			site = "nil.com"
	)
	public static void main(String[] args) {
		
		System.out.println("----");

	}

}
