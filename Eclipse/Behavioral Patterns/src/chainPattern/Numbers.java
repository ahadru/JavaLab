package chainPattern;

public class Numbers {
	private double num1;
	private double num2;
	private String calculationWanted;
	
	public Numbers(double n1,double n2,String calW) {
		this.num1 = n1;
		this.num2 = n2;
		this.calculationWanted = calW;
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}
	
	public String getCalculationWanted() {
		return calculationWanted;
	}
}
