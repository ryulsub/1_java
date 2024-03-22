package day04_lesson02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. 음수 양수 판별
//		정수를 입력 받고 음수인지 양수인지 출력하세요.
		
//		입력 예시
//		정수를 입력 하세요 : -5
		
//		출력 예시
//		음수입니다
//		
//		System.out.print("정수를 입력 하세요:");
//		int number = scan.nextInt();
		
//		if(number > 0) {
//			System.out.println("양수입니다.");
//		} else if(number == 0) {
//			System.out.println("0");
//		} else {
//			System.out.println("음수입니다.");
//		}
		
System.out.println("-------------------------------------------");
		
//		2. 학점 출력
//		점수를 입력 받고 90 점이상이면 A , 80점 이상 B, 70점 이상 C, 60점 이상 D, 그외 F 를 출력하세요
//		
//		입력 예시
//		점수를 입력 하세요 : 86
//		
//		출력 예시
//		B
		
//		System.out.print("점수를 입력 하세요 : ");
//		
//		int score = scan.nextInt();
//		
//		if (score >= 90) {	// 90~
//			System.out.println("A");
//		} else if(score >= 80) { // 80 ~ 89
//			System.out.println("B");
//		} else if(score >= 70) { // 70 ~ 79
//			System.out.println("C");
//		} else if(score >= 60) { // 60 ~ 69
//			System.out.println("D");
//		} else { // 0 ~ 59
//			System.out.println("F");
//		}
		
System.out.println("----------------------------------------------------");
		
//		3. 비만도 구하기
//		BMI 수치를 입력 받아서 비만 판정을 출력하세요.
//		
//		bmi  수치 비만도
//		~ 10 이하	 정상
//		~ 20 이하 과체중
//		20 ~ 초과	 비만
//		
//		입력 예시
//		bmi 수치를 입력 하세요 : 18
//		
//		출력 예시
//		과체중

		System.out.print("bmi 수치를 입력 하세요 : ");
		
		int bmi = scan.nextInt();
		
		if(bmi <= 10) { // 10 이하
			System.out.println("정상");
		} else if(bmi <= 20 ) { // 11 ~ 20
			System.out.println("과체중");
		} else { // 21 ~
			System.out.println("비만");
		}
		
	}

}
