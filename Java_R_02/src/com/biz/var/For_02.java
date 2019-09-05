package com.biz.var;

public class For_02 {

	public static void main(String[] args) {

		int num = 100;
		// 변수 i 값이 0부터 (num-1)까지 1씩 증가하고 있다.
		// 변화되는 i 값을 console에 보여라
		for(int i = 0 ; i < num ; i++) {
			System.out.println(i);
		}
		
		// 변수 n 값이 0부터 (10-1)까지 1씩 증가하고 있다.
		// 변화되는 n 값을 
		// 변수 num에 원래 저장된 값에 계속 더하라
		// num = num + 0+1+2+3+4+5+6+7+8+9
		for(int n = 0 ; n < 10 ; n++) {
			num += n;
		}
		
	}

}
