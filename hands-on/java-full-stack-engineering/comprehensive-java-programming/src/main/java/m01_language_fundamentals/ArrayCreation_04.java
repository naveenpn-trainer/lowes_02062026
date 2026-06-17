package m01_language_fundamentals;

public class ArrayCreation_04 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 13, 15, 16},
                {10, 90, 40, 50},
                {10, 90, 40, 50,100}
        };
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(row + "" + column + "\t");
            }
            System.out.println();
        }
    }
}
