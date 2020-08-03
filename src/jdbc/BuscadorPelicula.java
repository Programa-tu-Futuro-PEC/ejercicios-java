package jdbc;

import jdbc.dao.PeliculaDAO;
import jdbc.dto.Pelicula;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BuscadorPelicula {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre de pelicula");
        String nombre = sc.nextLine();
        List<Pelicula> resultados = new PeliculaDAO()
                .obtenerPeliculaPorNombre(nombre);
        for (Pelicula p : resultados) {
            System.out.println(p.getNombre() + " ("+p.getAnho()+"): "+p.getCalificacion());
        }
    }

}
