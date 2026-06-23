package hands_on._02_di.b_constructor_di_with_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMainApp {
    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(SpringBootMainApp.class);

      /*  Payment creditCardPayment = new CreditCardPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCardPayment);
        paymentProcessor.processPayment();*/

        PaymentProcessor paymentProcessor = context.getBean(PaymentProcessor.class);
        paymentProcessor.processPayment("credit");


    }
}
