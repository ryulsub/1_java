package day19_lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz02 {

	public static void main(String[] args) {
		
//		Map 활용하기
		
//		Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
//		성씨가 '이'씨인 경우에는 값을 'O'로 바꾼다.
//		Iterator를 사용한다.
//		
//		출력 예시
//		{이지은=O, 서장훈=X, 유재석=X, 이광수=O, 박나래=X}
		
		Map<String, Character> map = new HashMap<>();
		map.put("유재석", 'X');
		map.put("박나래", 'X');
		map.put("이지은", 'X');
		map.put("서장훈", 'X');
		map.put("이광수", 'X');
		
		Iterator<String> iter =  map.keySet().iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			//System.out.println(name);
			if (name.startsWith("이")) {
				map.put(name, 'O');
			}
		}
		
		System.out.println(map);
	}

}
