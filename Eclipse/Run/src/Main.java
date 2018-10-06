public class Main {
	public static void main(String[] args) {
		final int LENGTH = 20;
		int[] rand = new int[LENGTH];
		
		//Initilizing random value in a array randNum
		for(int i = 0;i < LENGTH; i++) {
			int random = (int )(Math.random() * 6 + 1);
			rand[i] = random;
		}
		
		Runs number = new Runs(rand);
		
		//Displaying run
		StringBuffer run = new StringBuffer(number.displayRun());
		System.out.println(run);
		
		//Display Longest run only if found otherwise print only the array
		//number.displayLongestRun();
	}
}
