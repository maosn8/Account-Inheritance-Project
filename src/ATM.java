import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome. What is your name?");
        String name = input.nextLine();
        System.out.println("What is your credit starting balance?");
        double bal = input.nextDouble();
        System.out.println("What is your starting APR?");
        Credit userCred = new Credit(input.nextInt(), bal);
        System.out.println("What is your checking starting balance?");
        bal = input.nextDouble();
        System.out.println("What is your overdraft fee?");
        Checking userCheck = new Checking(input.nextDouble(), name, bal);
        System.out.println("What is your savings starting balance?");
        bal = input.nextDouble();
        System.out.println("What is your interest rate?");
        Savings userSave = new Savings(input.nextDouble(), name, bal);
        int count = 0;
        while(count != 4) {
            System.out.println("Which account would you like to access?");
            System.out.println("1. Credit\n2.Checking\n3.Savings\n4.Exit");
            count = input.nextInt();
            if (count == 1){
                credit(userCred);
            } else if (count == 2) {
                checking(userCheck);
            } else {
                savings(userSave);
            }
        }
    }
    public static void credit (Credit acct){
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count != 5) {
            System.out.println("1.Check Balance");
            System.out.println("2.Make Purchase");
            System.out.println("3.Display Monthly Statement");
            System.out.println("4.Create Monthly Payment");
            System.out.println("5.Back to Main Menu");
            count = input.nextInt();
            if (count == 1) {
                System.out.println(acct.toString());
            } else if (count == 2) {
                System.out.println("How much?");
                acct.setBalance(acct.getBalance() - input.nextDouble());
            } else if (count == 3) {
                acct.monthlyStatement();
            } else if (count == 4) {
                System.out.println("Months to pay off in?");
                System.out.println(acct.monthsToPayOff(input.nextInt()) + " months to pay off debt.");
            }
        }
    }
    public static void checking (Checking acct){
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count != 4) {
            System.out.println("1.Check Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Back to Main Menu");
            count = input.nextInt();
            if (count == 1) {
                System.out.println(acct.toString());
            } else if (count == 2) {
                System.out.println("How much?");
                acct.withdraw(input.nextDouble());
            } else if (count == 3) {
                System.out.println("How much?");
                acct.deposit(input.nextDouble());
            }
        }
    }
    public static void savings (Savings acct){
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count != 5) {
            System.out.println("1.Check Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Display Months until Goal");
            System.out.println("5.Back to Main Menu");
            count = input.nextInt();
            if (count == 1) {
                System.out.println(acct.toString());
            } else if (count == 2) {
                System.out.println("How much?");
                acct.withdraw(input.nextDouble());
            } else if (count == 3) {
                System.out.println("How much?");
                acct.deposit(input.nextDouble());
            } else if (count == 4) {
                System.out.println("Account Goal?");
                System.out.println("It will take " + acct.amountInAccount(input.nextDouble()) + " months to get there.");
            }
        }
    }
}
