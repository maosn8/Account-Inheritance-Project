public class Bank extends Account{
    private String name;
    public Bank(){
        super();
        name = "unknown";
    }
    public Bank(String n, double b){
        super(b);
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String toString(){
        return super.toString() + "\nName: " + name;
    }
    public void deposit(double d){
        setBalance(getBalance()+d);
    }
    public void withdraw(double w){
        setBalance(getBalance()-w);
    }
}
