package com.biz.files.service;

public interface GradeService {
	
	// 임의 난수를 발생시켜서
	// 성적일람표 파일을 생성 method
	public void makeScoreFile(String scoreFile, int length) 
			throws Exception ;
	
	//1. 이름표가 있는 파일을 열어서 nameList를 작성
	public void readNameFile(String nameFile);
	
	//2. nameList에 학번을 부여해서 학생명부 파일을 작성
	public void makeStudentFile(String StudentFile, int length);

}
