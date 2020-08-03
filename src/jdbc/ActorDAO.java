package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ActorDAO {
    private Connection connection;

    public ActorDAO() throws SQLException {
        this.connection = ConnectionManager.obtenerConexion();
    }

    public Actor obtenerActorPorNombre(String nombre) throws SQLException {
        String sql = "select nombre, genero from actor where nombre=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            Actor a = new Actor(rs.getString("nombre"), rs.getString("genero"));
            return a;
        }
        return new Actor("", " ");
    }


    public List<Actor> obtenerActorPorNombreLike(String nombre) throws SQLException {
        String sql = "select nombre, genero from actor where nombre like ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nombre);
        List<Actor> resultado = new LinkedList<>();
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Actor a = new Actor(rs.getString("nombre"), rs.getString("genero"));
            resultado.add(a);
        }
        return resultado;
    }

    public void insertarActor(String nombre, char genero) throws SQLException {
        String sql = "insert into actor(nombre, genero) values ?, ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setString(2, ""+genero);
        ps.executeUpdate();
    }

}
