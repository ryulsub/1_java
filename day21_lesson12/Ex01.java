package day21_lesson12;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리(Exception): 예상치 못한 상황에 대한 처리를 하는 것
		// runtime error에 대한 처리
		// try - catch - finally
		
		try {
//			// NPE
//			String str = null;
//			if (str.isEmpty()) {
//				System.out.println("str이 비어있다.");
//			}
			
			// 배열 범위 참조 오류
//			int[] arr = {1, 2, 3};
//			for(int i = 0; i <= arr.length; i++) {
//				System.out.println(arr[i]);
//			}
			
			// 형변환 오류
			Object x = new Integer(5);
			System.out.println((Integer)x);
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("NPE 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 참조 오류");
		} catch (Exception e) {
			System.out.println("모든 예외를 다 잡는다");
		} finally {
			System.out.println("예외든 아니든 무조건 불려진다.");
		}
		
		
		a();
		System.out.println("메인 메소드 끝");
	}
	
	public static void a() {
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void b() throws Exception {
		c();
	}
	
	public static void c() throws Exception {
		// 예외 발생 시키기
		// 예외 종류 2가지
		// 1) Checked Exception - Exception
		// 2) Unchecked Exception - RuntimeException
		//2) =>throw new RuntimeException();
		//1)
		throw new Exception();
		
		// checked exception에 대한 처리 방법 2가지
		// 1) 내가 처리한다. 
		// 2) 회피한다.
	}
}
