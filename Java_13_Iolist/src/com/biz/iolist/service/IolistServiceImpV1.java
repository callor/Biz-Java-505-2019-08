package com.biz.iolist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.iolist.model.IolistVO;

public class IolistServiceImpV1 implements IolistService {

	/*
	 * 접근제한자
	 * public : 누구나 접근가능한 친구들
	 * private : 나만(현재 클래스내에 있는 method에서만) 
	 * 		접근 가능한 친구들
	 * 
	 * protected 
	 * 		private 성질을 가지면서
	 * 		현재 클래스를 상속한 곳에서는
	 * 		자유롭게 접근할수 있도록 개방하는 접근자
	 * 
	 * IolistEx_01이나 IolistEx_02에서는 접근 불가!!
	 * IolistSerivceImpV2는 ImpV1을 상속받았으므로
	 * 		접근 가능
	 */
	
	// 입력한 데이터를 보관할 리스트 저장소
	// 선언만
	protected List<IolistVO> iolist;

	// 생성자 메서드
	// 외부에서 이 클래스를 사용하여 객체로 선언할때
	// 자동으로 실행되는 method
	// 1. 맴버변수나 객체등 작동하는데 필요한 요소들을
	//		초기화 하는 코드를 작성
	public IolistServiceImpV1() {
		// 이 코드가 누락되면
		// input() method에서 NullpointException이 발생한다
		iolist = new ArrayList<IolistVO>();
		
	}
	
	@Override
	public void input() {
		
		IolistVO iolistVO = new IolistVO();
		Random rnd = new Random();
		
		// 상품이름을 "일반미 1호" 형식으로 생성
		int intH = rnd.nextInt(5) + 1; 
		String strPName = String.format("청정미 %d 호", 
				intH); 
		
		// 임의의 시간문자열 생성
		int intHour = rnd.nextInt(24);
		int intMin = rnd.nextInt(60);
		int intSec = rnd.nextInt(60);
		String strTime = String.format("%02d:%02d:%02d",
				intHour, intMin, intSec);
		
		// 임의의 수량을 생성
		int intQty = rnd.nextInt(30) + 10;
		
		iolistVO.setStrDate("2019-09-06");
		iolistVO.setStrTime(strTime);
		iolistVO.setStrPName(strPName);
		iolistVO.setIntPrice(intH * 1000);
		iolistVO.setIntQty(intQty);

		// iolistVO(1개 판매데이터)를 List에 추가
		iolist.add(iolistVO);
		
	}

	@Override
	public void input(int count) {
		for(int i = 0 ; i < count ; i++) {
			this.input();
		}
	}

	/*
	 * iolist에 저장된 VO 들의 total값을 계산
	 */
	@Override
	public void total() {

		int nSize = iolist.size();
		for(int i = 0 ; i < nSize ; i++) {
			
			// vo 변수(객체)에는 iolist의 i 번째 vo의 주소가
			// 복사된다.
			IolistVO vo = iolist.get(i);
			
			// iolist.get(i).intPrice 읽고
			// iolist.get(i).intQty를 읽어서 덧셈한후
			// total에 잠시 보관
			int total = vo.getIntPrice() * vo.getIntQty();
			
			// iolist의 i번째에 보관중인 iolistVO의
			// intTotal (자동으로)변수를 찾아가서
			// 값을 저장해 준다.
			vo.setIntTotal(total);
			
		}
		
		// vo는 iolist 개수만큼 자동 반복 실행 되면서
		// iolist에서 순서대로 iolistVO를 하나씩 꺼내서
		// 그 주소를 vo에 담아주고
		// 위의 for() 명령문과 같은 형식의 코드가 실행된다
		for(IolistVO vo : iolist) {
			int total = vo.getIntPrice() * vo.getIntQty();
			
			// iolist 현재 위치에 있는 
			//		iolistVO의 total변수를
			// 자동으로 찾아가서 값을 세팅해준다.
			vo.setIntTotal(total);
		}
	}

	@Override
	public void list() {

		System.out.println("====================================");
		System.out.println("판매 리스트");
		System.out.println("====================================");
		System.out.println("거래일자\t거래시각\t상품이름\t단가\t수량\t금액");
		System.out.println("------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrTime() + "\t");
			System.out.print(vo.getStrPName() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%5d\t",vo.getIntQty());
			System.out.printf("%8d\n",vo.getIntTotal());
		}
		System.out.println("===================================");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
