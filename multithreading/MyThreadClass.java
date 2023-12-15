package com.multithreading;

public class MyThreadClass extends Thread{

	public void run(){
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
			
	}
	
	public static void main(String[] args) {
		MyThreadClass t1 = new MyThreadClass();
		MyThreadClass t2 = new MyThreadClass();
		MyThreadClass t3 = new MyThreadClass();
		t1.start();
		t2.start();
		t3.start();
	}
}
