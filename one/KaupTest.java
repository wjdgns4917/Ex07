package com.one;

public class KaupTest {

	public static void main(String[] args) {
//		객체생성
		KaupTest kt=new KaupTest();
		float h=1.8f;
		float w=90.0f;
		float index = kt.calculate(h,w);
		System.out.println("index : "+index);
		String rStr=kt.getResult(index);
		System.out.println("비만도 : "+rStr);
		
		//카우프 지수를 계산한는 메소드 calculate
		
	}
	public float calculate(float h, float w) {
//      체중/신장(m)*신장(m)
		float result=w/(h*h);
		return result;
	}
	public String getResult(float idx) {
		//비만, 과체중...표현 by index
		String str="";
		if (idx>=30) 
			str="비만";
		else if (idx>=24) 
			str="과체중";
		else if (idx>=20) 
		    str="정상";
		else if (idx>=15) 
			str="저체중";	
		else if (idx>=13) 
			str="여윔";
		else if (idx>=10) 
			str="영양실조";
		else
			str="소모증";
		return str;
				
	}			
		
	
}
