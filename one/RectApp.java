package com.one;
//class Rectangle{
//	int weight;
//	int height;
//	public int getArea() {
//		//�������ϱ�
//		return weight*height;
//	}
//	
//}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		rect.weight=100;
		rect.height=50;
		//getArea�� ȣ��
		int rArea=rect.getArea();
		System.out.println("rArea : "+rArea);
		
		

	}

}
