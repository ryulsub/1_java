package day17_lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		
//		1. List 만들기
//		리스트에 주어진 값들을 넣고 출력하세요.
//		3, 8, 9, 4, 2, 1, 7, 5
		
//		출력 예시
//		[3, 8, 9, 4, 2, 1, 7, 5]
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(7);
		list.add(5);
		System.out.println(list);
		
		// Arrays.asList로 만들면 고정 리스트로 만들어진다.(추가/삭제/수정 불가)
		List<Integer> list1 = Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5);
		//list1.add(100);
		System.out.println(list1);
		
//		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5););
//		list2.add(100);
		
		
		
		
		
//		2. 값 수정하기
//		List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.
//		출력 예시
//		[3, 8, 9, 6, 2, 1, 7, 5]
		list.set(3, 6);
		System.out.println(list);
		
		
		
//		3. 값 삭제하기
//		List에서 8과 7을 삭제하고 전체를 출력하세요.
//		출력 예시
//		[3, 9, 6, 2, 1, 5]
		
		// index로 삭제
		// list.remove(1);	// argument:1 -> int
		// list.remove(5);
		
		// 값으로 삭제
		Integer delValue = 8;
		list.remove(delValue);
		
		delValue = 7;
		list.remove(delValue);
		System.out.println(list);
		
		
	}

}
