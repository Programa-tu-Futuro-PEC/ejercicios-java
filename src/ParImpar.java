import java.util.Scanner;

public class ParImpar {
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int pares = 0;
        for (int i=0; i<10; i=i+1) {
            System.out.println("ingresa un numero");
            int x = in.nextInt();
            if(x%2==0){
                pares = pares +1;
            }
        }
        System.out.println("ingresaste "+pares+" numeros pares");
        System.out.println("ingresaste "+(10-pares)+" numeros impares");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pares = 0;
        int i = 0;
        while (i<10){
            System.out.println("ingresa un numero");
            int x = in.nextInt();
            if ((x%2)==1){
                pares++;
            }
            i++;
        }
        System.out.println("ingresaste "+pares+" numeros pares");
        System.out.println("ingresaste "+(10-pares)+" numeros impares");
    }
}
