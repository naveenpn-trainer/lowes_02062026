package m01_language_fundamentals;
import java.util.Scanner;
public class TakingInputFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);
    }
}
