package clases;

public class Circunferencia {
    protected double radio;

    public double perimetro(){
        Circunferencia x = new Circunferencia();
        return 2 * Math.PI *radio;
    }

    public void test(){
        try {
            Thread.sleep(1000); // lanza una excepción
        }catch (InterruptedException ex){
            //código para capturar excepción lanzada
        }
    }


}
