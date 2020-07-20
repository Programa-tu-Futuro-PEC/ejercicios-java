package collections;

import java.util.ArrayList;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        List<Double> randoms = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            randoms.add(Math.random());
        }
        System.out.println(randoms);
        double temp = randoms.get(0);
        randoms.set(0, randoms.get(randoms.size()-1));
        randoms.set(randoms.size()-1, temp);
        System.out.println(randoms);
        double minimo = 1;
        double maximo = 0;
        for (double x : randoms){
            if(x>maximo) maximo = x;
            if(x<minimo) minimo = x;
        }
        int posMax = randoms.indexOf(maximo);
        int posMin = randoms.indexOf(minimo);
        randoms.set(posMax, minimo);
        randoms.set(posMin, maximo);
        System.out.println(randoms);
    }
}
