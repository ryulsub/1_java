package lesson01;

public class Quiz02 {

	public static void main(String[] args) {
		
		/* 1.아래 문장을 변수를 사용하여 출력하세요.
		 * 시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
		 * 시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		 * 
		 */
		
		char grade = 'A';
		double a = 4.0;
		System.out.println("시험 성적이 90점 이상이면 '" + grade + "'학점이고 평점은 " + a + "입니다.");
		
		grade = 'B';  // char 안붙히고 재활용함
		double b =3.0;
		System.out.println("시험 성적이 80점 이상이면 '" + grade + "'학점이고 평점은 " + b + "입니다.");
	
		
		/* 2.아래 정수와 실수를 곱해서 출력하세요
		 * int number1 = 33;
		 * double number2 = 35.325;
		 * 
		 * 출력 예시
		 * 두 수의 곱 : 1165.7250000000001
		 */
		
		int number1 = 33;
		double number2 = 35.325;
		System.out.println("두 수의 곱 :" + (number1 * number2));
		
		double result = number1 * number2;
		System.out.println("두 수의 곱 :" + result);
		
		
		/* 3. 943시간은 몇일 몇시간 인지 구하여 출력하세요.
		 * 
		 * 출력 예시
		 * 943시간은 39일 7시간 입니다.
		 */
		int hour = 943;
		int days = hour / 24;
		int time = hour % 24;
		System.out.println(hour + "시간은 " + days + "일 " +  time + "시간 입니다." );
		
		
		/* 4. 가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
		 * 
		 * 출력 예시
		 *사각형의 넓이: 72
		 *삼각형의 넓이: 36
		 */
		int width = 8;
		int height = 9;
		int rectangleArea = width * height;
		int triangleArea = rectangleArea / 2;
		System.out.println("사각형의 넓이: " + rectangleArea);
		System.out.println("삼각형의 넓이: " + triangleArea);
		
	}

}
