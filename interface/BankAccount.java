public class BankAccount implements Measurable{
    private double balance;
    BankAccount(double x){
        balance = x;
    }
    public double getMeasure(){
        return balance;
    }
}