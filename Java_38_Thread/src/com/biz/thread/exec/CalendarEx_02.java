package com.biz.thread.exec;

import com.biz.thread.classes.Cal_S_01;
import com.biz.thread.classes.Cal_S_02;

public class CalendarEx_02 {
	
	public static void main(String[] args) {
		
		Cal_S_01 ca1 = new Cal_S_01();
		ca1.start();

		Cal_S_02 ca2 = new Cal_S_02();
		ca2.start();

		
	}

}
