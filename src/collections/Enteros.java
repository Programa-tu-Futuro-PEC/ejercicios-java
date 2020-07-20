package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Enteros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(-2);
        numeros.add(39182452);
        System.out.println(numeros.size());
        numeros.add(3);
        numeros.add(0);
        System.out.println(numeros);
        numeros.add(20);
        System.out.println(numeros);
        numeros.add(0, 33);
        System.out.println(numeros);
        numeros.set(3, 5);
        System.out.println(numeros);
        numeros.remove(1);
        System.out.println(numeros);
        System.out.println(numeros.size());
        numeros.add(5);
        numeros.add(0);
        System.out.println(numeros);
        Set<Integer> noRepetidos = new HashSet<>();
        noRepetidos.addAll(numeros);
        System.out.println(noRepetidos);
        List<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("chao");
        palabras.add("perrito");
        palabras.add("Hola");
        System.out.println(palabras);
        String temp = palabras.get(0);
        palabras.set(0, palabras.get(3));
        palabras.set(3, temp);
        System.out.println(palabras);
    }
}
