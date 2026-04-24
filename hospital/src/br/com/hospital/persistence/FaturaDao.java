package br.com.hospital.persistence;
import br.com.hospital.conexao.ConnectionFactory;
import br.com.hospital.enums.StatusFatura;
import br.com.hospital.enums.TipoAtendimento;
import br.com.hospital.model.Faturamentos;
import br.com.hospital.model.TotalFaturamento;
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

    public TotalFaturamento getTotalFaturamento(Integer id){
        String sql = "SELECT a.id_atendimento, a.id_paciente, a.tipo, e.custo AS custo_exame, i.custo AS custo_internacao FROM atendimentos a JOIN exames e ON e.id_paciente = a.id_paciente JOIN internacoes i ON i.id_paciente = a.id_paciente WHERE a.id_paciente = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                Integer idAtendimento = result.getInt("id_atendimento");
                TipoAtendimento tipoAtendimento = TipoAtendimento.valueOf(result.getString("tipo"));
                double custoTipoAtedimento = tipoAtendimento.getCusto();
                Double custoExame = result.getDouble("custo_exame");
                Double custoInternacao = result.getDouble("custo_internacao");
                double custoTotal = custoTipoAtedimento + custoExame + custoInternacao;
                Integer idPaciente = result.getInt("id_paciente");

                return  new TotalFaturamento(idAtendimento, tipoAtendimento, custoTipoAtedimento, custoExame, custoInternacao, custoTotal, idPaciente);
            }
            result.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.err.println("Problemas ao retornar o custo por ID");
            e.printStackTrace();
        }
        return null;
    }

}
