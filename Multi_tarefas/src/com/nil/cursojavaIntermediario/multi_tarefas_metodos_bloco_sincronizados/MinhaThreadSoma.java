package com.nil.cursojavaIntermediario.multi_tarefas_metodos_bloco_sincronizados;

public class MinhaThreadSoma implements Runnable{
	
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		
		new Thread(this, this.nome).start();
	}

	@Override
	public void run() {
		
		System.out.println(this.nome + " iniciada.");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para a thread " + this.nome + " é: " + soma);
		
		System.out.println(this.nome + " finalizada!");
	}
}
