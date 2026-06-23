package hands_on._02_di.e_constructor_di_map;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentProcessor {

    Map<String,Payment> payments;

    public PaymentProcessor( Map<String,Payment>  payment) {
        this.payments = payment;
    }

    public void processPayment(String paymentType) {
       processPayment(this.payments.get(paymentType));
    }
    private static void processPayment(Payment payment) {
        payment.validatePayment();
        payment.pay();
        payment.acknowledge();
    }
}
