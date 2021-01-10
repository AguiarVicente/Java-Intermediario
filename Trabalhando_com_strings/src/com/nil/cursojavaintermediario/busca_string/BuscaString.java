package com.nil.cursojavaintermediario.busca_string;

public class BuscaString {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		System.out.println(banana.indexOf("x"));
		System.out.println(banana.indexOf(ana));
		System.out.println(banana.lastIndexOf(ana));
		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("x"));

	}

}
