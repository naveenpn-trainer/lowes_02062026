package _01_coupling._01_tight_coupling;

public class CreditCardPayment {
    public void validate(){
        System.out.println("Validating Credit Card");
    }

    public void pay(){
        System.out.println("Credit Card Pay");
    }

    public void ack(){
        System.out.println("Credit Card Payment Acknowledged");
    }
}
