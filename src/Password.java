import java.util.Random;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password="";
        String alfanumerico = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        System.out.println("ingrese el largo deseado");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            password += alfanumerico.charAt(new Random().nextInt(alfanumerico.length()));
        }
        System.out.println("su contraseña es: "+password);
    }

}
