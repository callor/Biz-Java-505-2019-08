package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

/*
 * 키보드에서 도서정보를 입력받아서
 * List에 추가하고
 * 목록보기, 정보보기
 * 기능이 업그레이드된 코드
 */
public class BookServiceImpV2 implements BookService {

	/*
	 * scan 객체와 bookList 객체를 선언은 했는데
	 * 아직 생성(사용할 준비가) 안된상태이므로
	 * 이 클래스의 어떤 메서든지 호출하면
	 * NullpointException이 발생할 것이다.
	 * 
	 * scan과 bookList를 생성, 초기화를 해야한다.
	 */
	Scanner scan;
	List<BookVO> bookList;
	
	/*
	 * scan과 bookList를 생성, 초기화 하는 코드를
	 * 클래스의 생성자에 작성한다.
	 */
	public BookServiceImpV2() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	
	
	
	
	@Override
	public void input(int count) {
		for(int i = 0 ; i < count ; i++) {
			System.out.println("==========================");
			System.out.println((i+1) + "번째 도서정보 입력");
			System.out.println("--------------------------");
			try {
				this.input();	
			} catch (Exception e) {
				System.out.println("데이터를 다시 입력하세요");
				i--;
				continue;
			}
		}
	}

	@Override
	public void input() {

		
		System.out.print("도서번호> ");
		String strNum = scan.nextLine();
		
		System.out.print("도서명> ");
		String strName = scan.nextLine();

		System.out.print("저자> ");
		String strWriter = scan.nextLine();
		
		System.out.print("출판사> ");
		String strComp = scan.nextLine();
		
		System.out.print("가격> ");
		String strPrice = scan.nextLine();

		int intPrice = 0;
		// 문자열형 숫자를 숫자로 변경하는 과정에서
		// 예외 상황이 자주 발생하더라
		// 예외 처리를 추가하려고 한다.
		// 1. 예외 상황이 발생할 코드를 작성
		// 2. 실행해서 예외 상황이 발생하도록 테스트하기
		// 3. 여기에서 NumberFormatException 이 발생을 하더라
		// 4. 예외 처리를 시작
		//	 가. try catch문을 작성
		//	 나. 예외가 발생할 코드를 try {} 안으로 이동
		//	 다. 예외상황을 처리하는 코드를 catch() {  }에 작성
		
		try {
			intPrice = Integer.valueOf(strPrice);	
		} catch (Exception e) {
			/*
			 * 만약 도서가격을 입력하는 도중에
			 * NumberFormat... 예외가 발생하면
			 * 현재 입력하던 도서정보를 
			 * 다시 입력하도록 코드를 작성
			 */
			/*
			 * 키보드로 부터 값을 입력받고 
			 * 변환을 하는 등의 코드가
			 * for() {  } 반복문으로 감싸져 있다면
			 * for 반복문을 재 시작하는 continue 키워드를
			 * 사용하여 다시 입력을 시도 하도록 할 수 있다.
			 * 
			 * 하지만, 
			 * 지금 작성한 input() 메서드는
			 * for 반복문에서 별도로 호출한 메서드이기 때문에
			 * continue 키워드를 사용할수 없다.
			 * 
			 * 방법은
			 * 현재 input() 메서드에서 exception이 발생을 하면
			 * 호출한 곳에 exception이 발생 했다고 알려주고
			 * 그곳에서 처리 하도록 하면 된다.
			 */
			System.out.println("!!가격은 숫자만 입력하세요!!");
			
			// throw : 나(input() method)를 호출한 곳으로
			// 예외를 던진다. 
			// 현재 발생한 예외를 네가 대신 처리해 달라
			// 라고 요청
			throw new NumberFormatException();
			
		}
		
		
		
		System.out.print("출판연도> ");
		String strPubYear= scan.nextLine();

		int intPubYear = 0;
		String s = "";
		try {
			/*
			 * intPubYear 변수를 try {} 안에서 선을 하게 되면
			 * 만약 정상적으로 코드가 수행 되고
			 * try 다음줄 명령코드를 실행하는 과정에서
			 * intPubYear 변수를 참조 할수 없다.
			 * 
			 * 반드시 try가 시작되기전에
			 * 변수를 선언하고 clear를 한 상태에서
			 * try 내에서 변수에 어떤 값을 저장하도록
			 * 코드가 작성 되어야 한다.
			 */
			// int intPubYear = Integer.valueOf(strPubYear);
			
			intPubYear = Integer.valueOf(strPubYear);
			
		} catch (Exception e) {
			System.out.println("연도는 숫자로만 입력!!!");
			// throw new NumberFormatException();

			while(true) {
				System.out.print("연도를 다시 입력(종료:-1) > ");
				String s1 = scan.nextLine();
				try {
					intPubYear = Integer.valueOf(s1);
					if(intPubYear == -1) break;
					break;
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}
		
		// 1. 키보드로 입력받은 데이터를 vo를 생성하여 저장
		BookVO bookVO = new BookVO();
		bookVO.setStrNum(strNum);
		bookVO.setStrName(strName);
		bookVO.setStrComp(strComp);
		bookVO.setStrWriter(strWriter);
		
		bookVO.setIntPrice(intPrice);
		bookVO.setIntPubYear(intPubYear);

		// 2. 생성한 vo를 bookList 에 추가
		bookList.add(bookVO);
		
	}

	@Override
	public void list() {

		System.out.println("=======================================================");
		System.out.println("도서 정보 일람표");
		System.out.println("=======================================================");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격\t출판연도");
		System.out.println("-------------------------------------------------------");

		/*
		int nSize = bookList.size();
		for(int i = 0 ; i < nSize ; i++) {
			BookVO vo = bookList.get(i);
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
		}
		*/
		for(BookVO vo : bookList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
		}
	}

	@Override
	public void view(int index) {
		
		BookVO vo = bookList.get(index);
		System.out.println("=========================");

		// 각 항목을 console에 표시 할때마다
		// bookList로 부터 index번째의 BookVO를 추출하고
		// 추출된 BookVO의 getter() 메서드를 호출하는데
		System.out.println("ISBN : " 
				+ bookList.get(index).getStrNum());

		// 코드 시작점에서
		// bookList로 부터 index번째의 BookVO를 추출하여
		// 변수에 저장해 두고
		// getter() 메서드만을 호출하여 값을 표시한다.
		// 앞 코드보다 조금은 효율이 좋을 것으로 예상된다.
		System.out.println("ISBN : " 
					+ vo.getStrNum());
		
		System.out.println("도서명 : " 
					+ vo.getStrName());
		System.out.println("출판사 : " 
					+ vo.getStrComp());
		System.out.println("저자 : " 
					+ vo.getStrWriter());
		System.out.println("가격 : " 
					+ vo.getIntPrice());
		System.out.println("출판연도 : " 
					+ vo.getIntPubYear());
		System.out.println("==========================");

	}

	@Override
	public void view(String strName) {

		int nSize = bookList.size();
		for(int i = 0 ; i <nSize;i++) {
			BookVO vo = bookList.get(i);
			String voStrName = vo.getStrName();
			
			// 도서명과 검색어(strName)이 반드시 일치하는 경우만 검색
			if(voStrName.equalsIgnoreCase(strName)) {
				this.view(i);
				// break; // 최초로 발견된 1개의 정보만 확인하고 마침
			}
			
			// 도서명 문자열중에 strName 문자열이 포함되어
			// 있으면 그 값을 표시하자
			// 중간문자열 검색
			
			// "ABC".contains("B") 
			// 문자열 ABC 중에 문자열 B가 포함되어 있냐?
			if(voStrName
					.toUpperCase()
					.contains(strName.toUpperCase())) {
				
				this.view(i);
			
			}
		}
	}
}
