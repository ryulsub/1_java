package day04_lesson02;

import java.util.Scanner;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. 계절 구하기
//		월(month)를 입력 받아서 어떤 계절인지 출력하세요.
//
//		   월	  계절
//		3, 4, 5	   봄
//		6, 7, 8	  여름
//		9, 10, 11 가을
//		12, 1, 2  겨울
//		
//		입력 예시
//		월을 입력하세요 : 5
//		
//		출력 예시
//		봄
		
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		
//		switch (month) {
//		case 3 :
//		case 4 :
//		case 5 :
//			System.out.println("봄");
//			break;
//		case 6 :
//		case 7 :
//		case 8 :
//			System.out.println("여름");
//			break;
//		case 9, 10, 11: // java 14 version 부터 사용가능
//			System.out.println("가을");
//			break;
//		case 12 : 
//		case 1 :
//		case 2 :
//			System.out.println("겨울");
//			break;
//		default :
//			System.out.println("잘못된 월입니다.");
//		}
		
System.out.println("---------------------------------------------");	

		// 2) 개선된 switch문 - java 14 ver
		
		switch (month) {
		case 3, 4, 5 -> System.out.println("봄");
		case 6, 7, 8 -> System.out.println("여름");
		case 9, 10, 11 -> System.out.println("가을");
		case 12, 1, 2 -> System.out.println("겨울");
		default -> System.out.println("잘못 입력");
		}
		
	}
}
