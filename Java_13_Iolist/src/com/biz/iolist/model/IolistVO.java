package com.biz.iolist.model;

/*
 * 거래일자, 
 * 거래시각, 
 * 상품이름, 
 * 상품단가, 
 * 수량, 
 * 상품금액(상품단가 * 수량)
 */
public class IolistVO {
	/*
	 * 맴버변수
	 * 필드
	 * (클래스의) 속성
	 * property
	 */
	private String strDate;
	private String strTime;
	private String strPName;
	
	private int intPrice;
	private int intQty;
	private int intTotal;
	
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrTime() {
		return strTime;
	}
	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}
	public String getStrPName() {
		return strPName;
	}
	public void setStrPName(String strPName) {
		this.strPName = strPName;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntQty() {
		return intQty;
	}
	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	
	
	
	

}
