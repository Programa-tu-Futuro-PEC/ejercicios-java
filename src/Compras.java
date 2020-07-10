import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("comprador "+i);
            while (true){
                System.out.println("ingresa valor de compra:");
                int monto =  sc.nextInt();
                if (monto==0) break;
                suma += monto;
                contador++;
            }
        }
        System.out.println("promedio total compras: "+(double) suma/contador);
    }
}
