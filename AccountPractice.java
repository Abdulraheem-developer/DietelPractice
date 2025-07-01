public class AccountPractice {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public AccountPractice(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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

    public int deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited, New balance is " + balance);
        return 0;
    }
    public int withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance, New balance is " + balance);
        }else {
            balance -= amount;
            System.out.println("Amount withdrawn, New balance is " + balance);
        }
        return 0;
    }
    public void printSummary() {
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }
    public static void main(String[] args) {
        AccountPractice account = new AccountPractice("Abdulraheem Sanni", "2146654390", 88_000);
        account.printSummary();
        account.deposit(5_000);
        account.withdraw(2_000);
        account.withdraw(90_000);
        account.setAccountHolderName("Kameelah Sanni");
        account.printSummary();


    }
}
