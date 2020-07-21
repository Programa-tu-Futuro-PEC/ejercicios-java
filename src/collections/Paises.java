package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Paises {
    public static void main(String[] args) {

        Map<String, Pais> paises = new HashMap<>();
        paises.put("chile",
                new Pais("Chile",
                        "Santiago",
                        1700000));
        paises.put("argentina",
                new Pais("Argentina",
                        "Buenos Aires",
                        40000000));
        paises.put("peru",
                new Pais("Perú",
                        "Lima",
                        2500000));
        paises.put("perú",
                new Pais("Perú",
                        "Lima",
                        2500000));
        paises.put("bolivia",
                new Pais(
                    "Bolivia",
                        "Sucre",
                        2000000));
        paises.put("ecuador",
                new Pais(
                        "Ecuador",
                        "Quito",
                        12032408));
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un país de Sudamérica");
        String pais = in.nextLine();
        if (! paises.containsKey(pais.toLowerCase())){
            System.out.println("Pais no encontrado");
            return;
        }
        Pais p = paises.get(pais.toLowerCase());
        System.out.println(
                p.getNombre() + ": " +
                        "\n\tcapital: "+p.getCapital()+
                        "\n\tpoblación: "+p.getPoblacion()
        );
    }
}
