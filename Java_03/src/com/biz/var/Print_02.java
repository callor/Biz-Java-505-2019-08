package com.biz.var;

public class Print_02 {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 40;
		
		/*
		 * 이 연산은 덧셈(+)연산일 경우만 해당
		 * 덧셈연산 문장 중에 문자열이 1개라도 포함되면
		 * 모든 값들을 문자열로 변환시키고
		 * 변환된 문자열들을 연결하여 콘솔에 보인다.
		 * ※ 마지막 num1 + num2 도 "30" + "40"으로 변환되므로
		 * 결과가 3040으로 콘솔에 보인다.
		 */
		System.out.println(num1 
				+ " + " 
				+ num2 
				+ " = " 
				+ num1 + num2);
		
		/*
		 * 출력을 30 + 40 = 70 형식으로 보고 싶으면
		 * 먼저 num1과 num2를 계산하여 변수에 저장해 두고
		 * 그 결과를 덧셈(+) 연산을 수행하면 된다.
		 */
		// int sum = 0;
		// sum = num1 + num2;
		int sum = num1 + num2;
		System.out.println(num1 
				+ " + " 
				+ num2 
				+ " = " 
				+ sum );

		/*
		 * 별도로 변수를 사용하지 않고
		 * 30 + 40 = 70 으로 보고싶으면
		 * 마지막 결과인 30+40 계산식을 괄호로 묶어서
		 * 연산 우선순위를 높이는 방법도 있다.
		 */
		System.out.println(num1 
				+ " + " 
				+ num2 
				+ " = " 
				+ (num1 + num2) );

		System.out.println(num1 
				+ " x " 
				+ num2 
				+ " = " 
				+ (num1 * num2) );

		System.out.println(num1 
				+ " - " 
				+ num2 
				+ " = " 
				+ (num1 - num2) );

		System.out.println(num1 
				+ " ÷ " 
				+ num2 
				+ " = " 
				+ (num1 / num2) );

		System.out.println(num1 
				+ " % " 
				+ num2 
				+ " = " 
				+ (num1 % num2) );
	}
}
