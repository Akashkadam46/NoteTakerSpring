package com.java.lambda;


interface Shapee{
	void draw();
}

class Rectanglee implements Shapee{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle class : Draw() Method ");
	}
	
	
	
}

class Square implements Shapee{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square class : Draw() Method ");
	}
	
}


class Circle implements Shapee{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle class : Draw() Method ");
	}
	
}

public class LamdaExample {
	
	public static void main(String[] args) {
		
//		Shape rectangle = () ->  System.out.println("Rectangle class : Draw() Method "); 
//		rectangle.draw();
//		
//		Shape square = () -> System.out.println("Square class : Draw() Method ");
//		square.draw();
//		
//		Shape circle = () -> System.out.println("Circle class : Draw() Method " );
//		circle.draw();
//		
//		print(rectangle);
//		print(square);
//		print(circle);
		
		print(() ->  System.out.println("Rectangle class : Draw() Method "));
		print(() -> System.out.println("Square class : Draw() Method "));
		print(() -> System.out.println("Circle class : Draw() Method " ));
		
	}
	
	public static void print(Shapee shape){
		shape.draw();
	}
	
	

}
