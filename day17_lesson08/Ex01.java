package day17_lesson08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// 배열(Array)
		// 1. 크기를 미리 알고 있어야 한다. 크기가 고정 되어 있어야 한다.
		// 2. 중간에 있는 값을 빼내면, 그 칸은 비어있는 채로 유지된다.
		// 3. index 기반으로 접근 가능
		// 4. 배열 생성 시 모든 타입 가능(기본 자료형, 클래스 자료형)

		// List
		// 1. 크기가 고정되어 있지 않고, 동적으로 할당된다.
		// 2. 중간에 있는 값을 빼내면 앞으로 당겨진다.(메모리 낭비 적음)
		// 3. 여러 방법으로 데이터를 쉽게 다룰 수 있다.(메소드 사용)
		// 4. 클래스 자료형만 담을 수 있다.(기본 자료형 사용 불가)
		// 5. 타입 안정성을 보장하는 Generic 문법을 사용한다.
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		System.out.println(list1.add(3));
		System.out.println("list1:" + list1);
		System.out.println("list1:" + list1.toString());

		// List 인터페이스의 자식 LinkedList(구현체)
		List<Integer> list2 = new LinkedList<>();
		list2.add(13);
		list2.addAll(list1);
		System.out.println("list2:" + list2);

		// 요소값 수정
		// 첫번째 값 13 -> 200 변경
		System.out.println(list2.set(0, 200));
		System.out.println("list2:" + list2);

		// 요소값 삭제
		// index 1 값 삭제
		int deletedValue = list2.remove(1); // index 1칸 삭제
		System.out.println("deletedValue:" + deletedValue);
		System.out.println("list2:" + list2);

		List<String> strList = new ArrayList<>();
		strList.add("abc");
		strList.add("qwer");
		System.out.println(strList.remove("qwer"));
		System.out.println("strList:" + strList);

		// 모든 요소 삭제
		list2.clear();
		System.out.println("list2:" + list2);
	}

}
