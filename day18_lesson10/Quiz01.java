package day18_lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		
//		1. 자료 입력
//		아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요.
//		국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
//		출력 예시
//
//		{국어=90, 사회=80, 과학=100, 수학=85, 영어=90}
		Map<String, Integer> scores = new HashMap<>();
		scores.put("국어", 90);
		scores.put("수학", 85);
		scores.put("영어", 90);
		scores.put("사회", 80);
		scores.put("과학", 100);
		System.out.print(scores);
		
		System.out.println();
		
//		2. 값 수정
//		사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다.
//		값을 바꾸고 출력 하세요.
//		출력 예시
//		{국어=90, 사회=85, 과학=100, 수학=85, 영어=90}
		scores.put("사회", 85);	// 	scores.put("사회", scores.get("사회") + 5);
		System.out.println(scores);
		
		
//		3. 값 찾기
//		과목명을 입력 받고, 점수를 출력 하세요.
//		단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
		
//		입력 예시
//		조회할 과목명을 입력하세요 : 영어
		
//		출력 예시
//		영어 : 90
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 과목명을 입력하세요:");
		String subject = scan.next();
		if (scores.containsKey(subject)) {
			// 영어 : 90
			System.out.println(subject + ":" + scores.get(subject));
		} else {
			System.out.println("자료 없음");
		}
	
		
	}

}
