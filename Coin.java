public class Coin{
    private double value;
    private String name;
    Coin(String name, double value){
        this.name = name;
        this.value = value;
    }
    double getValue(){
        return value;
    }
    String getName(){
        return name;
    }
}