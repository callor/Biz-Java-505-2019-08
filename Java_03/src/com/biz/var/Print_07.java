package com.biz.var;

public class Print_07 {

	public static void main(String[] args) {

		/*
		 * printf() 메서드는
		 * 형식에 맞는 모양의 출력결과를 얻기위한 명령문이다
		 * 1. 출력하고자 하는 형식의 문자열을 만든후
		 * 2. 변수, 값, 계산식 이 위치할 곳에
		 * 		%d 특수문자열을 포함시키면
		 * 		해당 특수문자열 대신에 변수, 값, 계산식과 바꾸어
		 * 		문자열을 생성하고 출력해 준다.
		 * 3. 자동 줄바꿈이 되지 않으므로 문자열 끝에는 \n을 넣어준다
		 */
		int num = 3;
		System.out.printf("%d x %d = %3d\n", num, 2, num*2);
		System.out.printf("%d x %d = %3d\n", num, 3, num*3);
		System.out.printf("%d x %d = %3d\n", num, 4, num*4);
		System.out.printf("%d x %d = %3d\n", num, 5, num*5);
		System.out.printf("%d x %d = %3d\n", num, 6, num*6);
		System.out.printf("%d x %d = %3d\n", num, 7, num*7);
		System.out.printf("%d x %d = %3d\n", num, 8, num*8);
		System.out.printf("%d x %d = %3d\n", num, 9, num*9);
		
	}
}
