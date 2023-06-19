package intro;

import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        int decimal = asDecimal("11001101");

        String binary = asString(5);

        System.out.println(decimal); // 205
        System.out.println(binary); // 1010
    }
    // 10 - 1010
    public static String asString(int input) {
        String result = "";
        while (input > 0) {
            if (input % 2 == 0) {
                result = '0' + result;

            }
            else {
                result = '1' + result;
            }
            input /= 2;
        }
        return result;
    }


    public static int asDecimal(String input) {
        input = reverse(input);
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                result += pow(2, i);
            }

        }
        return result;
    }



    private static String reverse(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {

            result= input.charAt(i) + result;
        }
        return result;
    }


    private static int pow(int arg, int power) {
        // Java has Math.pow() but this time write your own implementation.
            if (arg == 0){
                return 1;
            }
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= arg;
        }
           return result;
        }



}
