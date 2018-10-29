package main;

import java.util.Scanner;

/**
 * <h1>A simple Calculator</h1>
 * This program simply take two number and show some arithmetic implementation
 * @author Ahad
 * @version 1.0
 * @since 2018-10-29
 */

@MyCustomAnnotation(
		authorName = "Ahad",
		authorAddress = "Rajshahi",
		authorInterest = "Java Development"
)
public class Calc {
	/**
	 * This method add two integer number.
	 * @param value1 It is a integer value
	 * @param value2 It is a integer value
	 * @return int This returns sum of two integer.
	 */
	public int add(int value1,int value2) {
		return value1 + value2;
	}
	
	/**
	 * This method subtract two integer number.
	 * @param value1 It is a integer value
	 * @param value2 It is a integer value 
	 * @return int This returns subtraction of two integer.
	 */
	public int sub(int value1,int value2) {
		return value1 - value2;
	}
	
	/**
	 * This method multiply two integer number.
	 * @param value1 It is a integer value
	 * @param value2 It is a integer value
	 * @return int This returns multiplication of two integer.
	 */
	public int mul(int value1,int value2) {
		return value1 * value2;
	}
	
	/**
	 * This method divide two integer number.
	 * @param value1 It is a integer value
	 * @param value2 It is a integer value
	 * @return double This returns division of two integer.
	 */
	public double div(int value1,int value2) {
		return value1 / value2;
	}
	
	/**
	 * This is main program handler method.     
	 * @param args, Not used
	 * */
	public static void main(String[] args) {
		Calc run = new Calc();
		int num1 ,num2;
		int op;
		Scanner in = new Scanner(System.in);
		while(true) {
			
			System.out.println("\nChoose apropriate option number");
			System.out.print("1.Add\n"
					+ "2.Subtraction\n"
					+ "3.Multiplication\n"
					+ "4.Division\n"
					+ "5.Quit\n");
			op = in.nextInt();
			if(op == 1) {
				System.out.println("\nEnter two number");
				num1 = in.nextInt();
				num2 = in.nextInt();
				System.out.println();
				System.out.println("Result = " + run.add(num1, num2));
			}
			else if(op == 2) {
				System.out.println("\nEnter two number");
				num1 = in.nextInt();
				num2 = in.nextInt();
				System.out.println();
				System.out.println("Result = " + run.sub(num1, num2));
			}
			else if(op == 3) {
				System.out.println("\nEnter two number");
				num1 = in.nextInt();
				num2 = in.nextInt();
				System.out.println();
				System.out.println("Result = " + run.mul(num1, num2));
			}
			else if(op == 4) {
				System.out.println("\nEnter two number");
				num1 = in.nextInt();
				num2 = in.nextInt();
				System.out.println();
				System.out.println("Result = " + run.div(num1, num2));
			}
			else {
				break;
			}
			
		}
	}
}
