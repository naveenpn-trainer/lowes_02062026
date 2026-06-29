package hands_on._06_configuration_and_bean.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {

    Payment payment;

    public PaymentProcessor(@Qualifier("razorpay") Payment payment) {
        this.payment = payment;
    }

    public void processPayment() {
        this.payment.validatePayment();
        this.payment.pay();
        this.payment.acknowledge();
    }
}
