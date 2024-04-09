package day16_lesson06.ex01;

// 취준생
public class JobApplicant implements Java, Python {
	// spec
	private int toeic;
	private double grade;
	private String[] licenses;
	
	public String intriduce() {
		return "저는 서울에서 태어나....";
	}

	@Override
	public void objectOrient() {
		System.out.println("객체지향이란 클래스와 객체가 있고 객체는.....");	
	}

	@Override
	public void ai() {
		System.out.println("사실 모르겠다....");
		
	}
	
	
}
