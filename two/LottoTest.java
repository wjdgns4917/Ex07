package com.two;

import java.util.Random;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
//		랜덤처리
//		로또 6자리 배열에 저장및 출력
//		조건: 이미 추출된 번호는 중복되지 않도록
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


