package day12_lesson2.quiz02;

public class Product {
	// 필드
	private String name;
	private int price;
	private String expiration;
	
	
	// 메소드
	public Product (String name, int price, String expiration){
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getExpiration() {
		return this.expiration;
	}
	
	
	// 제품 n개의 가격
	public int calculatePrice(int count) {
		return this.price * count;
	}
	
	// 판매 가능 여부
	public String availableSale() {
		// "2024-04-04"	 <=	"2025-05-22" 판매가능
		// "2024-04-04"	 >	"2025-05-22" 판매불가
		String[] arr = this.expiration.split("-");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		// 이 조건에서 참이 되면 => 판매 가능
		if (year > 2024) {
			return "판매가능상품";
		} else if (year == 2024) {
			if (month > 4) {
				return "판매가능상품";
			} else if (month == 4) {
				if(day >= 4) {
					return "판매 가능 상품";
				}
			}
		}
		
		// 참이 된 적 없으면 => 판매 불가
		return "판매 불가 상품";
	}
	
	// 판매 가능 여부2
	public String availableSale2() {
		// "2024-04-04"	 <=	"2025-05-22" 판매가능
		// "2024-04-04"	 >	"2025-05-22" 판매불가
		
		// A.compareTo(B)
		// 유통기한.compareTo(오늘날짜) => 0이나 1일 때 판매 가능
		// A(기준값)가 크면: 1 
		// A(기준값)이 작으면: -1
		// A(기준값)과 같으면: 0
		
		if (this.expiration.compareTo("2024-04-04") >= 0) {
			return "판매 가능 상품";
		} 
		return "판매 불가 상품";
		
		
	}
}

