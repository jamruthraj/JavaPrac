import java.util.Scanner;

public class AccountOperations {

    public static void main(String... args) {
        String acNum, custName, email;
        double bal;
        long phone;
        //accept string ac#, double bal, string custName, string email, long phone
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bank, Create your profile");
        System.out.println("Enter your name and Account Number");
        custName = sc.next();
        acNum = sc.next();
        System.out.println("Enter your email address");
        email = sc.next();
        System.out.println("Enter your Phnone Number");
        phone = sc.nextLong();
        System.out.println("Enter your initial balance");
        bal = sc.nextDouble();
        BankAccount account1 = new BankAccount(acNum, bal, custName, email, phone);

        System.out.println("Account created is " + account1);

        System.out.println("Enter money to be withdrawn:");
        double wm = sc.nextDouble();
        double bal1 = account1.withdrawMoney(wm);

        System.out.println("Enter money to be deposited");
        double dm = sc.nextDouble();
        double bal2 = account1.depositMoney(dm);

        System.out.println("Account status now: " + account1);

    }

}

class Fomatter {

    public String formatter(String input) {
        return "formatter";
    }

}