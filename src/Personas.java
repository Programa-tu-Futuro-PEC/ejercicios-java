import java.util.Scanner;

public class Personas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String nombre1 = in.nextLine();
        System.out.println("Ingrese otro nombre");
        String nombre2 = in.nextLine();
        System.out.println("Ingrese un mes");
        String mes = in.nextLine();
        System.out.println(nombre1 + " y "+nombre2 + " se conocieron en "+mes);
    }

}
