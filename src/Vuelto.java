import java.util.Scanner;

public class Vuelto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese monto a pagar:");
        int total = in.nextInt();
        System.out.println("ingrese monto pagado:");
        int pagado = in.nextInt();
        System.out.println("su vuelto es :");
        System.out.println(vuelto(total, pagado));
    }

    static String vuelto(int total, int pagado){
        int cambio = pagado - total;
        int veinte=0, diez=0, cinco=0, dos=0 , uno=0;
        while (true){
            if(cambio-20000>=0){
                cambio -= 20000;
                veinte++;
            } else if (cambio-10000>=0){
                cambio -= 10000;
                diez++;
            } else if (cambio-5000>=0){
                cambio -= 5000;
                cinco++;
            } else if (cambio-2000>=0){
                cambio -= 2000;
                dos++;
            } else if (cambio-1000>=0){
                cambio -= 1000;
                uno++;
            } else {
                break;
            }
        }
        return veinte+" de 20.000\n"+
                diez+" de 10.000\n"+
                cinco+" de 5.000\n"+
                dos+" de 2.000\n"+
                uno+" de 1.000";
    }

}
