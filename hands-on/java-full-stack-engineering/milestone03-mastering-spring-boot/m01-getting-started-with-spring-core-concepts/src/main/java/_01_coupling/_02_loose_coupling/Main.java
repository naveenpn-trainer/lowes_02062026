package _01_coupling._02_loose_coupling;


public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();

        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCardPayment);
        paymentProcessor.processPayment();
    }
}
