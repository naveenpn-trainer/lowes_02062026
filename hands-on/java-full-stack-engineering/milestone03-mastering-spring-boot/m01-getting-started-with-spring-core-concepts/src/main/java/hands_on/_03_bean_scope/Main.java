package hands_on._03_bean_scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
class PaymentProcessor {
    public void processPayment() {
        System.out.println("Invoked processProcess()");
    }
}

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class);

        PaymentProcessor paymentProcessor1 = context.getBean(PaymentProcessor.class);
        PaymentProcessor paymentProcessor2 = context.getBean(PaymentProcessor.class);

        System.out.println(paymentProcessor1.hashCode());
        System.out.println(paymentProcessor2.hashCode());
    }
}
