public class Credit extends Account{
    private double apr;
    public Credit(){
        super();
        apr = 0;
    }
    public Credit(double a){
        super();
        apr = a;
    }
    public void setApr(double a) {
        apr = a;
    }
    public double getApr() {
        return apr;
    }
    public void makePurchase(double p){
        setBalance(getBalance()+p);
    }
    public void monthlyStatement(){
        System.out.println("Pay on time: " + getBalance());
        System.out.println("Pay late: " + getBalance()+(getBalance() * (apr / 12)));
    }
    public double monthsToPayOff(int m){
        return getBalance()*(((apr/12)*Math.pow(1+(apr/12),m))/(Math.pow(1+(apr/12),m)-1));
    }
    public String toString(){
        return super.toString() + "\nAPR: " + apr;
    }
}
