import java.util.Scanner;

public class Auto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el precio del auto");
        int precio = in.nextInt();
        in.nextLine();
        System.out.println("Ingresa el año de fabricacion");
        int anho = in.nextInt();
        in.nextLine();
        int diferencia = 2020 - anho;
        //primer año 90%
        //90%-10%90% = 90%-9% = 81%
        //81% - 10%81% = 81%-8.1% = 72.9%
        //72.9% - 10%72.9% = 72.9% - 7.29% = 65.61%
        double devaluacion = Math.pow(0.9, diferencia);
        System.out.println(precio*devaluacion);
    }

}
