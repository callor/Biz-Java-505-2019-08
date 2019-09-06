package com.biz.iolist.model;
/*
 * 클래스를 작성할때
 * 혹시 필요에 의해서 필드(매개변수가 있는) 생성자를
 * 		만들게 되면
 * 기본생성자(super생성)는 자동으로 만들어지지 않는다.
 */
public class AddrVO {

	private int num;
	
	// 기본생성자
	// super 생성자
	public AddrVO() {
		
	}
	
	
	// 필드 생성자
	public AddrVO(int num) {
		this.num = num;
	}
	
}
