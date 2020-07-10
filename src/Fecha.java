import java.util.Scanner;

public class Fecha {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("dia:");
        int dia = in.nextInt();
        System.out.println("mes:");
        int mes = in.nextInt();
        System.out.println("año:");
        int anho = in.nextInt();
        System.out.println("mañana es "+ siguiente(dia,mes,anho));
    }

    static public String siguiente(int dia, int mes, int anho){
        int diaSgte = dia;
        int mesSgte = mes;
        int anhoSgte = anho;
        if (dia==31){
            diaSgte = 1;
            mesSgte +=1;
        } else if (dia == 30) {
            if (tiene30dias(mes)) {
                diaSgte = 1;
                mesSgte += 1;
            }
        } else if (dia==28 && mes ==2){
            diaSgte = 1;
            mesSgte = 3;
        } else {
            diaSgte += 1;
        }
        if (mesSgte>12){
            mesSgte = 1;
            anhoSgte += 1;
        }
    return diaSgte + "-" + mesSgte + "-" + anhoSgte;
    }

    private static boolean tiene30dias(int mes) {
        return mes==4 || mes==6 || mes==9 || mes==11;
    }

}
