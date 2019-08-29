package com.biz.classes;

import java.util.Scanner;

public class PrimeService {

	/*
	 * main() 메서드에서
	 * PrimeService.checkPrime(숫자) 형식으로 값을
	 * 보내면 num 변수에 그 값을 받는다
	 * num 변수에 있는 값이 prime 인지 검사한다.
	 */
	public void checkPrime(int num) {
		
		int index;
		for(index = 2 ; index < num ;index++) {
			if(num % index == 0) break;
		}
		// index ??
		if(index >= num) {
			System.out.println(num + "는 소수(Prime)이다!!");
		} else {
			System.out.println(num + "는 소수가 아니다!!!");
		}
	}
}
