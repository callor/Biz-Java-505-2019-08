package com.biz.books.domain;
/*
 * 도서정보를 관리하기 위한
 * 도서정보를 저장, 연산하기 위한 domain class 선언
 * 
 * ISBN : b_isbn String
 * 도서명 : b_title String
 * 저자 : b_writer String
 * 출판사 : b_comp String
 * 역자 : b_trans String
 * 가격 : b_price int
 * 페이지수 : b_page int
 * 발행일 : b_date String
 */
public class BookVO {
	
	private String b_isbn;
	private String b_title;
	private String b_writer;
	private String b_trans;
	private int b_price;
	private int b_page;
	private String b_date;

}
