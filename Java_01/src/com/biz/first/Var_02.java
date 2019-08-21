package com.biz.first;

public class Var_02 {

	public static void main(String[] args) {
		// 변수의 명명규칙(문법규칙)
		// 1. 첫글자는 반드시 영문소문자
		// 2. 여러단어를 묶어서 의미있게 명명
		//   변수이름만 보고 어떤 데이터가
		//	 저장되어 있는지 유추할수 있도록
		// 3. 중간, 끝에는 숫자를 포함할수 있다
		// 4. 경우에 따라 _ (Under Score)를 포함가능
		// 5. 첫글자에 _ (Under Score)를 사용할수도 있다
		// 6. 첫글자 숫자, 
		//		중간에 빈칸, 
		//		4칙연산기호 등 포함 불가
		// 변수의 Carmel Case 명명패턴
		// 1. 변수명을 여러단어로 묶어 만들경우
		//	  각 단어가 시작될때는 대문자로
		//	  (단, 첫글자는 제외)
		// 2. 또는 단어와 단어사이를 _ 로 연결
		int intNum1=30;
		int intNum2 = 40;
		System.out.println(intNum1+intNum2);
		System.out.println(intNum1+intNum2);
		System.out.println(intNum1 - intNum2);
		
	}

}
