public class StallPlacing{
    public static void main(String[] args) {
        int places;
        int stalls;
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter the number of places and number of stalls. stalls must be less then places");
        places = in.nextInt();
        stalls = in.nextInt();
        boolean[] placeArray = new boolean[places];
        for(int i = 0; i < stalls; i++){
            int pre = 0;
            int max = 0;
            if(i == 0){
                placeArray[places/2] = true;
            }
            else{
                for(int j = 0; j < places; j++){
                    int maxIt = 0;
                    while(placeArray[j] != true){
                        maxIt = maxIt + 1;
                        j = j + 1; 
                        System.out.println(j);
                        if(j == places){
                            break;
                        }
                    }
                    if(max < maxIt){
                        max = maxIt;
                        pre = j - maxIt;
                    }
                }
                placeArray[pre+(max/2)] = true;
            }
        } 
        for(int i = 0; i < places; i++){
            if(placeArray[i] == true){
                System.out.print('-');
            }
            else{
                System.out.print('X');
            }
        }
        in.close();
    }
}