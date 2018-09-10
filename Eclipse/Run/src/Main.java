public class Main {
	public static void main(String[] args) {
		final int LENGTH = 20;
		int[] rand = new int[LENGTH];
		
		//Initilizing random value in a array randNum
		for(int i = 0;i < LENGTH; i++) {
			int random = (int )(Math.random() * 20 + 1);
			rand[i] = random;
		}
		
		//Displaying run
		System.out.println("Displaying Run");
		displayRun(rand);
		
		//Display Longest run only if found otherwise print only the array
		System.out.println();
		System.out.println();
		System.out.println("Displaying Longest Run");
		longestRun(rand);
		
	}
	static void displayRun(int[] randNum) {
		for(int i = 0; i < randNum.length - 1; i++) {
			if(randNum[i] != randNum[i+1]) {
				System.out.print(randNum[i] + " ");
			}
			else {
				System.out.print("( " + randNum[i] + " ");
				int samevalue = randNum[i];
				while(randNum[i] == samevalue) {
					System.out.print(randNum[i] + " ");
					i++;
				}
				System.out.print(") ");
			}
		}
	}
	static void longestRun(int[] randNum) {
		int max = 0;
		int maxPos = -1;
		int count = 0;
		for(int i = 0; i < randNum.length - 1; i++) {
			if(randNum[i] == randNum[i+1]) {
				int initialPos = i;
				int sameValue = randNum[i];
				while(randNum[i] != sameValue) {
					count++;
					i++;
				}
				
				if(max<count) {
					max = count;
					maxPos = initialPos;
				}
				count = 0;
			}
		}
		if(maxPos == -1) {
			System.out.println("No run value?");
			for(int x:randNum) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i = 0; i < randNum.length;i++) {
				if(i == maxPos) {
					System.out.print("( ");
					int sameValue = randNum[i];
					while(randNum[i] != sameValue) {
						System.out.print(randNum[i] + " ");
						if(i+1 == randNum.length) {
							break;
						}
						i++;
					}
					System.out.print(") ");
				}
				else {
					System.out.print(randNum[i] + " ");
				}
			}
		}
	}
}
