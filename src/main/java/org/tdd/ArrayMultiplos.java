package org.tdd;

public class ArrayMultiplos {
    public static String[] arrayMultiplos(){
        String[] result = new String[100];

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "fizzbuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }

        return result;
    }
}
