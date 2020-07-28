package collections;

import java.util.HashMap;
import java.util.Map;

public class BorrarMayorDiccionario {
    public static void main(String[] args) {
        Map<String, Double> test = new HashMap<>();
        test.put("A", 23.5);
        test.put("B", -45.3);
        test.put("C", -1242487.0);
        System.out.println(test);
        System.out.println(eliminarMayor(test));
    }

    static Map<String, Double> eliminarMayor(Map<String, Double> dicc){
        double maximo = Double.MIN_VALUE;//-1000000000000
        for (double v: dicc.values()) {
            if (v>maximo){
                maximo = v;
            }
        }
        String llaveMax = null;
        for (String llave : dicc.keySet()) {
            if (dicc.get(llave) == maximo){
                llaveMax = llave;
                break;
            }
        }
        dicc.remove(llaveMax);
        return dicc;
    }
}
