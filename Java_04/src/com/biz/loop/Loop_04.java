package com.biz.loop;

public class Loop_04 {

	public static void main(String[] args) {

		int nCount = 0;
		
		// for 문내의 두번째 명령문은 boolen 식이 포함되며
		// boolen 식이 true 인 동안만 포함한 명령문들을
		// 반복 실행한다.
		for( ; nCount < 10 ; ) {
			System.out.print("대한민국 : ");
			System.out.println(nCount++);
		}
		
		
		
		
	}

}
