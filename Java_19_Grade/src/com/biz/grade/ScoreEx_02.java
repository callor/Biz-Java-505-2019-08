package com.biz.grade;

import com.biz.grade.service.ScoreServiceV1;

public class ScoreEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreServiceV1 sc = new ScoreServiceV1();
		String scoreFileName = "src/com/biz/grade/성적일람표.txt";
		
		try {
			sc.read(scoreFileName);
			sc.list();
			
			sc.total();
			sc.listTotal();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
