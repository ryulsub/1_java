package day04_lesson02;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1. 평균 합격 구하기
		
//		두 점수를 입력 받고, 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.
//		
//		입력 예시
//		두 점수를 입력하세요 : 87 95
//		
//		출력 예시
//		합격
		
//		System.out.print("두 점수를 입력하세요 : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		double avg = (double)(score1 + score2) / (double)2;
//		
//		if(avg >= 70) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
//-------------------------------------------------------------------------------------

//		2. 큰 값 구하기

//		세 개의 정수를 입력 받아서 가장 큰 값을 출력하세요.
//		
//		입력 예시
//		세 개의 수를 입력하세요 : 3 8 5
//		
//		출력 예시
//		8

//		System.out.print("세 개의 수를 입력하세요 : ");
//		
//		int num1 = scan.nextInt(); // 
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		
//		int max = num1; 
//		if (max < num2) {
//			max = num2;
//		} 
//		if (max < num3) {
//			max = num3;
//		}
//		System.out.println(max);
//	}	
		
// ----------------------------------------------------------------------------

//		3. 과락 포함 합격 여부

//		점수 두 개를 입력 받고 합격 여부를 출력하세요.
//		평균이 60점 이상이면 합격
//		한과목이라도 50점 이하면 무조건 과락
//		평균 60점 미만이면 불합격
//		
//		입력 예시
//		점수1 : 95
//		점수2 : 48
//		
//		출력 예시
//		과락
		
//		System.out.print("점수1 : " );
//		int score = scan.nextInt();
//		System.out.print("점수2 : ");
//		int score2 = scan.nextInt();
//		double avg = (double)(score + score2) / (double)2;
		
//		if (score <=50 || score2 <= 50) {
//			System.out.println("과락");
//		} else if (avg >= 60) { // 과락 아님
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
//		if (avg >= 60) {
//			// 합격 또는 과락
//			if (score <= 50 || score2 <= 50) {
//				System.out.println("과락");
//			} else {
//				System.out.println("합격");
//			}
//		} else {
//			// 불합격
//			System.out.println("불합격");
//		}	


//------------------------------------------------------------------------------------------------

//		4. 윤년 구하기
//
//		연도를 입력 받아서 윤년인지 평년인지 출력하세요.
//		윤년 조건
//		1. 4로 나누어 떨어지는 연도는 윤년이다.
//		2. 100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		3. 400으로 나누어 떨어지는 연도는 무조건 윤년이다.
//		
//		입력 예시
//		연도 : 2020
//		
//		출력 예시
//		윤년
		
		System.out.print("연도 : ");
		int year = scan.nextInt();
		
		// 2020윤년	2100:평년	   2400:윤년	  2021:평년
		
		// 4-1) 비효율적인 방식
		
		if( year % 4 == 0) {
			if(year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년");
				} else {
					System.out.println("평년");
				}
			} else {
				System.out.println("윤년");
			}
		} else {
			System.out.println("평년");
		}
		
System.out.println("--------------------------------------------------------=======");

		// 4-2) if - else if - else

//		1. 4로 나누어 떨어지는 연도는 윤년이다.
//		2. 100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		3. 400으로 나누어 떨어지는 연도는 무조건 윤년이다.
		
		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if (year % 100 == 0) { // 400의 배수가 아님
			System.out.println("평년");
		} else if (year % 4 == 0) { // 400의 배수나 100의 배수가 아님
			System.out.println("윤년");
		} else { // 4의 배수, 400의 배수, 100의 배수가 아님
			System.out.println("평년");
		} 
		
System.out.println("-------------------------------------------------");	

		// 4-3)
		
//		4로 나누어 떨어지면서(그리고) 100으로 나누어 떨어지지 않는 연도는 윤년이다.
		// (또는) 
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		} 
		
		

	
//----------------------------------------------------------------------------------------------------		

		
//		5. 윷놀이
//		4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
//		윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
//		
//		윷놀이는 4개의 윷을 이용하는 게임이다.
//
//		도 : 1개가 뒤집어진 상태
//		개 : 2개가 뒤집어진 상태
//		걸 : 3개가 뒤집어진 상태
//		윷 : 4개가 뒤집어진 상태
//		모 : 하나도 뒤집어지지 않은 상태
//
//		입력 예시
//		윷 상태를 입력하세요 : 0 1 1 1
		
//		출력 예시
//		걸
//		
//		System.out.print("윷 상태를 입력하세요: ");
//		int game = scan.nextInt();
//		int game1 = scan.nextInt();
//		int game2 = scan.nextInt();
//		int game3 = scan.nextInt();
//		int sum = game + game1 + game2 + game3;
//		
//		switch (sum) {
//		case 1 -> System.out.println("도");
//		case 2 -> System.out.println("개");
//		case 3 -> System.out.println("걸");
//		case 4 -> System.out.println("윷");
//		default -> System.out.println("모");
//		}
		
	}
}
