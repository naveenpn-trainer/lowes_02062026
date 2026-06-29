package patterns.structural.adapter_pattern;

public class PayentProcessor {
    private Payment payment;

    public PayentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void process(){
        this.payment.validate();
        this.payment.pay();
        this.payment.ack();
    }
}
