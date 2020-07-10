import java.util.Scanner;

public class MinMax {

    /**
     * Pide una lista de numeros al usuario
     * Retorna el mayor y el menor ingresado
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maximo = 0;
        int minimo = 999999999;
        while (true){
            System.out.println("ingrese número o 0 para terminar");
            int x = in.nextInt();
            if (x==0)
                break;
            if (x>maximo) {
                maximo = x;
            }
            if (x<minimo) 
                minimo = x;
        }
        System.out.println("menor: "+minimo);
        System.out.println("mayor: "+maximo);
    }

}
