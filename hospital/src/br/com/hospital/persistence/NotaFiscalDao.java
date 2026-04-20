package br.com.hospital.persistence;
import br.com.hospital.conexao.ConnectionFactory;
import java.sql.Connection;

public class NotaFiscalDao {
    private Connection connection;

    public NotaFiscalDao() {
        connection = new ConnectionFactory().getConnection();
    }
}
