package hands_on._02_di.d_constructor_di_enum;

import org.springframework.stereotype.Component;

@Component("cash")
public class CashPayment implements Payment {
    @Override
    public String getType() {
        return "cash";
    }

    @Override
    public void validatePayment() {
        System.out.println("Validating Cash");
    }

    @Override
    public void pay() {
        System.out.println("Paying via Cash");
    }

    @Override
    public void acknowledge() {
        System.out.println("Cash Transaction Acknowledgement");
    }
}
