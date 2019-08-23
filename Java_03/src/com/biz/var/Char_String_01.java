package com.biz.var;

public class Char_String_01 {

	public static void main(String[] args) {
		/*
		 * char 형
		 * 1. 문자(영문자,숫자,특수문자)들을
		 * 2. 표준화된 ASCII 형태의 2진수 값으로 취급하는
		 * 		데이터
		 * 3. 8bit 크기의 정수값으로 문자를 저장하는 형태 
		 */
		char cA = 'A';
		System.out.println(cA);
		
		String sA = "A";
		System.out.println(sA);
		
		// "A" + 0 은 "A" + "0" 형태로 바뀌어
		// "A0"라는 문자열이 console에 보인다.
		System.out.println(sA + 0);
		
		// char 형 변수에 0을 덧셈하면
		// char 형 변수에 저장된 값이 int형 정수로 변환되고
		// char 형 변수에 저장된 문자의 
		//	ASCII 값을 확인할수 있다.
		System.out.println(cA + 0);
		
		System.out.println('0' + 0);
		System.out.println('a' + 0);
		
	
	}

}
