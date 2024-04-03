package lesson01.quiz01;

public class PersonTest {
	
	//나의 의식
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "이병헌";
		p1.birth = "19950114";
		p1.gender = "남자";
		
		p1.greet();
		p1.walk();
		p1.introduce();
		p1.printAge();
	}

}
