package com.biz.string;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceV1;

public class StudentEx_01 {

	public static void main(String[] args) {

		StringService stService = new StudentServiceV1();
		
		stService.input();
		stService.list();
		
		// StudentServiceV1 클래스에
		// StringService 인터페이스에 정의되지 않은
		// search() method가 있는데,
		// 그 search() method를 사용하기 위해서
		// stService를 잠시 StudentServiceV1 인 것처럼
		// 바꾸는 것
		StudentVO stdVO 
			= ((StudentServiceV1)stService).search("00009");
		
		// search() method를 호출하면서 학번 00001을 매개변수
		// 전달하였고
		
		// 만약 해당 학번의 데이터가 있으면
		// stdVO에는 학생정보가 담겨 있을 것이다.
		
		// 혹시 데이터를 못찾았으면
		// stdVO에는 null 값이 담겨 있을 것이다.
		if(stdVO == null) { // \0 
			System.out.println("찾는 데이터 없음!!");
		} else {
			System.out.println(stdVO.toString());
		}
		
		
		
	}

}
