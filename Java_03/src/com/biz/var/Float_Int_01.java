package com.biz.var;

public class Float_Int_01 {

	public static void main(String[] args) {

		float fNum = 0;
		int intNum = 0;
		
		// 형변환(type converter, cascading)
		
		// 정수를 실수형변수에 담으려고 하면
		// 특별히 문제 될 사항이 없어서
		// 자연스럽게 변환작업이 이루어지고
		// 코드가 실행된다.
		fNum = intNum; // 암시적형변환,자동형변환
		
		// 실수를 정수형변수에 담으려고 하면
		// 컴파일러는 분명 개발자의 
		//		코딩 착각으로 생각하고
		// 		오류를 보여준다.
		// 이때 개발자가 필요에 의해서 의해서
		// 	  	실수값의 소수점 이하를 무조건 잘라버리고
		//		정수부분만 필요하다면
		// 		컴파일러에게 요청을 한다.
		intNum = (int)fNum;// 명시적형변환,강제형변환
		
	}
}
