package animales;

import java.util.Objects;

public class Animal {

    protected double altura;
    protected double peso;

    @Override
    public int hashCode() {
        return Objects.hash(altura, peso);
    }

    public String comer(){return "om nom";}
    public void dormir(){}
    public Animal reproducirse(Animal a){
        return new Animal();
    }

}
