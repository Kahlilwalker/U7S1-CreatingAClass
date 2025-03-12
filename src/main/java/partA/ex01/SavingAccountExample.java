package partA.ex01;


/** * A bank account has a balance that can be changed by
 adding deposits or subtracting withdrawals
 * @author Kahlil Walker
 */

public class SavingAccountExample {
    public static double balance = 1000;
    public static double interestRate = 0.01;
    public static String name = "james";
    public static void deposit(int x){
        balance += x;
    }

    public static String displayCustomer(){
        System.out.println("Customer: "+name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);

        return " ";
    }

    public static void main(String[] args) {
        String displayOutput = displayCustomer();
        System.out.print(displayOutput);
    }

}
