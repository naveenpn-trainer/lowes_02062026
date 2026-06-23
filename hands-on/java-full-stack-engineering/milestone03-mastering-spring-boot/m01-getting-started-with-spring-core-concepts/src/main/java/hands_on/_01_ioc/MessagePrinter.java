package hands_on._01_ioc;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    public void printMe(){
        System.out.println("printMe() Invoked");
    }
}
