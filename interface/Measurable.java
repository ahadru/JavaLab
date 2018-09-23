public interface Measurable{
    static final String NAME = "No Name";
    double getMeasure();
    static double average(Measurable[] objects){
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

    default String about(){
        return "It is a interface that implement mesure";
    }
}