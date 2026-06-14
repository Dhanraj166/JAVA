class ATM {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC123", "Dhanraj", 1234);

        acc.deposit(20000);

        System.out.println(acc.getAccountNumber());

        boolean success = acc.withdraw(5000, 1234);

        if (success) {
            System.out.println("Withdrawal successful");
            System.out.println("Balance: " + acc.getBalance(1234));
        } else {
            System.out.println("Invalid transaction");
        }
    }
}