package _01_coupling._02_loose_coupling;

public class PaymentProcessor {
    Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void processPayment() {
        this.payment.validatePayment();
        this.payment.pay();
        this.payment.acknowledge();
    }
}
