import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String texto = in.nextLine();
        int largo = texto.length();
        if(largo>30){
            System.out.println("la palabra tiene más de 30 caracteres");
        }
        if (texto.equals("hola")){// texto == "hola
            System.out.println("hola!");
        }
    }

}
