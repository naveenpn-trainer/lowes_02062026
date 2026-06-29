package m09_functional_programming_using_streams._03_Optional;

import java.util.Optional;

public class _01 {

    public static String getName() {
        return null;
    }

    public static Optional<String> getNameWrappedInsideOptional() {
//        return Optional.of("naveen");
        return Optional.empty();
    }

    public static void main(String[] args) {
       /* String name = getName();
        if (name != null) {
            System.out.println(name.toUpperCase());
        }else{
            System.out.println("Anonymous");
        }*/

        Optional<String> name = getNameWrappedInsideOptional();
        name.ifPresent(System.out::println);
        System.out.println(name.orElse("Anonymous"));



    }

}
