package com.biz.files.grade;

import java.io.IOException;

import com.biz.files.service.FileGradeService;
import com.biz.files.service.FileGradeServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {

		FileGradeService fg = new FileGradeServiceV1();
		String scoreFile = "src/com/biz/files/score.txt";
		
		try {
			fg.read(scoreFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fg.list();
		
	}

}
