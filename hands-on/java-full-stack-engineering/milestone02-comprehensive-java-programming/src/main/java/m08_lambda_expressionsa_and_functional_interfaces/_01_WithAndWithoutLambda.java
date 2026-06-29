package m08_lambda_expressionsa_and_functional_interfaces;
@FunctionalInterface
interface Greet {
    void greetMe(String name);
}

class HiGreet implements Greet {

    @Override
    public void greetMe(String name) {
        System.out.println("Hi " + name);
    }
}

class HelloGreet implements Greet {

    @Override
    public void greetMe(String name) {
        System.out.println("Hello: " + name);
    }
}

public class _01_WithAndWithoutLambda {
    static void testGreet(Greet greet, String name){
        greet.greetMe(name);
    }
    public static void main(String[] args) {
        Greet hiGreet = new HiGreet();
        testGreet(hiGreet,"Naveen");

        Greet helloGreet = new HelloGreet();
        testGreet(helloGreet,"Nikshay");

        Greet byeGreet =  new Greet() {
            @Override
            public void greetMe(String name) {
                System.out.println("Bye "+name);

            }
        };
        byeGreet.greetMe("ABC");

        Greet goodMorningGreet = (name)-> System.out.println("Good Morning"+name);
    }
}
