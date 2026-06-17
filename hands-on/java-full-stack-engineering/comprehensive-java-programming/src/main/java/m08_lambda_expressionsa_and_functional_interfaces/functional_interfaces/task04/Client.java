package m08_lambda_expressionsa_and_functional_interfaces.functional_interfaces.task04;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class Client {
    public static void main(String[] args) {
        Person[] persons = {
                new Person(1, "35,BSK,Karnataka,Bengaluru,560061"),
                new Person(1, "36,BSK,Karnataka,Bengaluru,560061"),
                new Person(1, "37,BSK,Karnataka,Bengaluru,560061")
        };

//        int addressId = 100;
        AtomicInteger atomicInteger = new AtomicInteger(100);
        Function<Person, Address> logicFn = (p) -> {
            String[] addressSplits = p.address.split(",");
            String requiredAddress = null;
            /*if (addressSplits.length == 5) {
                requiredAddress = p.address.split(",")[0] + "," + p.address.split(",")[2] + "," + p.address.split(",")[3] + "," + p.address.split(",")[4];
            }else{
                requiredAddress = p.address.split(",")[0] + "," + p.address.split(",")[2] + "," + p.address.split(",")[3] + "," + "Not Mentioned";
            }
*/
            requiredAddress = p.address.split(",")[0] + "," + p.address.split(",")[2] + "," + p.address.split(",")[3] + "," + (p.address.split(",").length == 5 ? p.address.split(",")[4] : "Not Mentioned");
            Address address = new Address(p.id, atomicInteger.incrementAndGet(), requiredAddress);
            return address;
        };

        Address[] addresses = new Address[persons.length];
        for (int i = 0; i < persons.length; i++) {
           addresses[i] =logicFn.apply(persons[i]);
        }

        System.out.println(Arrays.toString(addresses));


    }
}
