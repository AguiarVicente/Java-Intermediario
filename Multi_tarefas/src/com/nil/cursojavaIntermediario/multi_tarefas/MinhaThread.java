package com.nil.cursojavaIntermediario.multi_tarefas;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(this.nome + " Contador " + i);
				Thread.sleep(this.tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Terminou a excução " + this.nome);
	}

}
