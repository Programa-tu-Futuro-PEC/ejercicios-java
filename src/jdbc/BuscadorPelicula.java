package jdbc;

import jdbc.dao.PeliculaDAO;
import jdbc.dto.Pelicula;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BuscadorPelicula {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una opción");
        System.out.println("1 para buscar por nombre");
        System.out.println("2 para buscar por actor");
        System.out.println("3 para buscar por personaje");
        int opcion = sc.nextInt();
        sc.nextLine();
        List<Pelicula> resultados = new LinkedList<>();
        if(opcion == 1) {
            System.out.println("Ingrese nombre de pelicula");
            String nombre = sc.nextLine();
             resultados = new PeliculaDAO()
                    .obtenerPeliculaPorNombre(nombre);
        } else if (opcion == 2){
            System.out.println("Ingrese nombre del actor");
            String nombreActor = sc.nextLine();
            resultados = new PeliculaDAO()
                    .obtenerPeliculasPorActor(nombreActor);
        } else if (opcion == 3){
            System.out.println("Ingrese nombre de personaje");
            String personaje = sc.nextLine();
            resultados = new PeliculaDAO()
                    .obtenerPeliculasPorPersonaje(personaje);
        } else {
            System.out.println("Opción inválida");
            return;
        }
        for (Pelicula p : resultados) {
            System.out.println(p.getNombre() + " ("+p.getAnho()+"): "+p.getCalificacion());
        }
    }
}
