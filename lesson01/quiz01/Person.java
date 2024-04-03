package lesson01.quiz01;

public class Person {
	// 필드
	String name;
	String birth;
	String gender;
	int age;
	
	// 메소드
	void greet() {
		System.out.println("안녕하세요");
	}
	
	void walk() {
		System.out.println("걷기");
	}

	void introduce() {
		System.out.println("내 이름은 " + this.name + "이고, 성별은 " + this.gender + "이다.");
	}
	
	void printAge () {
		// "19950114"
		int year = Integer.valueOf(birth.substring(0, 4));
		int age = 2024 - year;
		System.out.println("나이는 " + age + "세이다.");
	}
	
}
