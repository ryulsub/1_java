package day03_lesson02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. 두 점수 합격
//		두 개의 점수를 입력 받아서 두 점수 모두가 70점 이상이면 합격입니다를 출력하세요
//		입력 예시
//		두 점수를 입력하세요 : 87 73
		
//		출력 예시
//		합격입니다.
		
//		System.out.print("두 점수를 입력하세요 : ");
//		
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		
//		if (score1 >= 70 && score2 >= 70) {
//			System.out.println("합격입니다.");
//		}
		
System.out.println("--------------------------------------------------------");		
		

//		2. 공배수 구하기
//		수를 입력 받아서 2와 3의 공배수인지 판별하세요.
//		공배수: 공통되는 배수
//		
//		입력 예시
//		수를 입력하세요 : 12
//		
//		출력 예시
//		2와 3의 공배수입니다.

//		System.out.print("수를 입력하세요 : ");
//
//		int num = scan.nextInt();
//		
//		if(num % 2 == 0 && num % 3 == 0) {
//			System.out.println("2와 3의 공배수 입니다.");
//		}
		
System.out.println("----------------------------------------------");
		
//		3. 범위
//		1 ~ 10의 사이의 수를 입력 받아야 한다. 범위를 넘어갈 경우 잘못 입력하셨습니다를 출력하세요.
//		입력 예시
//		1~10 사이의 수를 입력하세요 : 14

//		출력 예시
//		잘못 입력하셨습니다.

		System.out.print("1~10 사이의 수를 입력하세요 : ");
		
		int number = scan.nextInt();
		
		// number가 10보다 큰 경우 또는 number가 0 이하일 때
		if (number > 10 || number <= 0) { // 잘못 들어온 경우 참
			System.out.println("잘못 입력하셨습니다.");
		}
	
	}
}
