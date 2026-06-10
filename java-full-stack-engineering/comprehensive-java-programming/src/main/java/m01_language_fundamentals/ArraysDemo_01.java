package m01_language_fundamentals;

import java.util.Arrays;

public class ArraysDemo_01 {
    public static void main(String[] args) {
        /*String[] programmingLanguages = {"C", "C++", "Java", "Scala", "Groovy"};
        int x = 1;
        System.out.println(Arrays.toString(programmingLanguages));
*/
        int []num1 = {1,2,3};
        int []num2 = {1,2,3};
        int x = 10, y = 10;
        System.out.println(num1==num2);
        System.out.println(Arrays.equals(num1,num2));


    }
}
