package com.biz.iolist.service;

import com.biz.iolist.model.IolistVO;

/*
 * IolistSeriveImpV2에서
 * IolistServiceImpV1을 상속 받았다.
 */
public class IolistServiceImpV2 
			extends IolistServiceImpV1 {

	/*
	 * V1에 이미 작성된 list() 메서들
	 * Override, 재 정의 하였다.
	 */
	@Override
	public void list() {
		
		System.out.println("=====================");
		System.out.println("판매리스트");
		System.out.println("=====================");
		System.out.println("상품이름\t단가\t수량\t공급가액\t부가세\t공금대가");
		System.out.println("--------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrPName() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%5d\t",vo.getIntQty());
			
			// 부가세별도 금액 : 일반 금액을 1.1로 나눈 값
			int amt = (int)(vo.getIntTotal() / 1.1);
			
			// 부가가치세 = 일반금액 - 부가세별도금액
			int vat = vo.getIntTotal() - amt;
			
			System.out.printf("%5d\t",amt);
			System.out.printf("%5d\t",vat);
			System.out.printf("%5d\n",vo.getIntTotal());
		}
		
	}

}
