package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_03 {

	public static void main(String[] args) {

		//********************************
		// 성적처리를 위하여
		// 학생 7명의 객체를 선언, 생성, 초기화 하는 부분
		//--------------------------------
		GradeVO grade01 = new GradeVO();
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		GradeVO grade06 = new GradeVO();
		GradeVO grade07 = new GradeVO();

		//**********************
		// 성적을 입력하는 부분
		//----------------------
		// grade01 객체의 맴버변수에 값을 setting 한다
		// 변수에 값을 저장
		grade01.strNum = "001";
		grade01.strName = "홍길동";
		
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		
		grade02.strNum = "002";
		grade02.strName = "이몽룡";
		
		grade02.intEng = 88;
		grade02.intMath = 66;
		grade02.intKor = 78;
		
		grade03.strNum = "003";
		grade03.strName = "성춘향";
		
		grade03.intEng = 98;
		grade03.intMath = 78;
		grade03.intKor = 68;
		
		//*****************************
		// 결과를 List로 출력하는 부분
		//-----------------------------
		System.out.println("==============================================");
		System.out.println("응용SW반 성적표");
		System.out.println("----------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점");
		System.out.println("----------------------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		System.out.println("==============================================");
		
	}
}
