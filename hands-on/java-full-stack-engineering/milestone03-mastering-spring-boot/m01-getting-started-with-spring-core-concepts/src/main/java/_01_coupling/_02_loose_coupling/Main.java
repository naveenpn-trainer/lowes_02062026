package _01_coupling._02_loose_coupling;

import hands_on._02_di.a_constructor_di.CreditCardPayment;
import hands_on._02_di.a_constructor_di.Payment;
import hands_on._02_di.a_constructor_di.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();

        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCardPayment);
        paymentProcessor.processPayment();
    }
}
