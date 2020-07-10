import java.util.Scanner;

public class Comparador {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int x = in.nextInt();
        if (x > 0){
            if(x==5){
                System.out.println("ganaste!!");
            } else if (x==9){
                System.out.println("perdiste");
            } else {
                System.out.println("el valor es mayor a cero");
            }
        } else if (x==0){
                System.out.println("el valor es igual a cero");
        } else {
            System.out.println("el valor es menor a cero");
        }
        System.out.println("fin");
    }
}
