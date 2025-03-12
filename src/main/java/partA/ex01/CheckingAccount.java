package partA.ex01;

import java.awt.*;

public class CheckingAccount {

            public double balance;
            public String name;

            public void deposit ( int x){
            balance += x;
        }


    public void withdraw ( int x){
        balance -= x;
        if ( balance < 0){
            System.out.println("Insufficient Balance");
        }
    }

            public void displayCustomer () {
            System.out.println("Customer: " + name);
            System.out.println("Balance: " + balance);


        }




}
