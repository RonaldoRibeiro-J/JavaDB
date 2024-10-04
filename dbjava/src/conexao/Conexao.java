package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/db";
    private static final String user = "root";
    private static final String password = "kingbird2024@";

    private static Connection conn;

    public static Connection getConnection() {
        try {
            // Estabelecendo a conexão se estiver nula ou fechada
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, password);
            }
            return conn;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
