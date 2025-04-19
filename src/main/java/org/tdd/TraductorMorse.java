package org.tdd;

import java.util.HashMap;
import java.util.Map;

public class TraductorMorse {
    private static final Map<Character, String> textoMorse = new HashMap<>();
    private static final Map<String, Character> morseTexto = new HashMap<>();

    static {
        String[][] diccionario = {
                {"A", ".-"},   {"B", "-..."}, {"C", "-.-."}, {"D", "-.."},  {"E", "."},
                {"F", "..-."}, {"G", "--."},  {"H", "...."}, {"I", ".."},   {"J", ".---"},
                {"K", "-.-"},  {"L", ".-.."}, {"M", "--"},   {"N", "-."},   {"O", "---"},
                {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."},  {"S", "..."},  {"T", "-"},
                {"U", "..-"},  {"V", "...-"}, {"W", ".--"},  {"X", "-..-"}, {"Y", "-.--"},
                {"Z", "--.."}, {"0", "-----"},{"1", ".----"},{"2", "..---"},{"3", "...--"},
                {"4", "....-"},{"5", "....."},{"6", "-...."},{"7", "--..."},{"8", "---.."},
                {"9", "----."}
        };
        for (String[] conbinacion : diccionario) {
            textoMorse.put(conbinacion[0].charAt(0), conbinacion[1]);
            morseTexto.put(conbinacion[1], conbinacion[0].charAt(0));
        }
    }

    public static String traducir(String input) {
        input = input.trim();
        if (input.matches("[.\\- ]+")) {
            return morseATexto(input);
        } else {
            return textoAMorse(input);
        }
    }

    private static String morseATexto(String morse) {
        StringBuilder resultado = new StringBuilder();

        for (String palabra : morse.trim().split(" {2}")) {
            for (String simbolo : palabra.split(" ")) {
                Character letra = morseTexto.get(simbolo);
                if (letra != null) {
                    resultado.append(letra);
                }
            }
            resultado.append(" ");
        }

        return resultado.toString().trim();
    }

    private static String textoAMorse(String texto) {
        StringBuilder resultado = new StringBuilder();
        texto = texto.toUpperCase();

        for (String palabra : texto.split(" ")) {
            for (char letra : palabra.toCharArray()) {
                String morse = textoMorse.get(letra);
                if (morse != null) {
                    resultado.append(morse).append(" ");
                }
            }
            resultado.append("  ");
        }

        return resultado.toString().trim();
    }


}
