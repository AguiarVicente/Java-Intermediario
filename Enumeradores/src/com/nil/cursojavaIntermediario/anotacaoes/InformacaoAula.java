package com.nil.cursojavaIntermediario.anotacaoes;

public @interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "https://www.google.com";
	
	String site() default "https://www.youtube.com";
	
}
