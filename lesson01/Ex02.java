package lesson01;

public class Ex02 {

	public static void main(String[] args) {
		int noodleCup = 850;
		System.out.println("육개장 가격:" + noodleCup);

		// 3개 가격 계산
		// 출력: 육개장 가격:850, 3개의 가격:?
		int sum = noodleCup * 3;
		System.out.println("육개장 가격:" + noodleCup + ", 3개의 가격:" + sum);

		// 10000원으로 육개장 3개를 산 후 거스름돈 구하기
		int money = 10000;
		int change = money - sum;
		System.out.println("거스름돈: " + change);

		// 5000원으로 육개장을 몇 개 살 수 있고, 거스름돈이 얼마 남는가?
		money = 5000;
		int buyNoodleCup = money / noodleCup;
		System.out.println("살 수 있는 갯수:" + buyNoodleCup);
		
		// 나머지를 구하는 연산자 : %
		change = money % noodleCup;
		System.out.println("거스름돈:" + change);
		
	}

}
