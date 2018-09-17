
public class Run {
	private final String SPACE = " ";
	private final String LEFT_PARENTHESIS = "( ";
	private final String RIGHT_PARENTHESIS = ") ";
	private int[] randomNumber;
	private StringBuffer outputRun;
	private StringBuffer longestRun;
	
	//constructor
	Run(int[] arr){
		randomNumber = arr;
		createRun();
		longestRun = new StringBuffer(outputRun);
	}
	//run creation
	private void createRun() { 
		for(int i = 0; i < randomNumber.length - 1; i++) {
			if(randomNumber[i] != randomNumber[i+1]) {
				if(i==randomNumber.length) {
					outputRun.append(String.valueOf(randomNumber[i]));
				}
				else {
					//outputRun.append(randomNumber[i]);
					//outputRun.append(SPACE);
				}
				//System.out.print(randomNumber[i] + " ");
			}
			else {
				//outputRun.append(LEFT_PARENTHESIS);
				//System.out.print("( " + randomNumber[i] + " ");
				int samevalue = randomNumber[i];
				while(randomNumber[i] == samevalue) {
					outputRun.append(String.valueOf(randomNumber[i]));
					outputRun.append(SPACE);
					//System.out.print(randomNumber[i] + " ");
					i++;
				}
				if(i==randomNumber.length) {
					outputRun.append(RIGHT_PARENTHESIS);
					outputRun.delete(i-1, i);
				}
				else {
					outputRun.append(RIGHT_PARENTHESIS);
				}
				//System.out.print(") ");
			}
		}
	}
	
	//display run
	StringBuffer displayRun() {
		return outputRun;
	}
	
	//longest run..
	void displayLongestRun() {
		
		int positionEnd = -1;
		int positionStart = -1;
		int position;
		int max = 0;
		int it = 0;
		for(int i = 0; i<longestRun.length(); i++) {
			if(longestRun.charAt(i) == '(') {
				position = i;
				i = i + 1;
				while(longestRun.charAt(i) != ')') {
					it = it + 1;
					i = i + 1;
				}
				if(it>max) {
					if(positionStart != -1 & positionEnd != -1) {
						longestRun.delete(positionStart, positionStart+1);
						longestRun.delete(positionEnd, positionEnd+1);
						i = i - 2;
					}
					positionStart = position;
					positionEnd = i-1; 
				}
				else{
					longestRun.delete(position, position+1);
					longestRun.delete(i-1, i);
				}
			}
		}
	}
}
