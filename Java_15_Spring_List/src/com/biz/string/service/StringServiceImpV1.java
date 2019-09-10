package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StringServiceImpV1 implements StringService {

	List<String> strList;
	Scanner scan;
	Random rnd;
	/*
	 * 매개변수가 없는 생성자 
	 * 	= 기본생성자, super 생성자
	 * 1. 필드(맴버변수)중에 객체들을 사용할 수 있도록
	 * 		초기화, 생성 코드를 작성하는 영역
	 * 	: NullpointException을 방지하기 위한 코드
	 */
	public StringServiceImpV1() {
		strList = new ArrayList<String>();
		scan = new Scanner(System.in);
		rnd = new Random();
	}
	
	@Override
	public void input() {
		
		//1. 생성할 배열크기를 먼저 설정한 후
		//	 각 요소의 값을 설정(할당)하는 방법
		String[] strStudent = new String[3];
		strStudent[0] = "홍길동:서울특별시:010-111:33";
		strStudent[1] = "성춘향:남원시:010-222:16";
		strStudent[2] = "이몽룡:익산시:010-333:18";
		
		//2. 배열에 설정(할당)할 요소가 미리 정해진 경우
		//	배열의 크기를 설정하지 않고
		//	요소를 나열하여 배열의 크기를 자동 설정한 후
		//	요소를 설정(할당, 채워넣기)하는 방법
		String[] strNation 
			= new String[] {
					"대한민국",
					"미국",
					"프랑스",
					"영국",
					"독일"};
		
		for(int i = 0 ; i < strStudent.length; i++) {
			System.out.println(strStudent);
		}
	}

	@Override
	public void list() {
	}

	@Override
	public void view() {
	}

}
