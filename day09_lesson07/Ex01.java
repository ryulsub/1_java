package day09_lesson07;

public class Ex01 {

	public static void main(String[] args) {
		// 2차원 배열
		// 바깥쪽:행	안쪽:열
		int[][] scores = {
				{89, 100, 91}, 		// scores[0].length
				{90, 58, 77}, 
				{61, 99, 95}, 
				{71, 85, 66}, 
				{41, 79, 97}
		};
		
		System.out.println("3번째 학생의 2번재 점수는 " + scores[2][1]); // 99
		System.out.println("2번째 학생의 첫번째 점수는 " + scores[1][0]); // 90
		System.out.println("5번째 학생의 세번째 점수는 " + scores[4][2]); // 97
		
		// 반복문으로 2차원 배열 값 출력
		for (int i = 0; i < scores.length; i++) { // 학생 수 
			for (int j = 0; j < scores[i].length; j++) { // 과목 수
				System.out.println((i + 1) + "번째 학생의 " + (j + 1) + "번째 점수는" + scores[i][j]);
			}
		}
		
		// 각 학생들의 평균구하기
		for (int i = 0; i < scores.length; i++) { // 학생
			int sum = 0; // 한 학생의 점수 총합
			for (int j = 0; j < scores[i].length; j++) { // 학생 당 점수들
				sum += scores[i][j];
			}
			double average = (double) sum / scores[i].length;
			System.out.println((i + 1) + "번" + "째 학생의 평균 점수는 " + average + "점");
		}
	}

	

}
