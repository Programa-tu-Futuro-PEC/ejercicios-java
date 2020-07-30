package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433; databasename=cine; " +
                        "integratedSecurity=true"
        );
    }
}
