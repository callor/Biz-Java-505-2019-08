package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.ScoreVO;

public class ScoreServiceImpV1 implements ScoreService {
	
	protected List<ScoreVO> scoreList;
	protected Random rnd;
	
	public ScoreServiceImpV1() {

		scoreList = new ArrayList<ScoreVO>();
		rnd = new Random();
	}
	public void input(int count) {
		for(int i = 0 ; i < count ; i++) {
			String strNum = String.format("%05d", i+1);
			
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			ScoreVO vo = new ScoreVO();
			vo.setStrNum(strNum);
			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMath);
			scoreList.add(vo);
		}
	}
	
	public void total() {
		
		for(ScoreVO vo : scoreList) {
			int total = vo.getIntKor();
			total += vo.getIntEng();
			total += vo.getIntMath();
			int avg = total /3;
			
			vo.setIntTotal(total);
			vo.setIntAvg(avg);
		}
	}

	public void rank() {
		
		for(int i = 0 ; i < scoreList.size() ; i++) {
			for(int j = i + 1; j < scoreList.size(); j++) {

				int total_i = scoreList.get(i).getIntTotal();
				int total_j = scoreList.get(j).getIntTotal();

				// List.set(index,값)
				// 이미 추가된 list의 index 위치의 값을
				// 변경하고자 할때
				if(total_i < total_j) {
					
					// scoreList의 두 위치 vo를 서로 교환
					ScoreVO _vo = scoreList.get(i);
					scoreList.set(i,scoreList.get(j));
					scoreList.set(j,_vo);
					
				}
			}
		}
		
		int intRank = 1;
		for(ScoreVO vo : scoreList) {
			vo.setIntRank(intRank++);
		}
		
	}
	
	public void list() {
		System.out.println("===========================");
		System.out.println("성적일람표");
		System.out.println("===========================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------");
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.printf("%3d\t",vo.getIntKor());
			System.out.printf("%3d\t",vo.getIntEng());
			System.out.printf("%3d\t",vo.getIntMath());
			System.out.printf("%3d\t",vo.getIntTotal());
			System.out.printf("%3d\t",vo.getIntAvg());
			System.out.printf("%3d\n",vo.getIntRank());
		}
		System.out.println("===================================");
	}

}
