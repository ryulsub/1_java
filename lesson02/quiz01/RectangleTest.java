package lesson02.quiz01;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(30, 50);
		System.out.println("넓이: " + rect1.getArea() + "cm^2");
		System.out.println("둘레: " + rect1.getRound()+ "cm");
		
		Rectangle rect2 = new Rectangle(10, 10);
		
		// 사각형의 크기 변경
		rect2.setWidth(50);
		rect2.setHeight(50);
		System.out.println("넓이:" + rect2.getArea() + "cm^2");
		System.out.println("둘레:" +rect2.getRound() + "cm");
		
		
	}
	
	
}
