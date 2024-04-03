package lesson02.ex01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("이병헌", "19950114", "남자");
//		p1.name = "이병헌";
//		p1.birth = "19950114";
//		p1.gender = "남자";
			
		p1.greet();
		p1.walk();
		p1.introduce();
		p1.printAge();
		
		System.out.println(p1.getName());
		System.out.println(p1.getBirth());
		System.out.println(p1.getGender());
	}
	
	
	

}
