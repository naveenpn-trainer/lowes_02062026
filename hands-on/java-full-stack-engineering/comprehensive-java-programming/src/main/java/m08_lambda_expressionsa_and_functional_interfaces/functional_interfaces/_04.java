package m08_lambda_expressionsa_and_functional_interfaces.functional_interfaces;

import java.util.function.Predicate;

public class _04 {
    public static void printNumbers(Predicate<Integer> p, int[] numbers) {
        for (int number : numbers) {
            if(p.test(number)){
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {
                1, 2, 3, 4, 5,
                6, 7, 8, 9, 10,
                11, 12, 13, 14, 15,
                16, 18, 19, 20
        };

        Predicate<Integer> divisibleBy3 = (x) -> {
            return x % 3 == 0;
        };
        System.out.println("--divisibleBy3--");
        printNumbers(divisibleBy3,numbers);
        System.out.println("--divisibleBy5--");
        Predicate<Integer> divisibleBy5 = (x) -> {
            return x % 5 == 0;
        };

        printNumbers(divisibleBy5,numbers);
        System.out.println("--divisibleBy3And5--");

        printNumbers(divisibleBy3.and(divisibleBy5),numbers);


        Predicate<Integer> divisibleBy3And5 = (x) -> {
            return x % 3 == 0 && x % 5 == 0;
        };
        printNumbers(divisibleBy3And5,numbers);

        printNumbers(divisibleBy3And5.negate(),numbers);

        System.out.println("--notDivisiableBy3And5--");
        Predicate<Integer> notDivisiableBy3And5 = (x) -> {
            return !(x % 3 == 0 && x % 5 == 0);
        };
        printNumbers(notDivisiableBy3And5,numbers);
        printNumbers(divisibleBy3.and(divisibleBy5).negate(),numbers);


    }
}
