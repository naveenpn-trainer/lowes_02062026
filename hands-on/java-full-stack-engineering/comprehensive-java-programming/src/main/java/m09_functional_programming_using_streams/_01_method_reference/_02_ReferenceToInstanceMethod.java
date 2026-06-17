package m09_functional_programming_using_streams._01_method_reference;

import java.util.List;
import java.util.function.Supplier;

public class _02_ReferenceToInstanceMethod {
    public static void main(String[] args) {
        List<String> programmingLangauges = List.of("C","C++","Java");
        programmingLangauges.forEach(System.out::println);

        String st = "naveen";
        Supplier<String> fn = st::toLowerCase;
        System.out.println(fn.get());
    }
}
