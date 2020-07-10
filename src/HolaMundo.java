import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = Integer.parseInt(in.nextLine());
        System.out.println("Ingrese su nombre");
        String nombre = in.nextLine();
        System.out.println("Tu nombre es "+ nombre +
                " y tienes "+ edad + " años");
    }
}