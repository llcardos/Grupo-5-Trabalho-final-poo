package br.com.hospital.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private final String url;
    private final String user;
    private final String pw;

    private Connection connection;

    public ConnectionFactory() {
        String envUrl  = System.getenv("DB_URL");
        String envUser = System.getenv("DB_USER");
        String envPw   = System.getenv("DB_PASSWORD");

        this.url  = envUrl;
        this.user = envUser;
        this.pw   = envPw;
    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, pw);
            if (connection != null) {
                // System.out.println("Conectado com sucesso!");
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