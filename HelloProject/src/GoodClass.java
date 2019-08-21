
public class GoodClass {

	// System.out.prinln("Good Morning");
	public static void main(String[] args) {
		
		// 괄호안에 포함된 어떤 것들을 console에 보여라
		// 하는 명령문
		System.out.println("Good Morning");
		
		// 괄호안에 아무것도 포함하지 않으면
		// 그냥 빈줄을 한줄 표시하라
		System.out.println();
		System.out.println(30*40);
		System.out.println(40/20);
		System.out.println(30-20);
		
		// 따옴표로 묶이지 않은 숫자는
		// 숫자 데이터, 숫자 리터럴이라고 부른다.
		System.out.println(40+20);
		// 숫자 데이터는 4칙연산을 수행할수 있고
		// 수학에서 사용하는 연산과 같은 역할을 한다.
	
		// 큰따옴표(더블쿼테이션)로 묶여있는 어떤것을
		// 문자열 데이터, 문자열 리터럴 이라고 부른다
		System.out.println("대한" + "민국");
		// 문자열 데이터는 주로 덧셈 연산만 수행할수 있고
		// 문자열들을 서로 연결시키는 역할만 수행한다.
		
		// 숫자 데이터이지만 
		// 큰 따옴표로 묶게 되면
		// 문자열이 되고 문자열 데이터와 같이 취급이 된다.
		System.out.println("30" + "40");
		
		// 큰따옴표로 묶인 데이터는
		// 어떤 모양이든 관계없이 그냥 있는 그대로의 
		// 문자열로 취급된다.
		System.out.println("30 + 40");
	
	}

}
