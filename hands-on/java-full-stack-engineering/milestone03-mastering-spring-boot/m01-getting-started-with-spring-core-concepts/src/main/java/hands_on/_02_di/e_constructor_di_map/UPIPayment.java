package hands_on._02_di.e_constructor_di_map;

import org.springframework.stereotype.Component;
//@Primary
@Component("upi")
public class UPIPayment  implements Payment {
    @Override
    public String getType() {
        return "upi";
    }
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
