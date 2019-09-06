package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV2;

/*
 * 그동안 판매관리 App을 사용하여 일반미 판매관리를
 * 잘 사용했다.
 * 
 * 그런데 새로운 미션이 내려왔다.
 * 햇반제품을 판매를 시작하면 판매관리를 변경해야할 일이
 * 발생을 했다.
 * 
 * 일반미를 판매할때는 단순히 단가 * 수량 = 판매금액의 계산만
 * 하면 되었는데
 * 
 * 햇반을 판매하면서
 * 부가가치세(VAT:Value Added Tax)를 계산을 해서
 * 보여주어야 할 필요가 생겼다.
 * 
 * 1. 햇반을 판매하기 위해서 
 * 		새로운 프로젝트를 만들어야 할까?
 * 2. 기존에 사용한 IolistService... 
 * 		클래스를 복사 붙이기 하여
 * 		일부 코드를 변경하여 사용할까?
 * 
 * 객체지향 언어인 java에서는 
 * 상속(inheritance)라는 기능을 이용하게 된다.
 * 상속 = 물려받는다 라는 개념인데
 * java에서는 물려받는다는 개념 
 * 		+ 기존의 기능을 확장해서 사용한다
 * 
 */
public class IolistEx_02 {
	
	public static void main(String[] args) {
		IolistService ioService = new IolistServiceImpV2();
		
		ioService.input(5);
		ioService.total();
		ioService.list();

	}
	
	

}
