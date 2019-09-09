package com.biz.grade.model;
/*
 * 점수정보
 * 학번,num, String strNum
 * 국어점수, kor, int intKor
 * 영어점수, eng, int intEng
 * 수학점수, math, int intMath
 * 총점,total, int intTotal
 * 평균,avg, int intAvg
 * 석차,rank, int intRank
 */
public class ScoreVO {

	private String strNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intTotal;
	private int intAvg;
	private int intRank;
	
	public ScoreVO(String strNum, int intKor, int intEng, int intMath, int intTotal, int intAvg, int intRank) {
		super();
		this.strNum = strNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intTotal = intTotal;
		this.intAvg = intAvg;
		this.intRank = intRank;
	}
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	public int getIntRank() {
		return intRank;
	}
	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intTotal=" + intTotal + ", intAvg=" + intAvg + ", intRank=" + intRank + "]";
	}

	
	
	
}
