package com.java.lambda;

interface shape{
	void Draw();
}


class Rectangle implements shape{

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Draw Method ");
	}
	
}



public class LambdaExample {
	 
	public static void main(String[] args) {
		
		shape rectangle = () -> System.out.println("Rectangle Draw Method");
		rectangle.Draw();
	}
	

}
