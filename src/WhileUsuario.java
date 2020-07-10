import java.util.Scanner;

public class WhileUsuario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("ingrese un numero");
            int x = in.nextInt();
            if(x==0){
                break;
            }
        }
        System.out.println("terminé");
    }
}
