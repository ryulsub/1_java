package day12_lesson2.quiz02;

public class ProductTest {

	public static void main(String[] args) {
	Product pr1 = new Product("새우깡", 1300, "2024-05-03");
	System.out.println("이름:" + pr1.getName());
	System.out.println("가격:" + pr1.getPrice());
	System.out.println("유통기한:"+ pr1.getExpiration());
	System.out.println();
	
	System.out.println("제품 5개의 가격: " + pr1.calculatePrice(5));
	System.out.println("제품 13개의 가격: " + pr1.calculatePrice(13));
	System.out.println(pr1.availableSale());
	System.out.println(pr1.availableSale2());
	}

}
