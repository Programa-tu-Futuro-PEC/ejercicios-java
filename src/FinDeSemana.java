import java.util.Scanner;

public class FinDeSemana {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana");
        String dia = in.nextLine().toLowerCase();//toUpperCase
        if (dia.equalsIgnoreCase("sabado") || dia.equals("domingo")){
            System.out.println("Es fin de semana!!!!!!!");
        } else {
            System.out.println("no es fin de semana u.u");
        }
    }

}
