package com.biz.list.exec;

import com.biz.list.service.BookService;
import com.biz.list.service.BookServiceImpV2;

public class List_03 {

	public static void main(String[] args) {

		BookService bs = new BookServiceImpV2();
		bs.input(3);
		
	}

}
