package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BorrarMayor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese un numero");
            int n = in.nextInt();
            numeros.add(n);
        }
        while (!numeros.isEmpty()){
            int maximo = 0;
            System.out.println(numeros);
            for (int x : numeros) {
                if(x>maximo) maximo = x;
            }
            int posMax = numeros.indexOf(maximo);
            numeros.remove(posMax);
        }
        System.out.println(numeros);
    }
}
