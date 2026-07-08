class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance : " + balance);
    }
}

class BankService {

    public void processWithdrawal(BankAccount account, double amount)
            throws InsufficientBalanceException {

        account.withdraw(amount);
    }
}

public class BankApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);
        BankService service = new BankService();

        try {
            service.processWithdrawal(account, 2000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Business Error : " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Input Error : " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Error : " + e.getMessage());
        }
        finally {
            System.out.println("Transaction Completed");
        }
    }
}