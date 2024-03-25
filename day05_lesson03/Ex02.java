package day05_lesson03;

public class Ex02 {

	public static void main(String[] args) {
		// do-while문
		int i = 0;
		do {
			System.out.println("안녕" + i);
			i++;
		} while (i < -3);
		
		// while문
		// 0 ~ 4: 5번
		
		i = 0;
		while (i < 5) {
			System.out.println("while문" + i);
			i++;
		}

System.out.println("---------------------------------------------------");		
		
		// for문
		// for문 (초기식; 조건; 증감식) { }
		
		// 1 ~ 5: 5번
		for (i = 1; i < 5; i++) {
			System.out.println("파인애플" + i);
		}
		
		// 5 ~ 1: 5번
		for (int j = 5; j >= 1; j--) {
			System.out.println("체리" + j);
		}
		
		// 1+2+3+.... +10
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j; // sum = sum + j;
		}
		System.out.println(sum);
	}

}
