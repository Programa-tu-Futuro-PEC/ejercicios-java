package collections;

import java.util.ArrayList;
import java.util.List;

public class Enteros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(-2);
        numeros.add(39182452);
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
    }
}
