package patterns.structural.adapter_pattern;

import patterns.structural.adapter_pattern.third_party.RazorPayment;

public class RazorPaymentAdapter implements Payment {

    private RazorPayment razorPayment;

    public RazorPaymentAdapter(RazorPayment razorPayment) {
        this.razorPayment = razorPayment;
    }

    @Override
    public void validate() {
        this.razorPayment.validatePayment();
    }

    @Override
    public void pay() {
        this.razorPayment.performTransaction();
    }

    @Override
    public void ack() {
        this.razorPayment.acknowledgement();
    }
}
