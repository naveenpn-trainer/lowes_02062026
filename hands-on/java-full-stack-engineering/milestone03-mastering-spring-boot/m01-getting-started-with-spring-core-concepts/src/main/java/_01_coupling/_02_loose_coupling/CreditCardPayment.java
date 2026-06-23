package _01_coupling._02_loose_coupling;

public class CreditCardPayment implements Payment {
    @Override
    public void validatePayment() {
        System.out.println("Validating Credit Card");
    }

    @Override
    public void pay() {
        System.out.println("Paying via Credit Card");
    }

    @Override
    public void acknowledge() {
        System.out.println("Credit Card Transaction Acknowledgement");
    }
}
