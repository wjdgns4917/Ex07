package com.one;

public class KaupTest {

	public static void main(String[] args) {
//		��ü����
		KaupTest kt=new KaupTest();
		float h=1.8f;
		float w=90.0f;
		float index = kt.calculate(h,w);
		System.out.println("index : "+index);
		String rStr=kt.getResult(index);
		System.out.println("�񸸵� : "+rStr);
		
		//ī���� ������ ����Ѵ� �޼ҵ� calculate
		
	}
	public float calculate(float h, float w) {
//      ü��/����(m)*����(m)
		float result=w/(h*h);
		return result;
	}
	public String getResult(float idx) {
		//��, ��ü��...ǥ�� by index
		String str="";
		if (idx>=30) 
			str="��";
		else if (idx>=24) 
			str="��ü��";
		else if (idx>=20) 
		    str="����";
		else if (idx>=15) 
			str="��ü��";	
		else if (idx>=13) 
			str="����";
		else if (idx>=10) 
			str="�������";
		else
			str="�Ҹ���";
		return str;
				
	}			
		
	
}
