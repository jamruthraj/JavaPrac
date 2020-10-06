class BankAccount {

    private String accountNumber;
    private double balance;
    private String custName;
    private String custEmail;
    private long custPhnone;

    public BankAccount() {

    }

    public BankAccount(String acNumber, double bal, String name, String email, long phone) {
        this.accountNumber = acNumber;
        this.balance = bal;
        this.custName = name;
        this.custEmail = email;
        this.custPhnone = phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public long getCustPhnone() {
        return custPhnone;
    }

    public void setCustPhnone(long custPhnone) {
        this.custPhnone = custPhnone;
    }

    public double withdrawMoney(double amount) {
        System.out.println("Money to be Withdrawn: " + amount);
        double wm = amount;
        if (balance - wm < 0) {
            System.out.println("Insufficient Funds");
            return balance;
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful, remaining balance = " + balance);
            return balance;
        }

    }

    public double depositMoney(double amount) {

        System.out.println("Money to be Deposited: " + amount);
        double dm = amount;
        balance += amount;
        System.out.println("Deposit successful, New Balance = " + balance);
        return balance;

        //return -99.0;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", custName='" + custName + '\'' +
                ", custEmail='" + custEmail + '\'' +
                ", custPhnone=" + custPhnone +
                '}';
    }
}
