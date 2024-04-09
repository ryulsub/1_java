package day16_lesson06.ex01;

public class JobApplicantTest {

	public static void main(String[] args) {
		JobApplicant ryul = new JobApplicant();
		System.out.println(ryul.intriduce());
		
		Google google = new Google();
		google.recruitJavaDeveloper(ryul);
	}

}
