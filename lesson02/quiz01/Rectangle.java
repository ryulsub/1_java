package lesson02.quiz01;

public class Rectangle {
	// 필드
	// 어떻게 셋팅할 것인가?		생성자
	private int width;
	private int height;
	
	
	// 메소드
	// 생성자 - 필드를 셋팅
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("가로" + width 
				+ "cm, 세로" + height 
				+ "cm 사각형이 만들어졌습니다.");
	}
	
	// 넓이 구하기
	public int getArea() {
		return this.width * this.height;
		
	}
	
}
