package day09_lesson06;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		1. 위치 변경 (swap)
//		두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요. // temp 변수 이용
		
//		입력 예시
//		두 개의 index를 입력하세요 : 2 4
		
//		출력 예시
//		3 5 39 10 2 
		
		int[] numbers = {3, 5, 2, 10, 39};
		
//		System.out.print("두 개의 index를 입력하세요: ");
//		int index1 = scan.nextInt(); // 0
//		int index2 = scan.nextInt(); // 3
//		
//		int temp = numbers[index1];
//		numbers[index1] = numbers[index2];
//		numbers[index2] = temp;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		System.out.println();
//		
		
		
//		2. 배열 순서 변경
//		1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
		
//		힌트
//		Random을 이용해서, 0번째 index의 값과 rand() 번째 index의 값의 서로 교체하면 된다.
//
//		rand 함수 사용하는법
		
//		출력 예시(매번 달라짐)
//
//		4 5 7 8 9 1 3 6 2 10 
		
		
		int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Random rand = new Random();
			
		for (int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(10); // 0 ~ 9
			
			int temp = n[0]; 
			n[0] = n[randIndex]; 
			n[randIndex] = temp;
		}
		
		for (int i = 0; i < n.length; i++) { // 0 ~ 9
			System.out.print(n[i] + " ");
		}
		System.out.println();
		
		
		
//		3. 빈도수 구하기
//		1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다.
//		1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.

//		출력 예시
//
//		1 : 2개
//		2 : 3개
//		3 : 3개
//		4 : 1개
//		5 : 1개
		
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] freq = new int[6]; // 0 인덱스는 안쓴다.
		
		// 빈도수 구하기
		for (int i = 0; i < numbers3.length; i++) {
			freq[numbers3[i]]++;
		}
		
		// 결과 출력
		for (int i = 1; i < freq.length; i++) { // 1 ~ 5
			// 1 : 2개
			System.out.println(i + ":" + freq[i] + "개");
		}
		
		
		
		
		
	}
}
