package day06_lesson03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		1. 무한 입력
//		무한 루프를 통해서 반복적으로 수를 입력을 받고 0이 입력 되었을때 반복문을 빠져 나오게 하세요.
//		입력이 끝나면 "끝"을 출력하세요
		
		while (true) {
			System.out.print("수를 입력하세요:");
			int num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("끝");	
				break;
		}
	}
		
System.out.println("------------------------------------");		
		
//		2. 배수의 합 구하기
//		3부터 50까지 3의 배수의 합을 출력하세요.
//		증감 연산은 +1씩 하세요.
//		continue문을 사용하세요.
//		출력 예시
//		408
		
		int sum = 0;
		for(int j = 3; j <= 50; j++) {
			if (j % 3 != 0) { // 3의 배수가 아닐 때 => skip
				continue;
			}
			
			sum += j;
		}
		System.out.println(sum);
			
		}
		
	}

