package day16_lesso05.ex01;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal animal = new Animal(); error. 추상클래스는 객체화 할 수 없다.
		Animal animal = new Tiger(); // up casting
		animal.cry();
		animal.eat();
	}

}
