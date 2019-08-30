package com.biz.classes.service;

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

/*
 * ~~Service 클래스
 * 서버스 클래스는 데이터를 활용하여
 * 다양한 연산을 수행하는 클래스들을 지칭하는 접미사
 */
public class GradeScoreService {

	/*
	 * gradeScoreVO 맴버(객체)변수는
	 * GradeScoreService 클래스내의 method에서만
	 * 읽고, 쓰기를 하고 있다.
	 * 
	 * 만약
	 * GSEx_03에서 gradeScoreVO 맴버변수를 읽기, 쓰기를
	 * 수행한다면
	 * 당연히 이변수는 public 키워드로 시작을 해야 한다. 
	 * 
	 * 그런데 현재 코드상에서
	 * GradeScoreService 가 아닌곳에서
	 * gradeScoreVO 맴버변수를 접근하지 않는다.
	 * 
	 * 이럴때는
	 * 아예 다른 곳에서 gradeScoreVO 맴버변수를
	 * 참조, 접근 하지 못하도록 해도 된다.
	 * 이제 gradeScoreVO 변수는
	 * 다른 곳에서 참조하지 못하도록 키워드를
	 * private으로 설정을 한다.
	 * 
	 * private :
	 *    public은 누구나 접근, 참조 할수 있다는 의미
	 *    private은 현재 클래스내의 메서드에서만
	 *    	접근, 참조가 가능하도록 제한하는 키워드이다.
	 */
	private GradeScoreVO[] gradeScoreVO;
	
	public void newVO(int length) {
		
		// length 변수에 담긴 숫자만큼
		// GradeScoreVO 배열을 만들어서
		// gradeScoreVO에 할당한다.
		gradeScoreVO = new GradeScoreVO[length];
	
	}
	
	public void makeScore() {
		Random rnd = new Random();
		
		for(int i = 0 ; i < gradeScoreVO.length ; i++) {
			gradeScoreVO[i] = new GradeScoreVO();
			
			String strNum = String.format("%03d", i+1);
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;

			gradeScoreVO[i].strNum = strNum;
			gradeScoreVO[i].intEng = intEng ;
			gradeScoreVO[i].intMath = intMath ;
			gradeScoreVO[i].intKor = intKor ;
			
			gradeScoreVO[i].total();
			gradeScoreVO[i].average();
			
		}
	} // makeScore end
	
	public void scoreList() {
		System.out.println("=============================================");
		System.out.println("성적 일람표");
		System.out.println("---------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		for(int i = 0 ; i < gradeScoreVO.length ; i++) {
			System.out.print(gradeScoreVO[i].strNum + "\t");
			System.out.printf("%3d\t", gradeScoreVO[i].intKor);
			System.out.printf("%3d\t", gradeScoreVO[i].intEng);
			System.out.printf("%3d\t", gradeScoreVO[i].intMath);
			System.out.printf("%3d\t", gradeScoreVO[i].total);
			System.out.printf("%5.2f\n", gradeScoreVO[i].average);
		}
		System.out.println("=============================================");
	}
	
	
}
