package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_02 {

	public static void main(String[] args) {

		Map<String,String> strAddr = new HashMap<String,String>();
		
		strAddr.put("홍길동","서울특별시");
		strAddr.put("이몽룡","익산시");
		strAddr.put("성춘향","남원시");
		strAddr.put("장보고","해남");
		strAddr.put("장길산","태백산");
		strAddr.put("임꺽정","함경도");

		System.out.println("장보고의 주소 :" + strAddr.get("장보고"));
		
	}

}
