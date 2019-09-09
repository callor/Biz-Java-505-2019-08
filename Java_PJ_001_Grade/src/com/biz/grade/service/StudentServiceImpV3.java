package com.biz.grade.service;

import java.util.List;

import com.biz.grade.model.StudentVO;

public class StudentServiceImpV3 
		extends StudentServiceImpV2 
		implements StudentService {

	
	List<StudentVO> studentList;	
	// 배열을 생성할때
	// 개수를 지정하지 않고
	// 초기값을 직접대입하여 배열을 만드는 방법
	String[] stdList = new String[] {
		"홍길동:서울특별시:010-111-1111:컴공과:3",
		"이몽룡:익산시:010-111-1111:전기공학:2",
		"성춘향:남원시:010-111-1111:경영학과:1"
	};
	
	// 요소가 10개인 nums 배열을 선언하고
	// 값을 초기화 하는
	int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
	
	
	@Override
	public void input() {
		for(int i = 0 ; i<stdList.length; i++) {
			
			// stdList i 번째 문자열을
			// 콜론(:) 구분자로 분해해서
			// stds 배열에 담아라
			String[] stds = stdList[i].split(":");
			// stds[0] 이름
			// stds[1] 주소
			// stds[2] 전화번호
			// stds[3] 학과
			// stds[4] 학년
			
			StudentVO vo = new StudentVO();
			vo.setStrName(stds[0]);
			vo.setStrAddr(stds[1]);
			vo.setStrTel(stds[2]);
			vo.setStrDept(stds[3]);
			vo.setIntGrade(Integer.valueOf(stds[4]));

			studentList.add(vo);
		}
	}


}
