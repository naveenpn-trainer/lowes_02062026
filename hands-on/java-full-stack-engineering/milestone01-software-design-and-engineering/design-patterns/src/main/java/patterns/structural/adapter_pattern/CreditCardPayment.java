package patterns.structural.adapter_pattern;

public class CreditCardPayment implements Payment {

    @Override
    public void validate() {
        System.out.println("CreditCardPayment validation");
    }

    @Override
    public void pay() {
        System.out.println("CreditCardPayment pay");
    }

    @Override
    public void ack() {
        System.out.println("CreditCardPayment ack");
    }
}
