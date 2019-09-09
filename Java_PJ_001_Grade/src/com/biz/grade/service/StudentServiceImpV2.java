package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.model.StudentVO;

public class StudentServiceImpV2 implements StudentService{

	List<StudentVO> studentList;
	Scanner scan ;

	// service 클래스의 맴버변수 영역에 선언된
	// 각종 객체(object)는
	// 반드시 생성자에서 초기화를 하자 !!
	// 그렇지 않으면 NullPointException 발생 !!!
	public StudentServiceImpV2() {
		studentList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}

	public void input(int count) {
		for(int i = 0 ; i < count ; i++) {
			// i 변수로 학번 생성
			String strNum = String.format("%05d", (i+1));
			this.input(strNum);
		}
	}
	
	public void input(String strNum) {
		
		System.out.print("이름>>");
		String strName = scan.nextLine();
		System.out.print("주소>>");
		String strAddr = scan.nextLine();
		System.out.print("전화>>");
		String strTel = scan.nextLine();
		System.out.print("학과>>");
		String strDept = scan.nextLine();
		System.out.print("학년>>");
		String strGrade = scan.nextLine();
		int intGrade = Integer.valueOf(strGrade);
		
		StudentVO vo = new StudentVO();
		vo.setStrNum(strNum);
		vo.setStrName(strName);
		vo.setStrAddr(strAddr);
		vo.setStrTel(strTel);
		vo.setStrDept(strDept);
		vo.setIntGrade(intGrade);
	}

	@Override
	public void input() {
	}

	@Override
	public void list() {
		System.out.println("====================================================");
		System.out.println("학생명부");
		System.out.println("====================================================");
		System.out.println("학번\t이름\t주소\t전화번호\t학과\t학년");
		System.out.println("----------------------------------------------------");
		for(StudentVO vo : studentList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrAddr() + "\t");
			System.out.print(vo.getStrTel() + "\t");
			System.out.print(vo.getStrDept() + "\t");
			System.out.print(vo.getIntGrade() + "\n");
		}
		System.out.println("====================================================");
	}
}
