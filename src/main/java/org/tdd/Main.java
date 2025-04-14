package org.tdd;


import java.util.ArrayList;
import java.util.List;

public class Main {
    private void invertCadena(String text){
        String [] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for ( int i = array.length; i > 0; i--){
            newText.append(array[i-1]);
        }

        System.out.println(newText.toString());
    }

    private static String[] arrayMultiplos(){
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

    private static List<String> listMultiplos(){
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

    public static void main(String[] args) {
        /*String[] arrayMultiplosResultado = arrayMultiplos();
        for (String valor : arrayMultiplosResultado) {
            System.out.println(valor);
        }*/

        Main main = new Main();

        main.invertCadena("Hola Mundo");

        List<String> listMultiplosResultado = listMultiplos();
        for (String valor : listMultiplosResultado) {
            System.out.println(valor);
        }
    }
}