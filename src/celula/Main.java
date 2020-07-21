package celula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese numero");
        int n = in.nextInt();
        Celula c = new Celula(n);
        System.out.println("celula nueva: "+c.getADN());
        System.out.println("ingrese opción:");
        System.out.println("1 para ADN complementario");
        System.out.println("2 para ARN mensajero");
        System.out.println("3 para mitosis");
        int opcion = in.nextInt();
        if (opcion==1){
            System.out.println("ADN Complementario: "+c.adnComplentario());
        } else if(opcion == 2){
            System.out.println("ARN Mensajero: "+ c.arnMensajero());
        } else if (opcion == 3){
            Celula hija = c.mitosis();
            System.out.println("Celula hija: "+hija.getADN());
        } else {
            System.out.println("opción incorrecta");
        }
    }
}
