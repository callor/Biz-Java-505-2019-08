package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		Random rnd = new Random();
		
		// rnd 객체를 사용해서 intNum 배열 50개에
		// 각각 숫자를 채워넣기
		// 1 ~ 100까지 임의 수를 만들어서...
		
		// i 값이 0 ~ (intNum.lenght - 1)
		
		// i 값이 intNum.length - 1 보다 작으면
		// intNum[i] = 100 코드를 실행하라
		// 그 동안에 i 값은 1씩 증가한다.
		for(int i = 0 ; i < intNum.length ; i++) {
			// rnd 객체에 있는 nextInt() method 야
			// 1 ~ 100까지 중에
			// 숫자 1개를 만들어서
			// intNum 배열의 i 번째에 저장해 다오
			intNum[i] = rnd.nextInt(100) + 1;
		}
		int intSum = 0;
		for(int i = 0 ; i < intNum.length ; i++) {
			// intNum의 i번째 값을 읽어서
			// intSum에 (계속) 더하라
			intSum += intNum[i];
		}
		System.out.println("합계:" + intSum);
		System.out.println("평균:" + intSum / intNum.length);
		
		
		intNum[0] = 100;
		intNum[1] = 100;
		intNum[2] = 100;
		intNum[3] = 100;
		// :
		intNum[49] = 100;
		
		
		
		
		
		
	}

}
