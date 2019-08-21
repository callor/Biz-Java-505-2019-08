package com.biz.first;

public class Var_03 {

	public static void main(String[] args) {
		
		int intKorGrade = 90; // 변수선언, 값저장(할당)
		int intEngGrade = 70;
		int intMathGrade = 60;
		
		// 변수선언, 0을 저장(할당)
		int intSum = 0;

		// 이미 선언된 변수를 재 활용
		intSum = intKorGrade+intEngGrade+intMathGrade;
		
		// 총점계산후 console에 보여라
		// System.out.println(intKorGrade
		//		+intEngGrade
		//		+intMathGrade);
		System.out.println(intSum);
				
		// 국어와 수학의 합계?
		intSum = intKorGrade+intMathGrade;
		System.out.println(intSum);
		
		// 국어와 영어의 합계?
		intSum = intKorGrade+intEngGrade;
		System.out.println(intSum);
		
		// 영어와 수학의 합계?
		intSum = intEngGrade+intMathGrade;
		System.out.println(intSum);
		
		
		
		
		
	}

}
