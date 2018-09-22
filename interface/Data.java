public class Data{
    public static double average(Measurable[] objects){
        double sum = 0.0;
        for(Measurable ob: objects){
            sum = sum + ob.getMeasure();
        }
        if(objects.length > 0){
            return sum/objects.length;
        }
        else{
            return 0.0;
        }
    }
}