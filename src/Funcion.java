import java.util.Scanner;

public class Funcion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int cuenta = 0;
        while (true) {
            System.out.println("Ingrese nota");
            double n = Double.parseDouble(sc.nextLine());
            if (esValida(n)) {
                suma += n;
                cuenta++;
            } else {
                break;
            }
        }
        System.out.println("el promedio es: " + (suma / cuenta));
    }

    private static boolean esValida(double n) {
        return (n >= 1 && n <= 7);
    }

}
