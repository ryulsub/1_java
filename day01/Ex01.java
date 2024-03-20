package day01;

public class Ex01 {
	public static void main(String[] args) {
		// 정수형 변수 (integer)
		int number = 10; // 변수에 값을 넣는 것: '(처음)초기화', 할당, 대입, assign, 저장
		System.out.println(number);
		
		number = 5; // 변수이므로 값을 변경할 수 있다. 재사용 할 때는 자료형을 쓰지 않는다.
		System.out.println(number);
		
		int number2 = 100;
		int sum = number + number2;
		System.out.println(sum);
		
		// 실수 변수 (float) : 권장 안함. 오차가 있을 수 있다.
		float f = 1.5f;
		System.out.println(f);
		
		// 실수 변수 (double)
		double d = 3.8;
		System.out.println(d * number2);
		
		// 문자 변수 (character): 문자 한개. 작은 따옴표로 감싼다.
		char c = 'z';
		System.out.println(c);
		
		// boolean 변수: 참(true) 또는 거짓(false)
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println("거짓이다. " + isFalse);
	}
}

