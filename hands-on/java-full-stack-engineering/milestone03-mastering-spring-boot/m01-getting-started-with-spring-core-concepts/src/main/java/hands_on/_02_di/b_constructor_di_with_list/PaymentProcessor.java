package hands_on._02_di.b_constructor_di_with_list;

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
            if("upi".equals(paymentType) && payment instanceof UPIPayment){
                processPayment(payment);
            }else  if("credit".equals(paymentType) && payment instanceof CreditCardPayment){
                processPayment(payment);
            }else  if("cash".equals(paymentType) && payment instanceof CashPayment){
                processPayment(payment);
            }
        }
    }
    private static void processPayment(Payment payment) {
        payment.validatePayment();
        payment.pay();
        payment.acknowledge();
    }
}
