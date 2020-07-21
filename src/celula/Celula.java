package celula;

import java.util.Random;

public class Celula {

    private String ADN;

    public Celula(int n){
        String bases = "ACGT";
        this.ADN = "";
        for (int i = 0; i < n; i++) {
            this.ADN += bases.charAt(
                    new Random().nextInt(bases.length())
            );
        }
    }

    public Celula(String adn) {
        this.ADN = adn;
    }

    public String adnComplentario(){
        String complemento = "";
        for (int i = 0; i < ADN.length(); i++) {
            char c = ADN.charAt(i);
            if (c == 'A'){
                complemento += "T";
            } else if (c == 'T'){
                complemento += "A";
            } else if (c == 'C'){
                complemento += "G";
            } else {
                complemento += "C";
            }
        }
        return complemento;
    }

    public String arnMensajero(){
        String mensajero = "";
        for (int i = 0; i < ADN.length(); i++) {
            char c = ADN.charAt(i);
            if (c == 'A'){
                mensajero += "U";
            } else if (c == 'T'){
                mensajero += "A";
            } else if (c == 'C'){
                mensajero += "G";
            } else {
                mensajero += "C";
            }
        }
        return mensajero;
    }

    public Celula mitosis(){
        if (Math.random()<0.1){
            int x = new Random().nextInt(ADN.length());
            char base = "ACGT".charAt(new Random().nextInt(4));
            String ADNhijo = ADN.substring(0,x) + base + ADN.substring(x+1);
            return new Celula(ADNhijo);
        }
        return new Celula(ADN);
    }

    public String getADN() {
        return ADN;
    }
}
