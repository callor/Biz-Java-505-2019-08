package com.biz.grade.model;

/*
 * 학생정보
 * 학번, num, String, strNum
 * 이름, name, String, strName
 * 주소, addr, String, strAddr
 * 전화번호, tel, String, strTel
 * 학과,dept, String, strDept
 * 학년,grade, int, intGrade
 */
public class StudentVO {
	
	private String strNum;
	private String strName;
	private String strAddr;
	private String strTel;
	private String strDept;
	private int intGrade;
	
	public StudentVO(String strNum, String strName, String strAddr, String strTel, String strDept, int intGrade) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.strDept = strDept;
		this.intGrade = intGrade;
	}
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrDept() {
		return strDept;
	}
	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}
	public int getIntGrade() {
		return intGrade;
	}
	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	// 데이터 확인용
	@Override
	public String toString() {
		return "StudentVO [strNum=" + strNum + ", strName=" + strName + ", strAddr=" + strAddr + ", strTel=" + strTel
				+ ", strDept=" + strDept + ", intGrade=" + intGrade + "]";
	}
	
	 
	
}
