package m01_language_fundamentals;

import java.util.Arrays;

public class CommandLineArguments {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Allowed to vote");
        } else {
            System.out.println("Not allowed to vote");
        }
        String output = age >= 18 ? "Allowed to vote" : "Not allowed to vote";

    }
}
