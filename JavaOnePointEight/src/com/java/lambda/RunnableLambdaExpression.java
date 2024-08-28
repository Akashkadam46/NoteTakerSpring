package com.java.lambda;


class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method called....");
	}
	
}

public class RunnableLambdaExpression {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		Runnable runnable = () -> {
			System.out.println("run method called using lambda ....");
		};
		
		Thread threadLambda = new Thread(runnable);
		threadLambda.start();
	}
	
	

}
