package com.biz.grade.exec;

import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentServiceImpV1;

public class GradeEx_01 {

	public static void main(String[] args) {

		StudentService stdService = new StudentServiceImpV1();
		
		stdService.input(2);
		stdService.list();
		
		
	}

}
