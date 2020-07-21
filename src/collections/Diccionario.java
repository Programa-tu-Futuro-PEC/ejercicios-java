package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        Map<String, String> zahlen = new HashMap<>();
        zahlen.put("uno", "ein");
        zahlen.put("dos", "zwei");
        zahlen.put("tres", "drei");
        zahlen.put("cuatro", "vier");
        zahlen.put("cinco", "fünf");

        Map<Integer, String> numeros = new HashMap<>();
        numeros.put(1, "uno");
        numeros.put(2, "dos");
        numeros.put(3, "tres");
        numeros.put(4, "cuatro");
        numeros.put(5, "cinco");

        Scanner in = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int x = in.nextInt();
        System.out.println("ingresó el "+numeros.getOrDefault(x, "no soportado"));
        System.out.println("en aleman: "+zahlen.getOrDefault(numeros.getOrDefault(x, "error"), "kaputt"));
    }
}
