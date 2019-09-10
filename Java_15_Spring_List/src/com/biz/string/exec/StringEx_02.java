package com.biz.string.exec;

public class StringEx_02 {

	public static void main(String[] args) {

		String[] nameList = new String[] {
				"홍길동:001:33",
				"이몽룡:002:18",
				"성춘향:003",
				"홍길동:001:33",
				"이몽룡:002:18",
				"성춘향:003",
				"홍길동:001:33",
				"이몽룡:002:18",
				"성춘향:003"
		};

		int nCount = 0;
		for(String s : nameList) {
			try {
				String[] names = s.split(":");
				System.out.println("이름:" + names[0]);
				System.out.println("학번:" + names[1]);
				System.out.println("나이:" + names[2]);
			} catch (Exception e) {
				System.out.println("Exception 발생");
				System.out.printf("%d 번 데이터\n",nCount);
			}
			nCount ++;
		}
		
	}

}
