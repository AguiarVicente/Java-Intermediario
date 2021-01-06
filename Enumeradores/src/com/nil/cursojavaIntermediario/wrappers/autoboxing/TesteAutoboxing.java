package com.nil.cursojavaIntermediario.wrappers.autoboxing;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		// autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 10000l;
		
		Float num11 = 3.5f;
		Double num12 = 3.666;
		
		Boolean flag2 = true;
		
		Character b_ = 'b';
		
		// auto un-boxing
		int num13 = num9; //num9.intValues();
		
		// autoboxing em expressões
		num9++;
		
		System.out.println(num9);

		Integer num14 = num13 / num9;
		System.out.println(num10);
		
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a + b + c) / 3;
		System.out.println(media);
	}

}
