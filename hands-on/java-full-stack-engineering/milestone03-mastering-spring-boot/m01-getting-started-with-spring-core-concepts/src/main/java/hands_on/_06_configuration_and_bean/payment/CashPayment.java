package hands_on._06_configuration_and_bean.payment;

import org.springframework.stereotype.Component;

@Component("cash")
public class CashPayment implements Payment {
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
