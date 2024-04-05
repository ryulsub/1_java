package day14_lesson05.quiz05;

public class LottoTest {

	public static void main(String[] args) {
		// 나의 의식
		LottoChecker lottoChecker = new LottoChecker();
		
		// 로또 수동으로 주세요!
		Lotto lotto2 = new Lotto();
		lotto2.manual(new int[] { 45, 33, 26, 1, 17, 21});
		
		// 번호 출력(로또)
	    lotto.printLottoNumber();
	    
	    Lotto lotto = new Lotto();
	    
		// 로또 자동으로 주세요!
	    Lotto lotto1 = new Lotto();
	    lotto1.auto();
	    
		// 번호 출력(로또)
	    lotto1.pritnLottoNumber();
	    
		// 로또 체커로 확인 => 1번만 생성
		// -- 당첨번호는 생성자에서 세팅
		// -- 당첨번호 출력
		LottoChecker checker = new LottoChecker();
		checker.printLuckyNumber();
		
		// 로또 결과
		String result = checker.check(lotto);
		String result1 = checker.check(lotto1);
		
		System.out.println(result);
		System.out.println(result1);
	}

}
