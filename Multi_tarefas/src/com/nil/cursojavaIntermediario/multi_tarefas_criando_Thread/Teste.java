package com.nil.cursojavaIntermediario.multi_tarefas_criando_Thread;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 1000);
//		Thread t1 = new Thread(thread1);
//		t1.start();
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 3000);
	}
}
