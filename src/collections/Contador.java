package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Map<Integer, Integer> contador = new HashMap<>();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("ingrese numero entre 1 y 10. -1 para salir");
            int x = in.nextInt();
            if (x==-1) break;
            if (x<1 || x > 10){
                System.out.println("número inválido");
                continue;
            }
            if (contador.containsKey(x)){
                contador.put(x, contador.get(x)+1);
            } else {
                contador.put(x, 1);
            }
        }
        for (int x=1; x <= 10; x++) {
            System.out.println(
                    x+": "+contador.getOrDefault(x, 0)
            );
        }
    }
}
