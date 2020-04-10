package com.one;

public class Circle {
	static int radius;
	String name;
	

	public Circle(int radius) {
		Circle.radius=radius;
		name="";
		
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
		Circle pizza=new Circle(radius);
		double area=pizza.getArea();
		System.out.println("¸éÀû : "+area);
	}

}
