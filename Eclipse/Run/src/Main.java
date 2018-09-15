public class Main {
	public static void main(String[] args) {
		final int LENGTH = 20;
		int[] rand = new int[LENGTH];
		
		//Initilizing random value in a array randNum
		for(int i = 0;i < LENGTH; i++) {
			int random = (int )(Math.random() * 20 + 1);
			rand[i] = random;
		}
		Run number = new Run(rand);
		
		//Displaying run
		number.displayRun();
		
		//Display Longest run only if found otherwise print only the array
		//number.displayLongestRun();
	}
}
