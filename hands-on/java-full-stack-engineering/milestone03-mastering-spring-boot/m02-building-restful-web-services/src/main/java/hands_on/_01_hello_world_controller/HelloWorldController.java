package hands_on._01_hello_world_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/hello-world")
    public String sayHello(){
        return "Hello from Controller";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/hello-world-bean")
    public HelloWorldDTO sayHelloBean(){
        return new HelloWorldDTO("Hello World From Bean");
    }
}
