package m09_functional_programming_using_streams._03_optional_new;

import java.util.Optional;

public class _03 {
    public static void main(String[] args) {
        String name = null;
        Optional<String> nameWithOptional = Optional.ofNullable(null);
        System.out.println(nameWithOptional.get());
    }
}
