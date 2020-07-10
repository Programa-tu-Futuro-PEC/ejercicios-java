import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese un texto");
        String s = in.nextLine();
        if (esPalindromo(s)){
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }

    static public boolean esPalindromo(String s){
        if (s.length()<=1){
            return true;
        }
        if (s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }
        return esPalindromo(s.substring(1,s.length()-1));
    }

}
