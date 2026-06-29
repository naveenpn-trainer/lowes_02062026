package hands_on;

import hands_on._06_configuration_and_bean.payment.PaymentProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainAPp {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MainAPp.class);
        PaymentProcessor paymentProcessor = context.getBean(PaymentProcessor.class);
        paymentProcessor.processPayment();


    }
}
