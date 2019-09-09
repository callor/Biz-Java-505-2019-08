package com.biz.grade.exec;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImpV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreService scService = new ScoreServiceImpV1();
		scService.input(10);
		scService.total();
		scService.rank();
		scService.list();

	}

}
