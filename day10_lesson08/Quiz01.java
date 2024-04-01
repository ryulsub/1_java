package day10_lesson08;

public class Quiz01 {

	public static void main(String[] args) {
		
//		문자열 정수 변환
//		아래와 같이 생년이 저장된 String 이 있을 때 올해 나이를 출력하세요.
//		String birthday = "1995";
//		출력 예시
//		OO세
		
		String birthday = "1995";
		int age =  2024 - Integer.parseInt(birthday);
		System.out.print(age + "세");		

		
		
	}

}
