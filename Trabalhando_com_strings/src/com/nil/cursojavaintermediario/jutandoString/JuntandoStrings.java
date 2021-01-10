package com.nil.cursojavaintermediario.jutandoString;

public class JuntandoStrings {

	public static void main(String[] args) {

		// juntando String (join)
		String alfabeto = String.join(", ", "A", "B", "C", "D");
		System.out.println(alfabeto);

		// separando String (split)
		String[] letras = alfabeto.split(", ");

		for (String letra : letras) {
			System.out.println(letra);
		}

		String doArquivo = "1;Antonio;30";
		String[] infos = doArquivo.split(";");

		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));

		System.out.println(pessoa);
	}

}
