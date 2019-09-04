package com.biz.rev;

public class Var_05 {

	public static void main(String[] args) {

		int num = 30;
		
		/*
		 * 앞에서 선언되고 30이 저장된 num 변수값을 읽어서
		 * 거기에 40을 더하고
		 * 결과인 70을 다시 num 변수에 저장하라
		 */
		num = num + 40; // 30 + 40 이 num에 저장
		num += 40; // 축약형 코드, 70 + 40 이 num에 저장
		
		/* 앞에서 선언되고 값이 저장된 num 변수 값을 읽어서
		 * 거기에 1을 더하고
		 * 결과를 다시 num 변수에 저장하라
		 * 
		 * num 변수 값을 1 증가 시켜라
		 */
		num++ ;
		
		/*
		 * 앞에서 선언되고 값이 저장된 num 변수 값을 읽어서
		 * 거기에서 1을 빼고
		 * 결과를 다시 num 변수에 저장하라
		 * 
		 * num 변수 값을 1 감소 시켜라
		 */
		num--;
			
		
	}

}
