package hands_on._02_di.f_autowired;

import hands_on._02_di.a_constructor_di.SpringBootMainApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

interface Payment {
    public void pay();
}

@Component("upi")
class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
}

@Component("credit")
class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("CreditCard Payment");
    }
}

@Component
class PaymentProcessor {
    private Payment payment;


    public PaymentProcessor(@Qualifier("credit") Payment payment) {
        this.payment = payment;
    }

    @Autowired
    public PaymentProcessor(@Value("Naveen") String st) {
        System.out.println("st=" + st);
    }

    public void processPayment() {
        if (this.payment != null) {
            this.payment.pay();
        }
    }
}

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class);

        PaymentProcessor paymentProcessor = context.getBean(PaymentProcessor.class);
        paymentProcessor.processPayment();
    }
}
