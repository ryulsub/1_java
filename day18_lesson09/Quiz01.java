package day18_lesson09;

import java.util.HashSet;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
	    // Q. 1234, 3456 의 합집합, 차집합, 교집합을 구하세요.

	        // 1234, 3456 값을 세팅한다.
	    Set<Integer> set1 = new HashSet<>();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    System.out.println(set1);
	    
	    Set<Integer> set2 = new HashSet<>();
	    set2.add(3);
	    set2.add(4);
	    set2.add(5);
	    set2.add(6);
	    System.out.println(set2);
	    
	        // 아래 객체에 결과를 저장한다.(원본 데이터 set1에 값 변경이 되지 않게 하기 위해)
	        Set<Integer> union = new HashSet<>(); 
	    union.addAll(set1);

	        Set<Integer> difference = new HashSet<>(); 
	    difference.addAll(set1);

	    Set<Integer> intersection = new HashSet<>();
	    intersection.addAll(set1);

	    // TODO: 구현하기
	    System.out.println();
	    
	    // 합집합
	    union.addAll(set2);
	    System.out.println(union);
	    
	    // 차집합
	    difference.removeAll(set2);
	    System.out.println(difference);
	    
	    // 교집합
	    intersection.retainAll(set2);
	    System.out.println(intersection);
	    
	    
	    
	    
	    
	}
}
