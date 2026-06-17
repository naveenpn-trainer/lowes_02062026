package m09_functional_programming_using_streams._02_imerative_vs_declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _01 {
    public static void main(String[] args) {
        List<String> names = List.of("anand", "arjun", "anvantika", "balaram");
        List<String> allNamesWithA = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("a")) {
                allNamesWithA.add(name);
            }
        }
        System.out.println(allNamesWithA);

        Predicate<String> doesItStartsWithA = getFN("a");
        List<String> requiredNames = names.stream().filter(doesItStartsWithA).collect(Collectors.toList());
        requiredNames.forEach(System.out::println);
    }

    private static Predicate<String> getFN(String ch) {
        return e -> e.startsWith(ch);
    }
}
