package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {

		StudentVO[] stVO = new StudentVO[3];
		for(int i = 0 ; i < stVO.length ;i++) {
			stVO[i] = new StudentVO();
		}

		stVO[0].strNum = "001";
		stVO[0].strName = "홍길동";
		stVO[0].strTel = "010-1111-1111";

		stVO[1].strNum = "002";
		stVO[1].strName = "이몽룡";
		stVO[1].strTel = "010-2222-2222";

		stVO[2].strNum = "002";
		stVO[2].strName = "성춘향";
		stVO[2].strTel = "010-3333-3333";

		// 학생 명부 
		System.out.println("================================");
		System.out.println("학생명부");
		System.out.println("--------------------------------");
		System.out.println("학번\t이름\t전화번호");
		System.out.println("--------------------------------");
		for(int i = 0 ; i < stVO.length ; i++) {
			System.out.print(stVO[i].strNum + "\t");
			System.out.print(stVO[i].strName + "\t");
			System.out.print(stVO[i].strTel + "\n");
		}
		System.out.println("================================");
		
		
		
		
		
	}

}
