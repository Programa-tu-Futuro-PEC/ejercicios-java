import java.util.Scanner;

public class Anhos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingresa un año");
        int anho = in.nextInt();
        if(2020-anho>=15){
            System.out.println("Han pasado al menos 15 años");
        } else {
            System.out.println("no han pasado ni 15 años");
        }
    }

}
