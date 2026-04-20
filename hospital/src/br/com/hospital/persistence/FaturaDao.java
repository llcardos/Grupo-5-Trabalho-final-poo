package br.com.hospital.persistence;
import br.com.hospital.conexao.ConnectionFactory;
import java.sql.Connection;

public class FaturaDao {
        private Connection connection;

    public FaturaDao() {
        connection = new ConnectionFactory().getConnection();
    }
}
