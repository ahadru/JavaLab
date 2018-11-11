package chainPattern;

public class SubNumbers implements Chain {

	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "Sub") {
			return requests.getNum1() + requests.getNum2();
		}
		else {
			nextInChain.calculate(requests);
		}
		return 0;
	}

}
