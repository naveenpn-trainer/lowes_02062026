package patterns.structural.adapter_pattern.third_party;

import patterns.structural.adapter_pattern.Payment;

public class RazorPayment {

    public void validatePayment() {
        System.out.println("Razor validation");
    }

    public void performTransaction() {
        System.out.println("Razor pay");
    }

    public void acknowledgement() {
        System.out.println("Razor ack");
    }
}

