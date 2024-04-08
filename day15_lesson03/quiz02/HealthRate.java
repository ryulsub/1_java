package day15_lesson03.quiz02;

// 자식 클래스
public class HealthRate extends HealthInfo {
	
	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	// 표준체중:SW=(H-100)*0.9
	public double sw() {
		return (super.height - 100) * 0.9;
	}
	
	// 비만도: B(%)=(W-SW)/SW * 100
	private double getRatio() {
		return (this.weight - sw()) / sw() * 100; 
	}
	
	// 비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만
	private String status() {
		double ratio = getRatio();
		if (ratio < 10) {
			return "정상";
		} else if (ratio < 20) { // 10 ~ 19
			return "과체중";
		}
		return "비만";
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("=> " + status());
	}
}
