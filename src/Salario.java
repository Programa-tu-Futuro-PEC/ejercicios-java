import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = in.nextLine();
        System.out.println("Ingresa tu salario mensual");
        int salario = in.nextInt();
        in.nextLine();
        int salarioAnual = salario * 12;
        System.out.println(nombre+" gana "+salarioAnual+" al año");
        System.out.println(nombre+" gana "+salarioAnual*5+" cada 5 años");
        System.out.println(nombre+" gana "+salarioAnual*10+" cada 10 años");
    }

}
