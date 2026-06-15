public class PaymentApp {

    public static void processPayment(Payment payment, int amount) {
        payment.pay(amount);
    }

    public static void main(String[] args) {

        CardPayment card = new CardPayment();
        UpiPayment upi = new UpiPayment();
        CashPayment cash = new CashPayment();

        processPayment(card, 2500);
        processPayment(upi, 1200);
        processPayment(cash, 500);
    }
}