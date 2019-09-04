package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();

		for(int i = 0 ; i < 5 ; i++) {
			nums.add( rnd.nextInt() );
		}
		
		// list.size()
		// 현재까지 추가된 리스트의 개수를 알려주는 method
		
		// 1번코드
		for(int i = 0 ; i < nums.size() ; i++) {
			System.out.println(nums.get(i));
		}
		
		// 2번코드
		int numsSize = nums.size();
		for(int i = 0 ; i < numsSize ; i++) {
			System.out.println(nums.get(i));
		}
		
		/*
		 * list의 개수만큼 반복문을 실행하고자 할때
		 * 
		 * 1번코드는 for 반복문이 실행되는 횟수만큼
		 * list.size() 메서드를 호출하여
		 * 		size() 메서드에 작성된 코드가 반복 수행된다
		 * 
		 * 하지만,
		 * 2번코드는 for 반복문을 시작하기 전에 
		 * 	미리 개수를 계산하여 변수에 저장하여두고
		 * 	변수 값을 읽어서 반복문을 수행하므로
		 *  리스트의 개수가 많아지면 많아 질수록
		 *  훨씬 효율적인 코드가 된다.
		 */
		
		
	}
	
	

}
