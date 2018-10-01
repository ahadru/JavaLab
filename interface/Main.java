public class Main{
    public static void main(String[] args) {
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(30);
        accounts[1] = new BankAccount(40);
        accounts[2] = new BankAccount(50);

        double averageBalance = Data.average(accounts);
        System.out.println(averageBalance);
        
        //Measurable bd = new Country("Bangladesh", 147570);
        //System.out.println(bd.getName()); //Wrong an interface can't access method that is not in the interface..
        System.out.println(Measurable.NAME);

        double averageBalances = Measurable.average(accounts);
        System.out.println(averageBalances);

        Measurable ob = new Country("Japan", 4324325);
        System.out.println(ob.about());

        Country BD = new Country("Bangladesh", 147570);
        Country IN = new Country("India", 3344578);
        Measurable max = larger(BD, IN);
        System.out.println(max.getName());
    }
    public static Measurable larger(Measurable ob1, Measurable ob2){
        if(ob1.getMeasure() > ob2.getMeasure()){
            return ob1;
        }
        else{
            return ob2;
        }
    }
}