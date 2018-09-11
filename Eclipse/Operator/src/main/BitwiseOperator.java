package main;

public class BitwiseOperator {
	public int and(int a,int b) {
		return a&b;
	}
	public int or(int a,int b) {
		return a|b;
	}
	public int not(int a) {
		return ~a;
	}
	public int lestShift(int num,int shift) {
		return num << shift;
	}
	public int rightShift(int num,int shift) {
		return num >> shift;
	}
}
