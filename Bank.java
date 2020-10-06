import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);

    public static double withdrawal(double bal) {
        System.out.println("Enter money to be Withdrawn");
        double wm = sc.nextDouble();
        if (bal - wm < 0) {
            System.out.println("Insufficient Funds");
            return bal;
        } else {
            System.out.println("Withdrawal successful, remaining balance = " + (bal - wm));
            return bal - wm;
        }

    }

    public static double deposit(double bal) {
        System.out.println("Enter money to be Deposited");
        double dm = sc.nextDouble();
        System.out.println("Deposit successful, Balance = " + (bal + dm));
        return bal + dm;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank, Create your profile");
        System.out.println("Enter your name and Account Number");
        String name = sc.nextLine();
        String accnum = sc.next();
        System.out.println("Enter initial balance");
        double balance = sc.nextDouble();
        short c;
        do {
            System.out.println("Press 1 to do a withdrawal");
            System.out.println("Press 2 to Deposit Money");
            System.out.println("Press 3 to Exit");
            c = sc.nextShort();
            if (c == 1)
                balance = withdrawal(balance);
            else if (c == 2)
                balance = deposit(balance);
        } while (c != 3);
        System.out.println("Thanks for using our bank, Account Details :-");
        System.out.println("Name - " + name);
        System.out.println("Account Number - " + accnum);
        System.out.println("Balance = " + balance);
    }
}