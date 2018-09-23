public class Bus extends Vehicle{
    private int buses;
    Bus(int b){
        super(b);
        buses = b;
    }
    public int numberOfBuses(){
        return buses;
    }
}