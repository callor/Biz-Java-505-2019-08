package com.biz.list.exec;

public class Try_Catch {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		// 문자열형 숫자를 정수로 바꾸어서 변수에 보관
		try {
			num1 = Integer.valueOf("30");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력한 값에 문자열이 포함되 숫자로 변환 하지 못함");
		}
		
		try {
			num2 = Integer.valueOf("40 ");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력한 값에 문자열이 포함되 숫자로 변환 하지 못함");
		}
		
		try {
			num3 = Integer.valueOf(" 50");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력한 값에 문자열이 포함되 숫자로 변환 하지 못함");
		}
		
		int sum = num1 + num2 + num3;
		System.out.println(sum);
		
	}

}
