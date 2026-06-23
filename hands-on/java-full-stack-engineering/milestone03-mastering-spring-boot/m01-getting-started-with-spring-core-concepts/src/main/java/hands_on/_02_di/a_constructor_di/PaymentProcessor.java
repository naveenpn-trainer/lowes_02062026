package hands_on._02_di.a_constructor_di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {

    Payment payment;

    public PaymentProcessor(@Qualifier("upi") Payment payment) {
        this.payment = payment;
    }

    public void processPayment() {
        this.payment.validatePayment();
        this.payment.pay();
        this.payment.acknowledge();
    }
}
