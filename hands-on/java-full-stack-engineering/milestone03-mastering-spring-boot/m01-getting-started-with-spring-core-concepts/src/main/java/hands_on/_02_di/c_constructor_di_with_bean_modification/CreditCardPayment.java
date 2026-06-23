package hands_on._02_di.c_constructor_di_with_bean_modification;

import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCardPayment implements Payment {

    @Override
    public String getType() {
        return "credit";
    }
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
