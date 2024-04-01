package day10_lesson08;

public class Ex03 {

	public static void main(String[] args) {
		String s1 = "eclipse";
		
		// charAt: n번째 index에 무슨 문자(char)가 있는지 확인
		System.out.println("charAt: " + s1.charAt(4));
		
		// contains: 특정 문자열이 문자열 안에 포함되어 있는지 확인
		System.out.println("contains: "+ s1.contains("lip"));
		
		// startsWith: 특정 문자열로 시작하는지 확인
		System.out.println("startsWith: " + s1.startsWith("ecl") );
		
		// endsWith: 특정 문자열로 끝나는지 확인
		System.out.println("endsWith: " + s1.endsWith("e"));
		
		// length: 알파벳의 개수
		System.out.println("length:" + s1.length());
		
		// replace: 포함된 문자열 부분을 교체(치환)
		String s2 = "지금 먹고 싶은 음식은 치킨이다.";
		s2 = s2.replace("치킨", "피자"); 	// 꼭 !!! 다시 저장한다.
		System.out.println("replace: " + s2);
		
		// split: 특정 기준자를 기준으로 잘라서 배열에 넣는다.
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);	
		}
		
		// substring: 문자열 추출
		String s4 = "javastudy";
		
		// study 추출
		System.out.println("substring:" + s4.substring(4));
		
		// java 추출
		System.out.println("substring param2:" + s4.substring(0, 4) ); // 파이썬 range 범위 설정이랑 같음
		// study 추출
		System.out.println("substring para2: "+ s4.substring(4, 9));
	}

}
