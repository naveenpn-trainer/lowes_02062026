package m09_functional_programming_using_streams._03_optional_new;

import java.util.Optional;
import java.util.function.Consumer;

public class _01 {

    static String getName() {
        return "Naveen Pn";
    }

    static Optional<String> getNameWithOptional() {
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {
        String name = getName();
        if (name != null) {
            System.out.println(name);
        }

        Optional<String> optionalName = getNameWithOptional();
        optionalName.ifPresent(e-> System.out.println(e));
        optionalName.ifPresent(System.out::println);
    }
}
