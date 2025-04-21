package partA.ex02;

import static partA.ex01.SavingAccountExample.interestRate;

public class SavingBond {
        public String name;
        public static double balance;
        public  static double rate;
        public static int term, monthsRemaining;

     static void interest() {
            int t = 10;
            if (t >= 0 && t < 12)
                rate = 0.005;
            else if (t >= 12 && t < 24)
                rate = 0.010;
            else if (t >= 24 && t < 36)
                rate = 0.015;
            else if (t >= 36 && t < 48)
                rate = 0.020;
            else if (t >= 48 && t <= 60)
                rate = 0.025;
            else {
                System.out.println("Invalid Term");
                t = 10;

            }
            term = t;
            monthsRemaining = t;;
        }

        public static void earnInterest() {
           balance = 1000;
            if (monthsRemaining > 0) {
                balance += balance * rate / 12;
                monthsRemaining--;
                System.out.println("Balance: $" + balance);
                System.out.println("Rate: " + rate);
                System.out.println("Months Remaining: "
                        + monthsRemaining);
            } else {
                System.out.println("Bond Matured");
            }
        }


        public static double getBalance() {
           balance = 1000;
            balance = balance * rate;
            return balance;
        }



    public static void main(String[] args) {
        System.out.println(new SavingBond());
        interest();
        earnInterest();
        System.out.println(getBalance());




    }
}


