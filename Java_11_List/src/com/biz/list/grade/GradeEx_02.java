package com.biz.list.grade;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.service.GradeService;
import com.biz.list.service.GradeServiceImt_02;

public class GradeEx_02 {

	public static void main(String[] args) {

		// GradeSerivce interface로 gs 객체를 정의
		//				 GradeServiceImp_01()을 이용해서
		//				 gs 객체를 생성
		//GradeService gs = new GradeServiceImp_01();
		GradeService gs = new GradeServiceImt_02();
		
		
		// List interface로 nums 객체를 정의
		//					ArrayList()를 이용해서
		//					nums 객체를 생성
		List<Integer> nums = new ArrayList<Integer>();
		
		gs.input(10);
		gs.total();
		gs.view();
		
	}

}
