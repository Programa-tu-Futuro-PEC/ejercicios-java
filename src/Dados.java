public class Dados {

    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <= 6; j++) {
                int suma = i + j;
                if (suma < 8){
                    System.out.println("dado 1: "+i);
                    System.out.println("dado 2: "+j);
                    System.out.println("suma: "+ suma);
                    System.out.println("*******");
                }
            }
        }
    }

}
