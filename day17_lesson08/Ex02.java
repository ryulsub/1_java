package day17_lesson08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		
		// 1. index 기반
//		for (int i = 0; i < fruits.size(); i++) {
//			System.out.println(fruits.get(i)); // apple banana cherry
//			
//			String fruit = fruits.get(i);
//			if (fruit.startsWith("b")) {
//				fruits.remove(i);
//				i--;  // 삭제된 후 사이즈가 변경 되어 한번 더 돌리기 위해
//			}
//		}
		
		// 2. Iterator 사용
//		Iterator<String> iter = fruits.iterator();
//		while (iter.hasNext()) {
//			String fruit = iter.next();  // next() 할 때 마다 소비가 되므로 반복문에서 한번만 수행
//			System.out.println(fruit);
//			
//			if (fruit.startsWith("b")) {
//				// fruits.remove(fruit);  iterator를 사용 할때는 리스트에서 직접 삭제하지 않는다.
//				iter.remove();
//			}
			
//		}
		
		
		// 3. 향상된 for문 
		// money in pocket
		// list를 중간에 변경시키면 안된다.
		for (String fruit : fruits) { // apple banana cherry
			System.out.println(fruit);
			
			if (fruit.startsWith("b")) {
				fruits.remove(fruit);
			}
		}
		
		
		System.out.println(fruits);
	}

}
