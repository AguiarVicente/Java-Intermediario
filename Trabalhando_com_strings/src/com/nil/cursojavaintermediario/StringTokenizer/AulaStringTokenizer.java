package com.nil.cursojavaintermediario.StringTokenizer;

import java.util.StringTokenizer;

public class AulaStringTokenizer {

	public static void main(String[] args) {

		String doArquivo = "1;Antonio;30";
		
		// extraindo tokens da string
		
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
