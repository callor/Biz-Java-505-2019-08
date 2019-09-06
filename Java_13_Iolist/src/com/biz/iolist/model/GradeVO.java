package com.biz.iolist.model;
/*
 * VO 클래스 만들기
 * 1. private으로 시작하는 맴버변수들 정의
 * 2. getter() setter() 메서드 정의
 * 3. super 생성자, field 생성자 정의
 * 4. toString() 정의
 * 5. 2 ~ 4까지는 이클립의 자동코드 생성기능을 이용하자
 */
public class GradeVO {

	private String strNum;
	private String  strName;
	private int intKor;
	
	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GradeVO(String strNum) {
		this.strNum = strNum;
	}
	
	public GradeVO(String strNum, String strName, int intKor) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.intKor = intKor;
	}




	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	/*
	 * Object클래스에 정의된 toString() 메서드는
	 * 객체가 생성된 주소를 보여주는 메서드이다
	 * 실제 자바에서 객체가 생성된(저장된)주소는 별 의미가 없다
	 * 
	 * 그래서 vo 클래스를 만들때
	 * 이클립스의 자동코드 작성 기능을 이용해서
	 * toString() method를 재 정의한다.
	 * 
	 * 이렇게 재 정의를 하면
	 * vo 객체의 맴버변수에 어떤 값을 setting 한후
	 * 값들이 정상적으로 저장되어 있는가
	 * 확인하는 용도로 toString()을 사용할수 있다.
	 */
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + "]";
	}
	
	
	
	
	
}
