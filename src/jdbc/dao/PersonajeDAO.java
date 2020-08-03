package jdbc.dao;

import jdbc.ConnectionManager;
import jdbc.dto.Personaje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class PersonajeDAO {

    private Connection connection;

    public PersonajeDAO() throws SQLException {
        connection = ConnectionManager.obtenerConexion();
    }

    public List<Personaje> obtenerPersonajePorNombrePersonaje(String personaje) throws SQLException {
        String sql = "select p_nombre, p_anho, a_nombre, personaje " +
                "from personaje where personaje = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, personaje);
        ResultSet rs = ps.executeQuery();
        List<Personaje> resultado = new LinkedList<>();
        while (rs.next()){
            Personaje pj = new Personaje(
                    rs.getString("a_nombre"),
                    rs.getString("p_nombre"),
                    rs.getInt("p_anho"),
                    rs.getString("personaje")
            );
            resultado.add(pj);
        }
        return resultado;
    }
}
