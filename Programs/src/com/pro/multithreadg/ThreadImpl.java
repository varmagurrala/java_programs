package com.pro.multithreadg;

public class ThreadImpl extends ThreadDec {

	public static void main(String[] args) throws InterruptedException {
		
		
		ThreadEx ex = new ThreadEx();
		
		ThreadImpl t = new ThreadImpl();
		
		Thread th = new Thread(t);
		
		ex.setPriority(10);
		
		ex.start();
		
		th.start();
		ex.join();
		
		th.join();
		
		System.out.println("in main2");
		th.setPriority(4);
		System.out.println("in main3");

	}

}
