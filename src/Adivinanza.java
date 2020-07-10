import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args) {
        System.out.println("Seleccionando un numero al azar...");
        int x = new Random().nextInt(200);
        int i=0;
        Scanner in = new Scanner(System.in);
        while (i<5){
            System.out.println("Adivina el número secreto:");
            int y = in.nextInt();
            if (x == y){
                System.out.println("Felicidades, ¡ganaste!");
                break;
            } else if(y > x){
                System.out.println("El numero secreto es mas pequeño");
            } else {
                System.out.println("El numero secreto es más grande");
            }
            i++;
        }
        System.out.println("Numero secreto: "+x);
    }

}
