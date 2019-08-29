package com.biz.classes.grade;

import java.util.Scanner;

public class GradeEx_01 {

	/*
	 * 키보드로 한 학생의 성적정보를 입력받은 후
	 * GradeVO 클래스의 객체에 저장하고
	 * 입력된 정보를 콘솔에 확인 해 보자
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=================");
		System.out.println("성적정보 입력");
		System.out.println("-----------------");
		System.out.print("학번 >> ");
		String strNum = scanner.nextLine();
		
		System.out.print("이름 >> ");
		String strName = scanner.nextLine();
		
		System.out.print("국어 >> ");
		String strKor = scanner.nextLine();
		
		System.out.print("영어 >> ");
		String strEng = scanner.nextLine();
		
		System.out.print("수학 >> ");
		String strMath = scanner.nextLine();
		
		GradeVO grade = new GradeVO();
		grade.strNum = strNum;
		grade.strName = strName;
		
		// strKor에는 문자열형 숫자가 담겨있다.
		// ?? scanner.nextLine() 메서드는
		//	 키보드로 입력한 모든 것을
		//	 문자열로 변환하여 입력받기 때문에
		grade.intKor = Integer.valueOf(strKor);
		grade.intEng = Integer.valueOf(strEng);
		grade.intMath = Integer.valueOf(strMath);
		
		grade.sum();
		
		
		
		
		
		
	}

}
