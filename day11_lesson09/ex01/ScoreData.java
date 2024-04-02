package day11_lesson09.ex01;

// 내가 만든 자료형, 설계도
public class ScoreData {
	// 속성: field
	int score;
	String subject;
	int rank;
	
	// 행위: method
	void printInfo() {
		System.out.println("과목명:" + subject);
		System.out.println("점수:" + score);
		System.out.println("순위:" + rank);
				
				
	}
}
