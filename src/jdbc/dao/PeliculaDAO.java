package jdbc.dao;

import jdbc.ConnectionManager;
import jdbc.dto.Pelicula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class PeliculaDAO {

    private Connection connection;

    public PeliculaDAO() throws SQLException {
        connection = ConnectionManager.obtenerConexion();
    }

    public List<Pelicula> obtenerPeliculaPorNombre(String nombre) throws SQLException {
        String sql = "select nombre, año, calificacion from pelicula where nombre=?";
        return obtenerResultados(sql, nombre);
    }

    public List<Pelicula> obtenerPeliculasPorActor(String nombreActor) throws SQLException {
        String sql = "select distinct nombre, año, calificacion " +
                "from personaje, pelicula " +
                "where año=p_año and nombre=p_nombre and a_nombre=?";
        return obtenerResultados(sql, nombreActor);
    }

    public List<Pelicula> obtenerPeliculaPorActorLike(String actorLike) throws SQLException {
        String sql = "select distinct nombre, año, calificacion " +
                "from personaje, pelicula " +
                "where año=p_año and nombre=p_nombre and a_nombre like ?";
        return obtenerResultados(sql, "%"+actorLike+"%");
    }

    public List<Pelicula> obtenerPeliculasPorPersonaje(String personaje) throws SQLException {
        String sql = "select distinct nombre, año, calificacion " +
                "from personaje, pelicula " +
                "where año=p_año and nombre=p_nombre and personaje=?";
        return obtenerResultados(sql, personaje);
    }

    private List<Pelicula> obtenerResultados(String sql, String parametro) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, parametro);
        ResultSet rs = ps.executeQuery();
        List<Pelicula> peliculas = new LinkedList<>();
        while (rs.next()){
            Pelicula p = new Pelicula(
                    rs.getString("nombre"),
                    rs.getInt("año"),
                    rs.getDouble("calificacion")
            );
            peliculas.add(p);
        }
        return peliculas;
    }

}
