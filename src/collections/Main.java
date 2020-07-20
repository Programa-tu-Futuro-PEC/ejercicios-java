package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        while (true){
            System.out.println("ingrese palabra o STOP");
            String palabra = in.nextLine();
            if (palabra.equalsIgnoreCase("stop")){
                break;
            }
            palabras.add(palabra);
        }

        String palabraMasLarga = "";
        for (String p : palabras) {
            if (p.length()> palabraMasLarga.length()){
                palabraMasLarga = p;
            }
        }
        System.out.println(palabraMasLarga);
    }
}
