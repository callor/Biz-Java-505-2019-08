package com.biz.var;

public class Var_03 {

	public static void main(String[] args) {

		String s1 = "30";
		String s2 = "40";
		
		// 문자열형 변수 ss를 선언하고
		// s1에 담긴 문자열과 s2에 담긴 문자열을
		// 연결하여 ss 변수에 저장하라
		String ss = s1 + s2;
		
		ss = "30" + "40";
		
		// 문자열형 변수 s1과 s2에 담긴 숫자들을 덧셈하여
		// 70이라는 계산 결과를 얻고싶을때
		// 문자열형 숫자를 실제 계산이 가능한 숫자형으로 
		// 변환을 시켜야 한다.
		
		// 문자열형 변수 s1에 담긴 문자열형 숫자를
		// 정수로 바꾸어 n1에 저장하라
		int n1 = Integer.valueOf(s1);
		
		// 문자열형 변수 s2에 담긴 문자열형 숫자를
		// 정수로 바꾸어 n2에 저장하라
		int n2 = Integer.valueOf(s2);
		
		// n1에 담긴 숫자와 n2에 담긴 숫자를
		// 수학의 덧셈 계산을 수행하여
		// nn 변수에 저장하라
		// nn 변수에는 70이 담기게 된다.
		int nn = n1 + n2; 
	}
}
