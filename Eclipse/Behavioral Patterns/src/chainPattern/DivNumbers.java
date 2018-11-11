package chainPattern;

public class DivNumbers implements Chain{
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "Div") {
			return requests.getNum1() + requests.getNum2();
		}
		else {
			return -1;
		}
		//return 0;
	}
}
