package _01_coupling._01_tight_coupling;

public class PaymentProcessor {
    CreditCardPayment payment;

    public PaymentProcessor(CreditCardPayment payment) {
        this.payment = payment;
    }

    public void processPayment(){
        this.payment.validate();
        this.payment.pay();
        this.payment.ack();
    }
}
