package day16_lesson06.quiz01;

public class EntertainerApplicant implements Sing, Act {
	private int act;
	private int sing;
	String [] contest;
	
	public void introduce() {
		System.out.println("저는 연예인 하고싶음");
	}

	@Override
	public void sing() {
		System.out.println("노래를 잘불");
		
	}

	@Override
	public void act() {
		System.out.println("연기를 잘함");
		
	}
	
	
}
