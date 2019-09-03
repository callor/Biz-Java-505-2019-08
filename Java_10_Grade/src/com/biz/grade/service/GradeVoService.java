package com.biz.grade.service;

import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeVoService {

	private GradeVO[] gradeVO;
	Random rnd ;
	
	public GradeVoService(int length) {
	
		gradeVO = new GradeVO[length];
		for(int i = 0 ; i < gradeVO.length ; i++) {
			gradeVO[i] = new GradeVO();
		}
		rnd = new Random();
	} // GradeVoService() end
	
	// Random을 이용해 점수 생성
	public void input() {
		// gradeVO 객체 배열의 개수만큼 반복하겠다.
		for(int i = 0 ; i < gradeVO.length ; i++) {
			// 학번을 00001 ~ 00???
			String strNum = String.format("%05d", (i+1) );
			gradeVO[i].strNum = strNum;
			
			// 51부터 100까지의 임의 숫자를 생성
			int intKor = rnd.nextInt(50) + 51;
			gradeVO[i].intKor = intKor;
			
			gradeVO[i].intEng = rnd.nextInt(50) + 51;
			gradeVO[i].intMath = rnd.nextInt(50) + 51;
		}
	} // input() end
	
	// 총점과 평균 계산
	public void total() {
		
		// 평균을 계산하여 gradeVO의 intAvg 변수에 저장
		
		for(int i = 0 ; i < gradeVO.length ; i++) {
			int intSum = gradeVO[i].intKor;
			intSum += gradeVO[i].intEng;
			intSum += gradeVO[i].intMath;
			
			gradeVO[i].intSum = intSum;
			gradeVO[i].intAvg = intSum / 3;
		}

	}
	
	/*  학번   국어 영어수학 총점  평균  석차
	 * 	------------------------------------------------------
	 *  00016	 78	 71	100	  249	 83	  7
	 *  00017	 92	 73	 65	  230	 76	 10
	 *  00018	 54	 91	 52	  197	 65	 19
	 *  00019	100	100	 70	  270	 90	  3
	 *  00020	 94	 69	 52	  215	 71	 13
	 *  ======================================================
	 *  	    총점                평균의평균
	 * 
	 * 
	 */
	
	public void view() {
		
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal = 0;
		int intSumTotal = 0;
		int intAvgTotal = 0;
		
		System.out.println("=====================================================");
		System.out.println("성적일람표");
		System.out.println("======================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("------------------------------------------------------");

		for(int i = 0 ; i < gradeVO.length; i++) {
			System.out.printf("%s\t",gradeVO[i].strNum);
			System.out.printf("%3d\t",gradeVO[i].intKor);
			System.out.printf("%3d\t",gradeVO[i].intEng);
			System.out.printf("%3d\t",gradeVO[i].intMath);
			System.out.printf("%5d\t",gradeVO[i].intSum);
			System.out.printf("%3d\t",gradeVO[i].intAvg);
			System.out.printf("%3s\n",gradeVO[i].intRank);
			
			intKorTotal += gradeVO[i].intKor;
			intEngTotal += gradeVO[i].intEng;
			intMathTotal += gradeVO[i].intMath;
			intSumTotal += gradeVO[i].intSum;
			intAvgTotal += gradeVO[i].intAvg;

		}
		System.out.println("======================================================");
		System.out.print("\t"); // 학번 없음
		System.out.printf("%3d\t",intKorTotal);
		System.out.printf("%3d\t",intEngTotal);
		System.out.printf("%3d\t",intMathTotal);
		System.out.printf("%5d\t",intSumTotal);
		
		System.out.printf("%3d\n",(intAvgTotal / gradeVO.length));
		System.out.println("======================================================");
		
		
	} // view() end
	
	// 총점을 기준으로 내림차순 정렬을 수행하고
	// 1 ~ 배열개수 만큼 각각 값을 intRank 변수에 저장하여
	// 석차를 부여
	// 단, 동점자 처리는 하지 않는다.
	public void rank() {
		
		for(int i = 0; i < gradeVO.length; i++) {
			for(int j = i+1 ; j < gradeVO.length ; j++) {
				if(gradeVO[i].intSum < gradeVO[j].intSum) {
					// GradeVO 클래스를 이용하여
					// _temp 임시 객체를 선언하고
					// gradeVO[i] 를 _temp 객체에 복사
					// gradeVO[i]에 포함된 맴버변수들이
					// 통째로 _temp 변수에 복사가 된다.
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
				}
			}
		} // for i end
		
		for(int i = 0 ; i < gradeVO.length; i++) {
			gradeVO[i].intRank = i + 1;
		}
	} // rank() end

	// 학번 순으로 다시 재 정렬
	// 학번순번대로 오름차순 정렬
	public void sort() {
		
		for(int i = 0 ; i < gradeVO.length; i++) {
			for(int j = i + 1 ; j < gradeVO.length ; j++) {
				if( Integer.valueOf(gradeVO[i].strNum) 
						> Integer.valueOf(gradeVO[j].strNum)) {
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
				}
			}
		}
		
	}
	
}
