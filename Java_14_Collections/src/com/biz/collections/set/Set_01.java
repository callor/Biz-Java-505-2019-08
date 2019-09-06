package com.biz.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_01 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		Set<String> strSet = new HashSet<String>();

		// List는 추가한 순서대로 저장이된다
		// 추가한 데이터가 모두 잘 저장이 된다.
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("임꺽정");
		strList.add("장보고");
		
		// Set은 어떤 원리인지는 모르것지만 지 맘대로 저장
		// 이미 저장된 값은 다시 저장되지 않는다.
		// 		중복된 데이터 제외
		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");

		System.out.println(strList.toString());
		System.out.println(strSet.toString());
		
		// List형 데이터를 Set형 데이터로 변환
		// List에 담긴 데이터에서 중복값을 제외하고
		// 리스트를 얻기 위한 방법
		Set<String> strSet1 = new HashSet<String>(strList);
		System.out.println(strSet1);
		
		strList = new ArrayList<String>(strSet1);
		
		
	}

}
