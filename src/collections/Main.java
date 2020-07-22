package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1); numeros.add(2); numeros.add(3);
        numeros.add(4); numeros.add(5);
        System.out.println(numeros);
        System.out.println(invertirLista(numeros));
        Map<String, String> nombres = new HashMap<>();
        nombres.put("juan", "perez");
        nombres.put("ana", "gonzalez");
        nombres.put("roberto", "carlos");
        System.out.println(nombres);
        System.out.println(invertirMapa(nombres));
    }

    static List<Integer> invertirLista(List<Integer> lista){
        List<Integer> resultado = new ArrayList<>();
        for (int i = lista.size()-1; i >= 0; i--) {
            resultado.add(lista.get(i));
        }
        return resultado;
    }

    static Map<String, String> invertirMapa(Map<String, String> dicc){
        Map<String, String> resultado = new HashMap<>();
        for (String llave : dicc.keySet()) {
            resultado.put(dicc.get(llave), llave);
        }
        return resultado;
    }

}
