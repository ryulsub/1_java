package day16_lesson05.quiz01;

public class CmToInch extends Converter{
	
	public CmToInch() {
		this.ratio = 0.394;
	}
	
	@Override
	protected void printConverted() {
		System.out.println(this.result + "인치");
		
	}

}
