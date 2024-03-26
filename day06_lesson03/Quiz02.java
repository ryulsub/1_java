package day06_lesson03;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. 합 구하기
//		수를 입력 받아서 1부터 입력 받은 수까지의 합을 출력하세요.
//		
//		입력 예시
//		수를 입력하세요 : 45
//		
//		출력 예시
//		1035
		
//		System.out.print("수를 입력하세요 : ");
//		int end = scan.nextInt(); 	// 45, 10
//		int sum = 0;	
//		for(int i = 1; i <= end; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		
		
		
//		2. 팩토리얼
//		팩토리얼은 1부터 그 수까지의 모든 수의 곱이고 아래와 같이 표현된다.
//		5! = 1 * 2 * 3 * 4 * 5
//		7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
//		수를 입력 받고 그 수의 팩토리얼을 출력하세요.
//		입력 받는 수의 최대값은 10이다.
		
//		입력 예시
//		수를 입력하세요 : 8
		
//		출력 예시
//		40320
		
//		System.out.print("수를 입력하세요 : ");
//		int number = scan.nextInt();	// 8
//		int fact = 1;
//		for (int i = 1; i <= number; i++) { // 1 * 2 * 3* ...*8
//			fact *= i;
//		}
//		System.out.println(fact);
	
	
		
		
		
//		3. 약수 구하기
//		수를 입력 받아서 그 수의 약수를 모두 출력하세요.
//		약수: 어떤 수를 나누어 떨어지게 하는 수
//
//		예) 8의 약수 => 1 2 4 8
//		
//		입력 예시
//		수를 입력하세요 : 24
//		
//		출력 예시
//		1 2 3 4 6 8 12 24
		
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		for(int i = 1; i <= number; i++) {
			// 약수: 입력받은 number를 i로 나눈 나머지가 0이면 i는 약수
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}

		
		
	}
}
