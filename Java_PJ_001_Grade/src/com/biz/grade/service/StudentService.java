package com.biz.grade.service;

public interface StudentService {
	
	// 1개의 데이터를 입력하는 method
	public void input();
	
	// 학번을 문자열로 받고 1개의 데이터를 입력하는 method
	public void input(String strNum);
	
	// count 개수만큼 데이터를 입력하는 method
	public void input(int count);

	// 리스트 보기
	public void list() ;
	
}
