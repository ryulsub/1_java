package day12_lesson2.quiz01;

public class CircleTest {

	public static void main(String[] args) {
		Circle cir1 = new Circle(8);
		System.out.println("원의 넓이:" + cir1.calculateArea());	
		System.out.println("원의 둘레:" + cir1.calculateRound());	
		System.out.println("원의 25개 넓이:" + cir1.calculateArea(25));	
		
	}

}
