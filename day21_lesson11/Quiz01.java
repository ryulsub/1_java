package day21_lesson11;

public class Quiz01 {

	public static void main(String[] args) throws InterruptedException {
		AnimalThread animal1 = new AnimalThread("어흥");
		AnimalThread animal2 = new AnimalThread("음메~");
		AnimalThread animal3 = new AnimalThread("히잉");
		Thread tiger = new Thread(animal1);
		Thread cow = new Thread(animal2);
		Thread horse = new Thread(animal3);
		
		tiger.start();	
		cow.start();
		tiger.join();
		cow.join();
		horse.start();
	}

	

}
