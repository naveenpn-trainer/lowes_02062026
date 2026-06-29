package patterns.structural.adapter_pattern;

import patterns.structural.adapter_pattern.third_party.RazorPayment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new RazorPaymentAdapter(new RazorPayment());
        PayentProcessor payentProcessor = new PayentProcessor(payment);
        payentProcessor.process();
    }
}
