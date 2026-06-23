package hands_on._02_di.d_constructor_di_enum;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentProcessor {

    List<Payment> payments;

    public PaymentProcessor(List<Payment> payment) {
        this.payments = payment;
    }

    public void processPayment(String paymentType) {
        for (Payment payment : this.payments){
            if(payment.getType().equals(paymentType)){
                processPayment(payment);
                break;
            }
        }
    }
    private static void processPayment(Payment payment) {
        payment.validatePayment();
        payment.pay();
        payment.acknowledge();
    }
}
