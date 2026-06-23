package lowes.utils;

public class MathUtils {
    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static boolean isEven(int number){
        return number%2==0;
    }
}
