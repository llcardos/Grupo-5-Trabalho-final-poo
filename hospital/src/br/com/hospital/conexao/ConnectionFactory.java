package br.com.hospital.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionFactory {
    private final String url;
    private final String user;
    private final String pw;

    private Connection connection;

    public ConnectionFactory() {
        Dotenv dotenv = Dotenv.load();

        this.url  = dotenv.get("DB_URL");
        this.user = dotenv.get("DB_USER");
        this.pw   = dotenv.get("DB_PASSWORD");
    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, pw);
            if (connection != null) {
                System.out.println("Conectado com sucesso!");
                return connection;
            } else {
                System.out.println("Não foi possível conectar!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}