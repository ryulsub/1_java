package day01;

public class Quiz01 {
	public static void main(String[] args) {
//		이름: 신보람 나이: 25
//
//		3 + 5 = 8
//		3 - 5 = -2
//
//		7 X 1 = 7
//		7 X 2 = 14
//		7 X 3 = 21
		
		
		System.out.println("이름: 신보람 나이:25");
		
		int num = 3;
		int num2 = 5;
		int sum = num + num2;
		int minus = num - num2;
		System.out.println(num + " + " + num2 + " = " + sum);
		System.out.println(num + " - " + num2 + " = " + minus);
		
		System.out.println("");
		
		int num3 = 7;
		int num4 = 1;
		int num5 = 2;
		int num6 = 3;
		
		System.out.println(num3 + " X " + num4 + " = " + (num3 * num4));
		System.out.println(num3 + " X " + num5 + " = " + (num3 * num5));
		System.out.println(num3 + " X " + num6 + " = " + (num3 * num6));
		
		
	}
}
