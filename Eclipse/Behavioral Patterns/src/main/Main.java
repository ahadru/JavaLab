package main;

import chainPattern.AddNumbers;
import chainPattern.Chain;
import chainPattern.DivNumbers;
import chainPattern.MultNumbers;
import chainPattern.Numbers;
import chainPattern.SubNumbers;

public class Main {
	public static void main(String[] args) {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MultNumbers();
		Chain chainCalc4 = new DivNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Numbers request1 = new Numbers(4, 2, "Add");
		System.out.print(4 + " + " + 2 +" = ");
		System.out.println(chainCalc1.calculate(request1));
		
		Numbers request2 = new Numbers(4, 2, "Sub");
		System.out.print(4 + " - " + 2 +" = ");
		System.out.println(chainCalc1.calculate(request2));
		
		Numbers request3 = new Numbers(4, 2, "Mul");
		System.out.print(4 + " * " + 2 +" = ");
		System.out.println(chainCalc1.calculate(request3));
		
		Numbers request4 = new Numbers(4, 2, "Div");
		System.out.print(4 + " / " + 2 +" = ");
		System.out.println(chainCalc1.calculate(request4));
	}
}
