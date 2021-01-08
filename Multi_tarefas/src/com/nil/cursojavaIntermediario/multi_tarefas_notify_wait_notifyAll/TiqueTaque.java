package com.nil.cursojavaIntermediario.multi_tarefas_notify_wait_notifyAll;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExceutando) {
		if (!estaExceutando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();
		
		try {
			while(tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean estaExceutando) {
		if (!estaExceutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque");

		tique = false;

		notify();
		
		try {
			while(!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
