package com.biz.rev;

public class For_01 {

	public static void main(String[] args) {

		/*
		 * 어떤 값이 0부터 시작하여 (10-1) 까지
		 * 1씩 증가하는 동안
		 * 반복적으로 코드를 실행하겠다
		 */
		for(int i = 0 ; i < 10 ; i++) {
			
			// 여기 있는 코드를 반복적으로 실행
		
		}
		
		/*
		 * 어떤 값이 0부터 10-1까지
		 * 1씩 증가하는 동안
		 * ( == 10번 반복 실행하겠다)
		 * 대한민국 문자열을 console에 표시해라
		 * 
		 * == 대한민국 문자열을 console에 10번 표시해라
		 * 
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("대한민국");
		}
		
		/*
		 * 변수 i의 값이 0부터 (10-1)까지
		 * 1씩 증가하는 동안 코드를 실행하라
		 */
		for(int i = 0 ; i < 10 ; i++) {
			// 여기 코드를
		}
		
		/*
		 * console에 0부터 9까지 숫자를 표시하라
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		
		// 정수형 변수 num를 선언하고
		// 정수 0을 변수 num에 저장하라
		// 0을 저장하라 = 변수를 clear 하라
		int num = 0;
		
		/*
		 * 변수 i 가 0부터 (10-1)까지 
		 * 1씩 증가하는데
		 * 그 각각의 값을
		 * 변수 num에 계속 더하라
		 * 
		 * num = 0 + 1 + 2 +3 + 4 + 5 + 6 + 7 + 8 + 9
		 */
		for(int i = 0 ; i < 10 ; i++) {
			num += i;
		}
		
		// 앞에서 선언된 변수 num에 정수 1을 저장하라
		num = 1;
		
		/*
		 * 변수 i 가 1부터 (10-1)까지 1씩 증가하는데
		 * 그 값을 계속해서 num에 곱하여 저장하라
		 * 
		 * num = 1 * 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9
		 */
		for(int i = 1 ; i < 10 ; i++) {
			num *= i;
		}
		
		// 앞의 for 반복문에서 계산한 결과가 담겨 있는
		// 변수 num 값을 읽어서 console에 보여라
		System.out.println(num);
		
		
		
	}
}
