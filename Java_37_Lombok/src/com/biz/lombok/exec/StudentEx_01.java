package com.biz.lombok.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {

		StudentVO sVo = new StudentVO();
		sVo.setS_num("001");
		sVo.setS_name("홍길도");
		sVo.setS_tel("010");
		
		System.out.println(sVo.toString());
		
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		stdList.add(StudentVO.builder().s_num("001").build());
		stdList.add(StudentVO.builder().s_num("001").s_name("홍길동").build());
		stdList.add(StudentVO.builder().s_num("001").s_tel("010").build());
		stdList.add(StudentVO.builder().s_num("001").s_addr("우리집").build());
		
	}
}
