package com.two;

import java.util.Random;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
//		����ó��
//		�ζ� 6�ڸ� �迭�� ����� ���
//		����: �̹� ����� ��ȣ�� �ߺ����� �ʵ���
		Random ran=new Random();
		int arr[]=new int[6];
		
		while (true) {
		for (int i = 0; i < arr.length; i++) { 
			arr[i]=ran.nextInt(45)+1;
		for (int j = 0; j < i; j++) {
			if (arr[i]==arr[j]) break;
		}
		
		System.out.print(arr[i]+" ");}
		}
		
			
	}
		
}


