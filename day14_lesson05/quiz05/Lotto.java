package day14_lesson05.quiz05;

import java.util.Random;

public class Lotto {
	// 필드
	private int[] lottoNumber = new int[6];

	// 수동
	public void manual(int[] lottoNumber) {
		this.lottoNumber = lottoNumber;

	}

	// 자동
	public void auto() {
		Random rand = new Random();
		
		for (int i = 0; i < this.lottoNumber.length; i++) {
			int randNum = rand.nextInt(45) + 1; // 1 ~ 45
			this.lottoNumber[i] = randNum;
			
			}
		}

	// 번호 6개 출력
	public void pritnLottoNumber() {
		System.out.print("로또 종이 숫자>>");
		for (int i = 0; i < this.lottoNumber.length; i++) {
			System.out.print(this.lottoNumber[i] + " ");
		}
		System.out.println();
	}

	public int[] getlottoNumber() {
		return this.lottoNumber;
	}
	

}
