package lesson01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
//		1. 몫과 나머지
//		두 수를 입력 받아서 몫과 나머지를 출력하세요.
//		
//		입력1: 843
//		입력2: 8
		
//		출력 예시
//		몫 : 105 나머지 : 3
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("입력1: " ); 
		int count = scan.nextInt();
		System.out.print("입력2: ");
		int count2 = scan.nextInt();
		
		System.out.println("몫: " + count / count2);
		
		System.out.println("나머지: " + count % count2);
		
System.out.println("------------------------------------------------------------------------");

		//		2. 교체
//		수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
//		입력 예시
//		x : 6
//		y : 4
//		
//		출력 예시
//		x는 4이고, y는 6 입니다.

//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("x :" );
//		int x = scan.nextInt();
//		System.out.print("y :" );
//		int y = scan.nextInt();
//		
//		System.out.println("x는" + " 4이고, " + "y는" + " 6입니다." );
		
System.out.println("----------------------------------------------------------------------");	

//		3. 초 변환
//		초를 입력 받아서 ?분?초 형태로 출력 하세요.

//		입력 예시
//		초 : 464

//		출력 예시
//		7분 44초

//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("초 :" );
//		int sec = scan.nextInt();
//		int sec1 = 464 / 60;
//		int sec2 = 464 % 60;
//		System.out.println(sec1 + "분 " + sec2 + "초 ");
//		
		
	}

}
