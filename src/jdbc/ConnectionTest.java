package jdbc;

import java.sql.*;
import java.util.Scanner;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433; databasename=cine; " +
                        "integratedSecurity=true"
        );

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una pelicula");
        String pelicula = sc.nextLine();
        String consulta = "SELECT TOP 3 * FROM pelicula " +
                "WHERE nombre Like ? ORDER BY calificacion DESC";
        PreparedStatement ps = conn.prepareStatement(consulta);
        ps.setString(1, pelicula);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getString("nombre")+": ");
            System.out.println(rs.getDouble("calificacion"));
        }
    }
}
