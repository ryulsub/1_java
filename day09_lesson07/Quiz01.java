package day09_lesson07;

public class Quiz01 {

	public static void main(String[] args) {
//		
//		아래 배열은 5명의 10과목 시험 성적을 정리한 것 입니다.
//		이 배열을 이용해서 아래 문제를 풀어보세요.

		int[][] scores = { 
				{ 89, 93, 91, 93, 92, 78, 90, 90, 93, 90 }, 
				{ 91, 82, 72, 98, 92, 87, 77, 87, 74, 88 },
				{ 98, 93, 94, 91, 97, 94, 91, 96, 98, 90 }, 
				{ 65, 63, 57, 87, 88, 92, 78, 85, 100, 68 },
				{ 45, 50, 48, 63, 67, 58, 40, 66, 47, 64 } 
			};

//		1. 학생별 평균 구하기
//		각 학생의 평균을 각각 구해서 출력하세요.
		
//		출력
//		1번째 학생의 평균은 89.9
//		2번째 학생의 평균은 84.8
//		3번째 학생의 평균은 94.2
//		4번째 학생의 평균은 78.3
//		5번째 학생의 평균은 54.8

		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double average = (double) sum / scores[i].length;
			System.out.println((i + 1) + "번" + "째 학생의 평균은 " + average);
		}
		System.out.println();

		
//		2. 학생별 최고점 구하기
//		각 학생의 최고 점수를 구해서 출력하세요.

//		출력
//		1번째 학생의 최고점은 93
//		2번째 학생의 최고점은 98
//		3번째 학생의 최고점은 98
//		4번째 학생의 최고점은 100
//		5번째 학생의 최고점은 67

		for (int i = 0; i < scores.length; i++) { // 학생
			int max = 0;
			for (int j = 0; j < scores[i].length; j++) { // 점수
				if (max < scores[i][j]) {
					max = scores[i][j];
				}
			}
			// i번째 학생의 최고점은 몇
			System.out.println((i + 1) + "번째 학생의 최고점은 " + max);
		}
		System.out.println();
		

//		3. 평균 최고점 구하기
//		평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
//		출력
//		평균이 가장 높은 학생은 3번째 학생이고, 평균 점수는 94.2
		
		double maxAverage = 0;
		int maxI = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) { // 점수
				sum += scores[i][j];
			}
			double average = (double)sum / scores[i].length;
			if(maxAverage < average) {
				maxAverage = average;
				maxI = i;
			}
		}
		//평균이 가장 높은 학생은 3번째 학생이고, 평균 점수는 94.2
		System.out.println("평균이 가장 높은 학생은 " + (maxI + 1) + "번째 학생이고, 평균 점수는 " + maxAverage);
		
	}

}
