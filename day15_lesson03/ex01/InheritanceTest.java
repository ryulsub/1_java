package day15_lesson03.ex01;

public class InheritanceTest {

	public static void main(String[] args) {
//		Person person = new Person("이병헌");
//		person.introduce();
		
		// 자식 객체로 생성하면
		// 부모 생성자가 먼저 불려지고, 자식 생성자가 후에 불려진다.
		Student student = new Student("이병헌", "컴퓨터공학");
		student.introduce();
	}

}
