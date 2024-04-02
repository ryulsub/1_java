package day11_lesson08;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
//		1. 문자열 검색
//		파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		
//		출력 예시
//		jpg 파일 개수 : 3
		int count = 0;
		for(int i = 0; i < files.length; i++) {
			// System.out.println(files[i]);
			if (files[i].endsWith("jpg")) {
				count++;
			}
		}
		System.out.println("jpg 파일개수: "+ count);

		
		
//		2. 영 단어 퀴즈
//		영어 단어 퀴즈를 낸다.
//		아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
//		100점 만점 기준으로 몇점인지 출력한다.
//		1. 승리을 영어로 입력하세요 :
//		2. 사랑을 영어로 입력 하세요 :
//		3. 컴퓨터를 영어로 입력 하세요 :
//		4. 노트북을 영어로 입력하세요 :
		
//		입력 예시
//		1. 승리을 영어로 입력하세요 :victory
//		2. 사랑을 영어로 입력 하세요 :lobe
//		3. 컴퓨터를 영어로 입력 하세요 :computer
//		4. 노트북을 영어로 입력하세요 :notebook
		
//		출력 예시
//		점수는 75점 입니다.
		Scanner scan = new Scanner(System.in);
		String[] quizWord = {"승리", "사랑", "컴퓨터", "노트북"};
		String[] answerWord = {"victory", "love", "computer", "notebook"};
		int score = 0;
		
		for (int i = 0; i < quizWord.length; i++) { // 0 ~ 3 	
			System.out.print((i + 1) + ". " + quizWord[i]+ "을(를) 영어로 입력하세요 :");
			String answer = scan.next();
			if (answer.equals(answerWord[i])) {
				score += 25;
			}
		}
		
		System.out.println("점수는 " + score + "점 입니다.");
		
		
	}

}
