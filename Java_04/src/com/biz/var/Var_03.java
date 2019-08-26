package com.biz.var;

public class Var_03 {

	public static void main(String[] args) {
		
		/*
		 * 변수를 선언하고, 
		 * 초기화를 수행한후(3을 저장)
		 * 어떤 값을 저장하면
		 * 기존의 값은 지워지고 새로운 값으로 대치된다.
		 */
		int num = 3;
		num = 4;
		num = 5;
		num = 6;
		System.out.println(num);
		
	}

}
