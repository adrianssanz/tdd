package org.tdd;

import java.util.ArrayList;
import java.util.List;

public class ListMultiplos {
    public static List<String> listMultiplos(){
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("fizzbuzz");
            } else if (i % 3 == 0) {
                result.add("fizz");
            } else if (i % 5 == 0) {
                result.add("buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
