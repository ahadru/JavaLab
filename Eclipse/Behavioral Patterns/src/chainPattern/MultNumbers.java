package chainPattern;

public class MultNumbers implements Chain {

	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "Mul") {
			return requests.getNum1() + requests.getNum2();
		}
		else {
			nextInChain.calculate(requests);
		}
		return 0;
	}

}
