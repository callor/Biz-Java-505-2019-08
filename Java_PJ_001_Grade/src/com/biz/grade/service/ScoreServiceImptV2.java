package com.biz.grade.service;

import java.util.Collections;
import java.util.Comparator;

import com.biz.grade.model.ScoreVO;

public class ScoreServiceImptV2 
		extends ScoreServiceImpV1 implements ScoreService{
	
	/*
	 * method내의 익명클래스를 사용한 보조연산
	 */
	public void rank() {
		Collections.sort(scoreList,new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o2.getIntTotal() - o1.getIntTotal();
			}
		});
		
		int rank = 1;
		for(ScoreVO vo : scoreList) {
			vo.setIntRank(rank++);
		}
		
		Collections.sort(scoreList,new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				
				/*
				return Integer.valueOf(o1.getStrNum()) - 
						Integer.valueOf(o2.getStrNum());
				*/
				return o1.getStrNum().compareTo(
						o2.getStrNum());
			}
		});

	}

}
