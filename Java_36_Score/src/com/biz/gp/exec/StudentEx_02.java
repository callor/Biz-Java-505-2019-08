package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.StudentVO;

public class StudentEx_02 {

	public static void main(String[] args) {

		List<StudentVO> stdList1 = new ArrayList<StudentVO>();
		List<StudentVO> stdList2 = new ArrayList<StudentVO>();
		

		long start = System.currentTimeMillis();
		// 객체를 생성하고, setter로  필드값을 주입한 후 List에 저장
		for(long i = 0 ; i < 10000000 ; i++) {
			StudentVO stdVO = new StudentVO();
			stdVO.setSt_num(String.format("%05d",i));
			stdList1.add(stdVO);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		start = System.currentTimeMillis();
		// 필드생성자에 값을 주입하면서 직접 add() method에 객체를 주입
		for(long i = 0 ; i < 10000000 ; i++) {
			stdList2.add(new StudentVO(String.format("%05d", i)));
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);

		
		
		
	}

}
