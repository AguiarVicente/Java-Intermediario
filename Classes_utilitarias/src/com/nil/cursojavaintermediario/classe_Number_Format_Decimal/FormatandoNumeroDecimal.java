package com.nil.cursojavaintermediario.classe_Number_Format_Decimal;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FormatandoNumeroDecimal {

	public static void main(String[] args) {
		
		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		
//		df.applyPattern(padrao); // seria igual a forma acima
		System.out.println(df.format(123456789.123));
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator('.');
		dfs.setGroupingSeparator(',');
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(123456789.123));
		
		String padrao3 = "###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);
		System.out.println(df.format(123456789.123));
		
		String padrao4 = "###,###,##0.00";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(0.1));

	}

}
