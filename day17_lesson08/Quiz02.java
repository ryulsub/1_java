package day17_lesson08;

import java.util.ArrayList;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
//		1. List 만들기
//		리스트에 주어진 값들을 넣으세요.
//		20 3 5 84 17
		
		list.add(20);
		list.add(3);
		list.add(5);
		list.add(84);
		list.add(17);
		
		System.out.println(list);
		
//		2. 최소값 구하기
//		List에서 가장 작은 값을 출력하세요.
//		for문을 사용하세요.(향상된 for문 X)
//		출력 예시
//		3
		int minimum = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
			String lists = list.get(i);
			if (i >= minimum) {
				i = minimum;
			}
			
		}
		

	}

}
