package animales;

public class Animal {

    protected double altura;
    protected double peso;

    public String comer(){return "om nom";}
    public void dormir(){}
    public Animal reproducirse(Animal a){
        return new Animal();
    }

}
