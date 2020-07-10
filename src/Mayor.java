import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int x = in.nextInt();
        in.nextLine();
        System.out.println("Ingresa otro numero");
        int y = in.nextInt();
        if (x>y){
            System.out.println("El mayor es "+x);
        } else if (y>x){
            System.out.println("El mayor es "+y);
        } else {
            System.out.println("Son iguales");
        }
        double w = Double.parseDouble("9.5674");
        int i = Integer.parseInt(in.nextLine());
        double potencia = Math.pow(w,i);//w^i
    }

}
