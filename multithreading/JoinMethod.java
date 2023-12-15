package com.multithreading;

public class JoinMethod extends Thread {

	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + " " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		JoinMethod t1 = new JoinMethod();
		JoinMethod t2 = new JoinMethod();
		JoinMethod t3 = new JoinMethod();
		
		t1.start();
		
		try {
			System.out.println("The current thread = " + Thread.currentThread().getName());
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
		try {
			System.out.println("The current thread = " + Thread.currentThread().getName());
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The current thread = " + Thread.currentThread().getName());
		t3.start();
	}
}
