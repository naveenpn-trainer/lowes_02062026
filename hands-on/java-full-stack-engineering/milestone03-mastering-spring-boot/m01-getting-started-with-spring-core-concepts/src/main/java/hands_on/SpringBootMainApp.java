package hands_on;

import hands_on._01_ioc.MessagePrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMainApp {
    public static void main(String[] args) {

       ApplicationContext context =  SpringApplication.run(SpringBootMainApp.class);
//       MessagePrinter messagePrinter = new MessagePrinter();
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMe();
    }
}
