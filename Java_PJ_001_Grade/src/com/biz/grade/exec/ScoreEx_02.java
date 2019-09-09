package com.biz.grade.exec;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImptV2;

public class ScoreEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreService scService = new ScoreServiceImptV2();
		scService.input(10);
		scService.total();
		scService.rank();
		scService.list();
	}

}
