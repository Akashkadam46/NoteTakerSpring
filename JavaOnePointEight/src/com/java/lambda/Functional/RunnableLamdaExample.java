package com.java.lambda.Functional;


class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run Method Called...");
	}
	
}
public class RunnableLamdaExample {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		
		
		Thread threadLamda = new Thread(() -> System.out.println("Run Method Is Called... "));
		threadLamda.start();
	}

}
