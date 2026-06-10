package m01_language_fundamentals;

public class CodeRefactoring {

    public static void main(String[] args) {
        doStuff("John", 50000, 10);
    }

    public static void doStuff(String s1, double n1, int x) {
        if (s1 == null || s1.trim().isEmpty()) {
            System.out.println("Invalid employee name");
            return;
        }
        if (n1 <= 0) {
            System.out.println("Invalid salary");
            return;
        }
        double d = 0;
        if (x >= 10) {
            d = n1 * 0.20;
        } else if (x >= 5) {
            d = n1 * 0.10;
        } else {
            d = n1 * 0.05;
        }
        double z = n1 + d;

        System.out.println("Name  : " + s1);
        System.out.println("Salary: " + n1);
        System.out.println("Bonus : " + d);
        System.out.println("Total : " + z);
    }
}
