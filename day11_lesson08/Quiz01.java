package day11_lesson08;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. 문자열 입력
//		id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
//		Welcome! {id}
		
//		입력 예시
//		ID를 입력 하세요 : marobiana
		
//		출력 예시
//		Welcome! marobiana
		
		// 1. 문자열 입력
				System.out.print("ID를 입력하세요:");
				String id = scan.next();
				System.out.println("Welcome! " + id);
		
	
		
		
		
//		2. 문자열 검색
//		영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.
//		입력 예시
//
//		단어를 입력하세요 : elephant
//		출력 예시
//
//		e의 개수는 2개 입니다.
		
		System.out.print("단어를 입력하세요:");
		String word = scan.next();  // elephant
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			//System.out.println(word.charAt(i));
			if (word.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("e의 개수:" + count);
		
	}

}
