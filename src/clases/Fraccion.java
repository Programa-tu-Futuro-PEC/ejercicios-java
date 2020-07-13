package clases;

public class Fraccion {

    int numerador;
    int denominador;

    Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    boolean esMenorQue(Fraccion f){
        return this.numerador * f.denominador < this.denominador * f.numerador;
    }

    String imprimir(){
        return this.numerador + "/" + this.denominador;
    }

    Fraccion suma(Fraccion f){
        int numerador = this.numerador*f.denominador + this.denominador * f.numerador;
        int denominador = this.denominador * f.denominador;
        return new Fraccion(numerador, denominador);
    }

    Fraccion resta(Fraccion f){
        int numerador = this.numerador*f.denominador - this.denominador * f.numerador;
        int denominador = this.denominador * f.denominador;
        return new Fraccion(numerador, denominador);
    }

    Fraccion producto(Fraccion f){
        int numerador = this.numerador*f.numerador;
        int denominador = this.denominador * f.denominador;
        return new Fraccion(numerador, denominador);
    }

    Fraccion division(Fraccion f){
        int numerador = this.numerador*f.denominador;
        int denominador = this.denominador * f.numerador;
        return new Fraccion(numerador, denominador);
    }
}
