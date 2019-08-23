package com.biz.var;

public class String_03 {

	public static void main(String[] args) {

		// code는 위에서부터 순서대로 실행이 되므로
		// 
		String n1 = "3";
		String n2 = "4";
		
		// n1과 n2를 연결하여 다른 변수에 저장하려면
		// 먼저 n1과 n2가 완전히 사용할 준비가 되어 있어야 한다.
		// 완전한 사용준비 : 읽기가 모두 가능한 상태
		String nn = n1 + n2;
		
		// nn의 값을 console에 표시하려면
		// 먼저 nn이 완전히 사용할 준비가 되어 있어야 한다.
		System.out.println(nn);
		
	}

}
