package com.biz.var;

public class Var_05 {

	public static void main(String[] args) {

		// 문자열형 숫자 "30"을 정수형 숫자 30으로 바꾸어
		// num 변수에 저장하라
		int num = Integer.valueOf("30");
		
		// 변환 불가
		// ? AAA 라는 문자열을 숫자로 바꿀수 없기 때문에
		num = Integer.valueOf("30AAA");
		
		// 변환 불가
		num = Integer.valueOf("A33");
		
		// 변환 불가
		num = Integer.valueOf("33 ");
		
		// 변환 불가
		num = Integer.valueOf("  33");
		
		// 변환 불가
		num = Integer.valueOf("");
		num = Integer.valueOf("3  3");
		num = Integer.valueOf("30+40");
		
	}
}
