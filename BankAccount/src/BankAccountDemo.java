public class BankAccountDemo {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount(12345, 1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getBalance());
    }
}
