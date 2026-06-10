package m01_language_fundamentals;

public class ProblemStatement01 {
    public static void main(String[] args) {
        int number = 15;

        if (isNumberDivisibleBy3(number)) {
            printFizzFuzz("Fizz \n Fuzz");
        } else if (isNumberDivisibleBy5(number)) {
            printFizzFuzz("Fizz");
        } else if (number % 5 == 0) {
            printFizzFuzz("Fuzz");
        } else {
            System.out.println(number);
        }
    }

    private static void printFizzFuzz(String x) {
        System.out.println(x);
    }

    private static boolean isNumberDivisibleBy5(int number) {
        return number % 3 == 0;
    }

    private static boolean isNumberDivisibleBy3(int number) {
        return number % 15 == 0;
    }
}
