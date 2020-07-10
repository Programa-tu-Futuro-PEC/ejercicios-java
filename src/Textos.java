import java.util.Scanner;

public class Textos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese texto");
        String texto1 = in.nextLine();
        System.out.println("Ingrese otro texto");
        String texto2 = in.nextLine();
        if (texto1.length()>texto2.length()){
            System.out.println("El texto con mayor cantidad de caracteres es: "+texto1);
        } else if (texto1.length()<texto2.length()){
            System.out.println("El texto con mayor cantidad de caracteres es: "+texto2);
        } else {
            System.out.println("Ambos textos tienen el mismo largo");
        }
    }

}
