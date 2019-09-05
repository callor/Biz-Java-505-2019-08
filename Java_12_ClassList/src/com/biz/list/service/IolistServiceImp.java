package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.IolistVO;

public class IolistServiceImp {

	List<IolistVO> iolist;

	public IolistServiceImp() {
		iolist = new ArrayList<IolistVO>();
	}

	public void input() {

		IolistVO iolistVO;

		/*
		 * 4개의 매개별수를 세팅하면서 객체를 생성하는 방법
		 * 4개의 매개변수가 있는 생성자가 작동되어
		 * 객체를 만든다
		 */
		iolistVO 
		= new IolistVO("2019-09-05", "14:00:01", "CJ햇반", 1500);
		iolist.add(iolistVO);

		iolistVO 
		= new IolistVO("2019-09-05", "14:00:02", "CJ햇반", 1500);
		iolist.add(iolistVO);

		iolistVO 
		= new IolistVO("2019-09-05", "14:00:03", "CJ햇반", 1500);
		iolist.add(iolistVO);

		iolistVO 
		= new IolistVO("2019-09-05", "14:00:04", "CJ햇반", 1500);
		iolist.add(iolistVO);

		iolistVO 
		= new IolistVO("2019-09-05", "14:00:05", "CJ햇반", 1500);
		iolist.add(iolistVO);
	} // input() end
	
	public void input(int count) {

		IolistVO iolistVO;
		Random rnd = new Random();
		
		for(int i = 0 ; i < count ; i++) {
			
			String strTime = String.format("14:00:%02d",i);
			int intH = rnd.nextInt(5) + 1;
			String strPName = String.format("일반미 %d 호",intH);
			int intQty = rnd.nextInt(30) + 10; // 10 ~ 39까지 난수
					
			/*
			 * 매개변수가 5개인 생성자를 이용해서 객체 생성
			 * 
			 */
			iolistVO 
			= new IolistVO("2019-09-05", 
						strTime, 
						strPName, 
						1000 * intH,
						intQty);
			iolist.add(iolistVO);
		}
	}
	
	public void total() {

		// 확장된 for를 이용하면
		// setter 메서드가 제대로 작동하지 않는 경우도 있다
		for(IolistVO vo : iolist) {
			int total = vo.getIntPrice() * vo.getIntQty();
			vo.setIntTotal(total);
		}

		// setter 메서드를 사용할 경우
		// setter 메서드가 제대로 작동하지 않으면
		// 고전 for를 사용해야 한다.
		int nSize = iolist.size();
		for(int i = 0 ; i < nSize ; i++) {
			IolistVO vo = iolist.get(i);
			int total = vo.getIntPrice() * vo.getIntQty();
			vo.setIntTotal(total);
		}
	
	}
	
	public void list() {
		
		System.out.println("=============================");
		System.out.println("거래내역");
		System.out.println("==================================================");
		System.out.println("일자\t\t시각\t\t상품명\t\t단가\t수량\t합계");
		System.out.println("--------------------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrTime() + "\t");
			System.out.print(vo.getStrPName() + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.print(vo.getIntQty() + "\t");
			System.out.print(vo.getIntTotal() + "\n");
		}
		System.out.println("=========================================");
		
	}

}
