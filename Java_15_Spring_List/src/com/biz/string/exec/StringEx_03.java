package com.biz.string.exec;

public class StringEx_03 {

	/*
	 * strNation에 담긴 문자열을
	 * 역순으로 콘솔에 표시 하시오
	 * 	aeroK fo cilbupeR
	 */
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		String[] nations = strNation.split("");
		// nations.length : 17, a 문자열이 저장된 위치는 16
		
		// for 반복문은 전진, 후진도 있다.
		for(int i = nations.length - 1; i > -1 ;i--) {
			System.out.print(nations[i]);
		}
		System.out.println();
		
		for(int i = strNation.length() - 1; i > -1 ; i--) {
			System.out.print(strNation.charAt(i));
		}
		System.out.println();
		
	}
}
