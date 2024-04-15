package day19_lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		

		Map<String, Integer> scores = new HashMap<>();
		scores.put("국어", 90);
		scores.put("수학", 85);
		scores.put("영어", 90);
		scores.put("사회", 80);
		scores.put("과학", 100);
		
		System.out.println(scores);
		
//		5. 값 확인
//		100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
//		성적 우수상을 받을 수 있는지 출력하세요.
		
//		출력 예시
//		수상 가능
		
		if (scores.containsValue(100)) {
			System.out.println("수상 가능");
		} else {
			System.out.println("해당 없음");
		}
		

		
//		4. 값 찾기
//		90점 이상의 모든 과목을 출력하세요.
//		출력 예시
//		국어 과학 영어 
		
		Iterator<String> iter = scores.keySet().iterator();
		while (iter.hasNext()) {
			String subject = iter.next();
			//System.out.println(subject);
			if (scores.get(subject) >= 90) {
				System.out.print(subject + " ");
			}
			
		}
		
		
		
	}

}
