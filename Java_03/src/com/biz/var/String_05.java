package com.biz.var;

public class String_05 {

	public static void main(String[] args) {

		String n1 = "대";
		String n2 = "한";
		String n3 = "민";
		String n4 = "국";
		
		String nation = n1 + n2 + n3 + n4;
		System.out.println(nation);
		
		int no1 = 30;
		int no2 = 40;
		int no3 = 30+40;
		
		// 문자열형변수 + 숫자형변수의 형태는
		// 문자열형변수 + "숫자형변수의 값" 와 같다
		// 변수끼리 덧셈연산을 수행할때
		// 변수 중에 1개라도 문자열형이 포함되어 있으면
		// 모두 문자열로 변환된 후 연결연산이 이루어 진다.
		nation = n1 + no1 + no2 + no3;
		System.out.println(nation);
		
		
	}
}
