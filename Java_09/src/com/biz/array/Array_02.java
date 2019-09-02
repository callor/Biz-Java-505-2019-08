package com.biz.array;

import java.util.Random;

public class Array_02 {


	public static void main(String[] args) {

		// int[] : 지금부터 배열을 선언하겠다
		//    nums : 배열의 이름은 nums로 하겠다.
		//           new int[100] : 배열을 100개 만들겠다.
		int[] nums = new int[100];
		Random rnd = new Random();
		
		// 1번코드
		// 임의 수 1개를 생성한 후
		// 100개의 배열에 같은 값을 채워 넣는다.
		int num = rnd.nextInt(10) + 1;
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = num;
		}
		
		// 2번코드
		// 100번 반복하는 과정에서
		// 매 회마다 새로운 값을 생성해서 요소에 채워 넣기
		
		// nums 배열의 요소들을 임의 난수로 채우기 위해
		// nums 배열을 for 반복문으로 요소들을 순회하면서
		//	생성된 난수로 채워 넣는다
		for(int i = 0 ; i < nums.length ; i++) {
			
			// 배열의 개수만큼 계속 반복되는 코드
			// 이때 i 은 0부터 99(배열개수 - 1)까지 변한다.
			int intNum = rnd.nextInt(10) + 1;
			nums[i] = intNum;
			
		}

		// 짝수와 홀수를 저장할 2개의 변수 선언, 초기화
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 0; i < nums.length ; i++) {
			if(nums[i] % 2 == 0) {
				evenSum += nums[i];	
			} else {
				oddSum += nums[i];
			}
		}
		System.out.printf("배열 요소 짝수 : %d, 홀수 : %d\n",
						evenSum, oddSum);
		
		for(int i = 0 ; i < nums.length;i++) {
			System.out.print(nums[i]);
			
			// 한줄에 5개 항목씩 표시하고 할때 
			// 응용할수 있는 코드
			
			// i 값이 1이상이며 5의 배수이면
			// enter문자을 보내서 줄바꿈을 하고
			if( (i+1) % 5 == 0 ) {
				System.out.println();
			
				// 그렇지 않으면 컴마(,)를 찍어라
			} else {
				System.out.print(", ");
			}
			
		}
	}
}
