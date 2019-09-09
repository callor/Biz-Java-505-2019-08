package com.biz.grade.exec;

public class StringComp {

	public static void main(String[] args) {

		int sort = "A".compareTo("A");
		System.out.println(sort);
		System.out.println("A".compareTo("B"));
		System.out.println("B".compareTo("A"));
		
		System.out.println("F".compareTo("A"));
		System.out.println("A".compareTo("F"));
		
		System.out.println("대한".compareTo("우리"));
		System.out.println("가".compareTo("나"));
		System.out.println("ㄱ".compareTo("ㄴ"));
		
		
	}

}
