package org.tdd;

public class InvertirCadena {

    public String invertCadena(String text) {
        if (text == null) return null;
        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            newText.append(array[i]);
        }

        return newText.toString();
    }
}
