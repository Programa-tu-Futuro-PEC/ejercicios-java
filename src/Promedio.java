import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //promedio = suma/cantidad
        double suma = 0.0;
        int n = 0;
        while(true){
            System.out.println("ingresa un numero");
            int x = in.nextInt();
            if (x==0){
                break;
            }
            suma = suma + x;
            n = n + 1;
        }
        System.out.println("el promedio es: "+(suma/n));
    }

}
