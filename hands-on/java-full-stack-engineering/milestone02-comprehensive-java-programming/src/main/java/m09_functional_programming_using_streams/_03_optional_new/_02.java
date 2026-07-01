package m09_functional_programming_using_streams._03_optional_new;

import java.util.Optional;

public class _02 {

    static String getName() {
        return "Naveen Pn";
    }

    static Optional<String> getNameWithOptional() {
        return Optional.ofNullable("Naveen Pn");
    }

    public static void main(String[] args) {
        String name = getName();
        if (name != null) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println("Not Found");
        }

        Optional<String> nameWrappedInOptional = getNameWithOptional();
        nameWrappedInOptional.ifPresentOrElse(e -> System.out.println(e.toUpperCase()),
                () -> System.out.println("Not Found"));


    }
}
