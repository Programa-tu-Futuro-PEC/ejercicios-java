package jdbc;

import jdbc.dao.ActorDAO;
import jdbc.dto.Actor;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el nombre de un actor");
        String nombre = sc.nextLine();
        ActorDAO dao = new ActorDAO();
        List<Actor> actores = dao.obtenerActorPorNombreLike("%"+nombre+"%");
        for (Actor a : actores) {
            System.out.println(a.getNombre()+", "+a.getGenero());
        }
    }
}
