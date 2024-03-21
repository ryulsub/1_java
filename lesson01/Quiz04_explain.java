package day03_lesson01;

import java.util.Scanner;

public class Quiz04_explain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		1. 입력1: 843
//		   입력2: 8
//		몫 : 105 나머지 : 3

//		System.out.print("입력1: ");
//		int number1 = scan.nextInt();
//		System.out.print("입력2: ");
//		int number2 = scan.nextInt();
//		
//		int quotient = number1 / number2;
//		int remainder = number1 % number2;
//		System.out.println("몫 : " + quotient + " 나머지 : " + remainder);

		System.out.println("------------------------------------------------------------------");

//		2. 교체(swap) 알고리즘
//		수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
//		입력 예시
//		x=6
//		y=4
//		
//		출력 예시
//		x는 4이고, y는 6 입니다.

//		System.out.print("x : ");
//		int x = scan.nextInt(); // 6
//		System.out.print("y : ");
//		int y = scan.nextInt(); // 4
//
//		// System.out.println("x는 " + y + " 이고, y는 " + x + " 입니다.");
//
//		// swap 알고리즘
//		int temp = x;
//		x = y;
//		y = temp;
//		System.out.println("x는 " + x + ", y는 " + y);
	
System.out.println("---------------------------------------------------------");		


		//3.
//		입력 예시
//		
//		초 : 464
//		출력 예시
//		
//		7분 44초

//		System.out.println("초 :");
//		int seconds = scan.nextInt();
//		
//		// 분, 초
//		int min = seconds / 60;
//		int seconds2 = seconds % 60;
//		System.out.println(min + "분 " + seconds2 + "초");

System.out.println("------------------------------------------------------");

		
//		4. 자리수 쪼개기
//		네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
//		입력 예시
//		입력 : 1234
//		
//		출력 예시
//		1
//		2
//		3
//		4

//		1234 / 1000  몫:1  나머지:234
//		234	/ 100	 몫:2  나머지:34
//		34 / 10 	 몫:3  나머지:4

		System.out.print("입력 : ");
		int number = scan.nextInt();  // 1234
		
//		int q = number / 1000;	// 1
//		int r = number % 1000;  // 234
//		System.out.println(q);  // 1
//		
//		q = r / 100; // 2
//		r = r % 100; // 34
//		System.out.println(q); // 2
//		
//		q = r / 10; // 3
//		r = r % 10; // 4
//		System.out.println(q); // 3
//		System.out.println(r); // 4

System.out.println("-------------------------------------------------------------");


//		5. 자리수 합 구하기 (4번 문제에서 입력받는것은 살려둠)
//		네 자리수를 입력 받아서 각 자리수의 합을 출력하세요.
//		입력 예시
//		
//		입력 : 1234
//		출력 예시
//		
//		합계는 10 입니다. 
		
		// 5
		int n1 = number / 1000; // 1234 / 1000 => 1
		int n2 = number % 1000 / 100; // 1234 % 1000 -> 234 / 100 => 2
		int n3 = number % 100 / 10; // 34 /10 => 3
		int n4 = number % 10; // 1234 % 10 => 4
		//int n3 = ;
		//int n4 = ;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		int sum = n1 + n2 + n3 + n4;
		System.out.println("합계는 " + sum + "입니다.");
		
	}
}
