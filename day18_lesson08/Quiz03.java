package day18_lesson08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		
//		1. 체조 경기 평균 점수
//		체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
//		최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//		for문으로 구현할 것
//
		// [8, 7, 6, 10, 9, 4];
//		출력 예시
//
//		최고점과 최저점을 제외한 평균 점수는 7.5
		
		
		
		List<Integer> scores = new ArrayList<>(List.of(8, 7, 6, 10, 9, 4));
		
//		1-1)
		
//		Integer max = scores.get(0);
//		Integer min = scores.get(0);
//		for(int i = 1; i < scores.size(); i++) {
//				if (max < scores.get(i)) {
//					max = scores.get(i);
//			}
//			
//			if (min > scores.get(i)) {
//				min = scores.get(i);
//			}
//			
//			
//		}
//		
//		// System.out.println(max);
//		// System.out.println(min);
//		scores.remove(max);
//		scores.remove(min);
//		System.out.println(scores);
		
		
		
		// 1-2)
		scores.sort(Comparator.naturalOrder());
		System.out.println(scores);
		scores.remove(0);
		scores.remove(scores.size() - 1); // 마지막 칸
		System.out.println(scores);
		
		int sum = 0;
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		double average = (double) sum / scores.size();
		System.out.println("최고점과 최저점을 제외한 평균 점수는: " + average);
	}

}
