package com.biz.gp.domain;

public class ScoreVO {
	
	private String s_num;
	private int s_kor;
	private int s_eng;
	private int s_math;
	
	public ScoreVO() {
	}

	/*
	 * Builder 클래스를 매개변수로 갖는 생성자 코드 선언
	 * Builder 클래스는 현재 ScoreVO가 가지고 있는 Inner class
	 */
	public ScoreVO(Builder builder) {
		this.s_num = builder.s_num;
		this.s_kor = builder.s_kor;
		this.s_eng = builder.s_eng;
		this.s_math = builder.s_math;
	}

	@Override
	public String toString() {
		return "ScoreVO [s_num=" + s_num + ", s_kor=" + s_kor + ", s_eng=" + s_eng + ", s_math=" + s_math + "]";
	}
	
	/*
	 * Builder 클래스를 선언
	 * 1. 실제 클래스(ScoreVO)의 필드변수를 복사하여 붙이
	 * 2. 필드변수들의 getter() 생성
	 */
	public static class Builder {
		
		private String s_num;
		private int s_kor;
		private int s_eng;
		private int s_math;
		
		// 객체 메서드 chaining 방법으로 코딩하기 위한 
		// bj.s_num().s_kor().s_eng().s_math()
		public Builder s_num(String s_num) {
			this.s_num = s_num;
			return this;
		}
		public Builder s_kor(int s_kor) {
			this.s_kor = s_kor;
			return this;
		}
		public Builder s_eng(int s_eng) {
			this.s_eng = s_eng;
			return this;
		}
		public Builder s_math(int s_math) {
			this.s_math = s_math;
			return this;
		}
		
		public ScoreVO build() {
			return new ScoreVO(this);
		}
	
	}
	
	
	
	
	

}
