package com.biz.var;

public class Char_String_02 {

	public static void main(String[] args) {

		char c1 = 'A';
		char c2 = '대';
		String s3 = "한민국";
		
		System.out.println(c1 + 0);
		
		//한글 문자 Uni Code 보기
		System.out.println(c2 + 0);

		// 문자 + 문자열 => 문자열로 변환 출력
		System.out.println(c2 + s3);
		System.out.println(c1 + s3);

		
		// 영문자 + 한글문자 + 문자열
		// => (영문자 + 한글문자) : int 형 유니코드로 변환
		// => (영문자 + 한글문자) + 문자
		System.out.println(c1 + c2 + s3);
		
		// 영문자와 한글문자를 덧셈 연산하면
		// 유니코드로 값이 나타 난다
		System.out.println(c1 + c2);
		
		
	}
}
