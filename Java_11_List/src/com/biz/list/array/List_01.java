package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	/*
	 * 자바의 Collectios(컬렉션 프레임워크, 도구모음)
	 * 다량의 데이터를 취급하는 용도로 사용되며
	 * 기본 배열의 여러가지 단점들을 해결할 용도로
	 * 만들어진 클래스들의 모음집
	 * 
	 * List(ArrayList)
	 * Collections 중에서 가장 많이 사용되는 데이터구조
	 * 1. 데이터 개수(List의 개수)를 미리 정하지 않는다.
	 * 2. 필요에 따라서 개수를 추가, 삭제 할수 있다.
	 * 3. 다양한 method를 활용하여 
	 * 		여러 연산을 쉽게 처리할수 있다
	 */
	public static void main(String[] args) {
		
		// 정수들을 담을 nums 리스트를 선언
		// int[] nums;
		List<Integer> nums;
		
		// nums 리스트를 사용할수 있도록 생성, 초기화
		// nums = new int[0]
		nums = new ArrayList<Integer>();
		
		nums.add(100);
		nums.add(5);
		nums.add(1);
		
		

	}

}
