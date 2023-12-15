package com.multithreading;

public class SleepMethod extends Thread {

	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	
	public static void main(String[] args) {
		SleepMethod t1 = new SleepMethod();
		t1.start();
	}
}
