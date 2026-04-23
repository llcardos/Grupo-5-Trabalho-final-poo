package br.com.hospital.persistence;
import br.com.hospital.conexao.ConnectionFactory;
import br.com.hospital.enums.StatusFatura;
import br.com.hospital.model.Faturamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FaturaDao {
        private Connection connection;

    public FaturaDao() {
        connection = new ConnectionFactory().getConnection();
    }

    public List<Faturamentos> listar() {
        String sql = "select * from faturamentos";

        List<Faturamentos> faturamentos = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Faturamentos faturamento = new Faturamentos(result.getInt("id_faturamento"), result.getDate("data_emissao"), result.getDate("data_vencimento"), result.getInt("id_atendimento"), StatusFatura.valueOf(result.getString("cobranca")));
                faturamentos.add(faturamento);
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Problemas ao listar os faturamentos");
            e.printStackTrace();
        }
        return faturamentos;
    }
}
