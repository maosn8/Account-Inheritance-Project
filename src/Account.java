import java.util.*;

public class Account {
    Random randID = new Random();
    private int id;
    private double balance;
    public Account(){
        id = randID.nextInt(1,99999);
        balance = 0;
    }
    public Account(int bal){
        id = randID.nextInt(1,99999);
        balance = bal;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double bal){
        balance = bal;
    }
    public String toString(){
        return "Account ID: " + id + "\nBalance: " + balance;
    }
}
