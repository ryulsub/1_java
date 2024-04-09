package day16_lesson05.quiz01;

public class DollerToWon extends Converter {
	
	public DollerToWon(double won) {
		super.ratio = won;
	}
	
	@Override
	protected void printConverted() {
		System.out.println((int)this.result + "원");
		
	}
	
	
}