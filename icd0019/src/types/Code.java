package types;

import java.util.Arrays;
import java.util.Random;

public class Code {

    public static void main(String[] args) {

        int[] numbers = {1, 3, -2, 9};

        System.out.println(sum(numbers)); // 11
    }

    public static int sum(int[] numbers) {
        int result = 0;
        for (int number: numbers) {
            result += number;

        }
        return result;
    }

    public static double average(int[] numbers) {
        double sum = sum(numbers);

        return Double.valueOf(sum / numbers.length);

    }



    public static Integer minimumElement(int[] integers) {
        if (integers.length == 0)
            return null;
        int minimumElement = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] < minimumElement)
                minimumElement = integers[i];
        }
        return minimumElement;
    }

    public static String asString(int[] elements) {
        String result = "";
        for (int i = 0; i < elements.length; i++) {
            if (i == elements.length-1)
                result += elements[i];
            else {
                result += elements[i] + ", ";
            }
        }

        return result ;
    }


    public static Character mode(String input) {
        return null;
    }

    public static String squareDigits(String s) {
        return "";
    }

    public static int isolatedSquareCount() {
        boolean[][] matrix = getSampleMatrix();

        printMatrix(matrix);

        int isolatedCount = 0;

        // count isolates squares here

        return isolatedCount;
    }

    private static void printMatrix(boolean[][] matrix) {
        for (boolean[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static boolean[][] getSampleMatrix() {
        boolean[][] matrix = new boolean[10][10];

        Random r = new Random(5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = r.nextInt(5) < 2;
            }
        }

        return matrix;
    }
}
