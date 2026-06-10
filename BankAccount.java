class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;
    private int pin;

    public BankAccount(String accNo, String name, int pin) {
        this.accountNumber = accNo;
        this.holderName = name;
        setPin(pin);
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(int enteredPin) {
        if (enteredPin == pin) {
            return balance;
        }
        return -1;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount, int enteredPin) {
        if (enteredPin == pin && amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    private void setPin(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
        }
    }
}