package day12_lesson2.quiz03;

public class OmrCardTest {
	
	// 나의 의식
	public static void main(String[] args) {
		// 비어있는 Omr card를 받는다.
		OmrCard card = new OmrCard();
				
		// 이름, 학번, 정답 마킹
		card.setName("이병헌");
		card.setStudentId(20001111);
		//card.setAnswer(2, 4, 4, 5, 1);
		card.setAnswer(new int[] {1, 4, 4, 5, 3});
		
		// 리더기에 카드를 넣고 점수를 확인
		OmrCardReader reader = new OmrCardReader(1, 4, 4, 5, 3);
		
		// 결과 출력 => reader가 함
		reader.printScore(card);
	}

}
