package hands_on._02_di.b_constructor_di_with_list;

import org.springframework.stereotype.Component;
//@Primary
@Component("upi")
public class UPIPayment  implements Payment {
    @Override
    public void validatePayment() {
        System.out.println("Validating UPI");
    }

    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }

    @Override
    public void acknowledge() {
        System.out.println("UPI Transaction Acknowledgement");
    }
}
