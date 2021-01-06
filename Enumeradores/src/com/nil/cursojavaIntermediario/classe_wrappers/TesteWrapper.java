package com.nil.cursojavaIntermediario.classe_wrappers;

public class TesteWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';
		
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.666);
		
		Boolean flag2 = new Boolean(true);
		
		Character b = new Character('b');
		
		Integer num13 = new Integer("10000");
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
		System.out.println(num11);
		System.out.println(num12);
		System.out.println(num13);
		
		System.out.println(num12.intValue());
		
		int num14 = Integer.parseInt("145");
		System.out.println(num14);
		
		Integer num15 = Integer.valueOf(1342);
		System.out.println(num15);
		
		System.out.println(num9 == num13); // não se compara Wrappers com ==, somente com equals
		
		System.out.println(num9.equals(num3));

	}

}
