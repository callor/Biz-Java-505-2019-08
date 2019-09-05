package com.biz.list.model;
/*
 * 몽룡씨가
 * 최근에 마트를 오픈을 하면서
 * 마트에서 판매되는 거래내용을 관리할 App을 만들려고 한다
 * 거래내용을 관리할 클래스를 IolistVO로 작성한다.
 * 
 * 
 * 추상화
 * 
 * 	거래일자 : date, String
 * 	거래시각 : time, String
 * 	상품이름 : pname, String
 * 	상품단가 : price, int
 * 	수량 : qty, int
 * 	상품금액 : 상품단가 * 수량, total, int
 */
public class IolistVO {
	
	private String strDate;
	private String strTime;
	private String strPName;
	private int intPrice;
	private int intQty;
	private int intTotal;
	
	// vo객체를 생성하면서
	// 4개의 값을 세팅할수 있도록 
	// 매개변수가 있는 생성자를 작성
	public IolistVO(String strDate, 
			String strTime, 
			String strPname,
			int intPrice) {
		
		this.strDate = strDate;
		this.strTime = strTime;
		this.strPName = strPname;
		this.intPrice = intPrice;
	}

	// 날짜,시간,상품명,단가,수량을 매개변수로 받는 생성자
	public IolistVO(String strDate, 
			String strTime, 
			String strPname,
			int intPrice, 
			int intQty) {
		
		this.strDate = strDate;
		this.strTime = strTime;
		this.strPName = strPname;
		this.intPrice = intPrice;
		this.intQty = intQty;
	}

	
	
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
