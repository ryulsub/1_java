package day16_lesson04.quiz02;

public class ShapeTest {

	public static void main(String[] args) {
		  Shape[] shape = new Shape[3];
	        // upcasting
	        shape[0] = new Triangle(8, 10); // 밑변, 높이
	        shape[1] = new Rectangle(7, 13);
	        shape[2] = new Circle(12);
	        for (int i = 0; i < shape.length; i++) { // 0
	            shape[i].printArea();
	        }

	}

}
