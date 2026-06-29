package m01_language_fundamentals;

public class ArrayCreation_01 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 100;
        for (int numIndex = 0; numIndex < numbers.length; numIndex++) {
            System.out.println(numbers[numIndex]);
        }
        /*for(int number : numbers){
            System.out.println(number);
        }*/

    }
}
