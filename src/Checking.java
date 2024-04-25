public class Checking extends Bank{
    private double fee;
    public Checking(){
        super();
        fee = 0;
    }
    public Checking(double f, String name, double b){
        super(name, b);
        fee = f;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double f) {
        fee = f;
    }
    public void withdraw(double w){
        super.withdraw(w);
        if (getBalance() < 0){
            super.withdraw(fee);
        }
    }
    public String toString(){
        return super.toString() + "\nFee: " + fee;
    }
}
