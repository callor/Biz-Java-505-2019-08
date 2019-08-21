/*
 * 이표시는 주석을 표시하는 영역
 * 여기에는 어떤 문장이던 자유롭게 작성할수 있다.
 * 컴파일러는 이 영역에 표시된 항목은
 * 무엇이든 무시하기 때문에
 * 프로젝트, 클래스 등에 대한 설명을 작성할수 있다.
 * 
 * public class Hello 는 자바로 소스코드(명령서)를 작성할때
 * 가장 기본적으로 소스코드의 형식을 구현하는 문법 구조로 
 * 반드시 만들어야 되는 명령문이다.
 * public, class 는 명령어이며 코딩에서는 
 * 		keyword라고 부른다
 *  	또는 예약어(reserved word)라고 한다.
 *  
 *  예약어는 문법구조에 맞는 대소문자를 지켜야 한다.
 *  그리고 keyword를 나열해서 명령문(statement)을 만들때는
 *  keyword 사이에 빈칸을 1개 이상 포함해야 한다.
 * 
 */
public class Hello {

	// 이 표시는 1줄짜리 주석문(remark)
	// 계속해서 주석문을 작성
	// main() 
	public static void main(String[] args) {

		// 키워드를 점(.)사용해서 연결하는 명령문도 있는데
		// 빈칸으로 연결하는 명령문과 약간 개념이 다르다.
		// println()
		System.out.println("Hello Korea");
		System.out.println(30+40);
		System.out.println(1+2+3+4+5);
		
	}
}
