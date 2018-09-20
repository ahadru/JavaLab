public abstract class Vehicle{
    private int vehicles = 0;
    Vehicle(int n){
        vehicles = vehicles + n;
    }
    public abstract int brand();
    public int numberOfVehicle(){
        return vehicles;
    }
}