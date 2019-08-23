package com.biz.var;

public class Float_Int_02 {

	public static void main(String[] args) {

		int intKor = 90;
		int intEng = 80;
		int intMath = 78;
		
		int intSum = intKor + intEng + intMath;
		float fAvg = intSum / 3.0f;
		
		System.out.println("총점 : " + intSum);
		System.out.println("평군 : " + fAvg);
	}
}
