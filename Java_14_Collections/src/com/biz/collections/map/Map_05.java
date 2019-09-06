package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.biz.collections.model.GradeVO;

public class Map_05 {

	public static void main(String[] args) {

		/*
		 * Map 데이터 구조
		 * 데이터를 저장할때 key, value의 쌍(pair)으로 put을 하며
		 * 데이터를 조회(찾기)할때 key 값만으로
		 * 빠르고 쉽게 찾을수 있다.
		 * 데이터가 어떤 위치(index)에 있는지 몰라도
		 * 내용으로 검색하는 연상검색 기능을 구현한다.
		 */
		Map<String,GradeVO> grades 
			= new HashMap<String,GradeVO>();
		
		GradeVO vo = new GradeVO();
		vo.setStrName("홍길동");
		vo.setIntKor(90);
		vo.setIntEng(95);
		vo.setIntMath(77);
		grades.put("홍길동", vo);

		vo = new GradeVO();
		vo.setStrName("이몽룡");
		vo.setIntKor(70);
		vo.setIntEng(55);
		vo.setIntMath(77);
		grades.put("이몽룡", vo);

		vo = new GradeVO();
		vo.setStrName("성춘향");
		vo.setIntKor(66);
		vo.setIntEng(55);
		vo.setIntMath(77);
		grades.put("성춘향", vo);

		// Map에 저장된 데이터 전체를 조회하고자 할때
		// 기본적으로 Map은 저장된 리스트를 조회하는데
		// 불편한 부분이 있다.
		// 그래서 트릭을 쓰는데
		
		//1. Map 데이터에 저장된 key만 추출해서
		//		Set에 담는다.
		//2. key를 for반복문으로 처리하려
		//	각 항목을 get(key) 메서드를 통해
		//	값을 읽어낸다.
		Set<String> gradeKeys = grades.keySet();
		for(String s : gradeKeys) {
			GradeVO v = grades.get(s);
			System.out.println(v.toString());
		}
		
		
		
	}
}
