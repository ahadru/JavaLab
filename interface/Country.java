public class Country implements Measurable{
    private double area;
    private String name;
    Country(String name,double area){
        this.area = area;
        this.name = name;
    }
    public double getMeasure(){
        return area;
    }
    public String getName(){
        return name;
    }
}