package day19_lesson08;

import java.util.ArrayList;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		
//		회원 추가하기
//		회원관리 리스트를 만든다.
//		[우솝, 루피, 상디, 나미, 로빈]
//				
//		새로 입력할 이름을 기존 리스트에 추가한다.
//		
//		만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//		(새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
//		보람
//		루피
//		쵸파
//		로빈
//		루피
		
		List<String> names = new ArrayList<>(List.of("우솝", "루피", "상디", "나미", "로빈"));
		List<String> newNames = new ArrayList<>(List.of("보람", "루피", "쵸파", "로빈", "루피"));
		
		// 3-2) 새 이름을 기준으로 돌고, 기준 리스트에 포함되었는지 contains로 확인
		// 		숫자가 붙은 이름도 있는지 확인 
		for (int i = 0; i < newNames.size(); i++) { // 0 ~ 4
			int count = 1;
			String newName = newNames.get(i);
			while (names.contains(newName)) {
				newName = newNames.get(i) + count++; // 루피1
			}
			names.add(newName);
		}
		
		System.out.println(names);
		
		
		
		
		// 3-1 )
//		for (int i = 0; i < names.size(); i++) { // 0 ~ 4 
//			int count = 1;
//			for (int j = 0; j < newNames.size(); j++) {
//				if (names.get(i).equals(newNames.get(j))) {
//					newNames.set(j, newNames.get(j) + count++);
//				}
//			}
//		}
//		
//		//System.out.println(newNames);
//		names.addAll(newNames);
//		System.out.println(names);
		
		
		
	}

}
