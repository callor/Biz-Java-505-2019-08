package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_03 {

	public static void main(String[] args) {

		Map<String,Integer> mapAge = new HashMap<String,Integer>();
		
		mapAge.put("홍길동",33);
		mapAge.put("이몽룡",22);
		mapAge.put("성춘향",16);
		mapAge.put("장길산",55);
		mapAge.put("임꺽정",45);
		
		System.out.println("성춘향의 나이:" + mapAge.get("성춘향"));
		
		
		
	}

}
