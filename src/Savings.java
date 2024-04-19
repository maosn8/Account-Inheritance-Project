public class Savings extends Bank{
    private double interest;
    public Savings(){
        super();
        interest = 0;
    }
    public Savings(double i){
        super();
        interest = i;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double i) {
        interest = i;
    }
    public int amountInAccount(double money){
        return (int)(Math.ceil(Math.log(money/getBalance()))/(12*Math.log(1+(interest/12))));
    }
    public void withdraw(double w){
        if(getBalance()-w <0){
            System.out.println("You are attempting to take too much out of your account.");
        } else {
            super.withdraw(w);
        }
    }
    public String toString(){
        return super.toString() + "\nInterest Rate: " + interest;
    }
}
