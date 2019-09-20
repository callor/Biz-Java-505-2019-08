package com.biz.string;

import com.biz.string.domain.StudentVO;
/*
 * null 값, null value
 * type 형변수(선언 키워드 첫글자가 대문자인 모든 경우)
 */
public class NullValue {

	public static void main(String[] args) {

		// 변수를 선언하고 초기화 하기
		
		// 변수선언 키워드 첫글자가 소문자로 시작되는 선언문
		// 이때 선언되는 변수를 primitive(기본형) 변수 라고 한다.
		// 기본형 변수를 clear 할때는
		// 		고유한 값으로 clear를 해야 한다.
		int num = 0;
		float fnum = 0.0f;
		boolean b = true;
		
		// 기본형변수를 배열로 선언을 하면
		// 이 변수(배열)들은 참조형으로 바뀐다.
		int[] nums = null;
		
		// 변수선언 키워드 첫글자가 대문자로 시작되는 선언문
		// 이때 선언되는 변수를 type형(참조형, reference형)
		//		변수 라고 한다.
		// type형 변수를 clear 할때는
		//		null 키워드를 사용하여 clear 할수 있다.
		// type형 변수는 clear 하지 않고
		//		직접 초기화, 생성을 하기도 한다.
		String s = ""; 
		s = new String();
		
		StudentVO studentVO = null; // clear
		studentVO = new StudentVO(); // 초기화, 생성
		
		String sNull = null;
		
		Integer num1 = 0; 		// 숫자 0을 값으로 갖는 변수
		Integer num2 = null; 	// 아무런 값도 없는 변수
		
		Float fnum1 = null;
		Double dNum1 = null;
		Boolean boo = null;
		Character cA = null;
	}

}
