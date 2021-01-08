package com.nil.cursojavaIntermediario.multi_tarefas_supend_resume_stop;

public class Teste {
	
	public static void main(String[] args) {
		
		MinhaThread t1 = new MinhaThread("#1");
		MinhaThread t2 = new MinhaThread("#2");
		
		System.out.println("Pausando a Thread #1");
		
		t1.suspende();
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pausando a Thread #2");
		t2.suspende();
		
		System.out.println("Resumindo a Thread #1");
		t1.resume();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resumindo a Thread #2");
		
		t2.resume();
		
		System.out.println("Terminando a Thread #2");
		
		t2.stop();
		
	}
}
