import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int n = sc.nextInt();
        System.out.println("El factorial de "+n+" es:" + factorial2(n));
    }

    //n!= n*n-1*n-2*....*3*2*1
    private static int factorial(int n) {
        if(n<=1) return 1;
        return n * factorial(n-1);
    }

    private static int factorial2(int n){
        int factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
