import java.util.Scanner;

public class Multiplicacion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int a = in.nextInt();
        in.nextLine();
        System.out.println("ingrese otro numero");
        int b = in.nextInt();
        in.nextLine();
        System.out.println("La multiplicacion es " + (a*b));
    }

}
