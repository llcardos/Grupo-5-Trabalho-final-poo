package br.com.hospital.persistence;
import br.com.hospital.conexao.ConnectionFactory;
import br.com.hospital.enums.StatusAtendimento;
import br.com.hospital.enums.TipoAtendimento;
import br.com.hospital.enums.TipoLaboratorio;
import br.com.hospital.model.Atendimento;
import br.com.hospital.model.Exames;
import br.com.hospital.model.Hospital;
import br.com.hospital.model.Pacientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalDao {
    private Connection connection;

    public NotaFiscalDao() {
        connection = new ConnectionFactory().getConnection();
    }

    public List<Hospital> listarHospital(){
        String sql = "select * from hospital";

        List<Hospital> hospitais = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while ((result.next())) {
                
                Hospital hospital = new Hospital(result.getInt("id_hospital"), result.getString("nome"), result.getString("cnpj"));
                hospitais.add(hospital);
            }
            result.close();
            stmt.close();
            connection.close();
            
        } catch (SQLException e) {
            System.err.println("Problemas ao buscar Hospital");
            e.printStackTrace();
        }
        return hospitais;
    }

    public Hospital listarHospitalById(int id){
        String sql = " select * from hospital where id_hospital = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                return new Hospital(result.getInt("id_hospital"), result.getString("nome"), result.getString("cnpj"));
            }
        } catch (SQLException e) {
            System.err.println("Problemas ao buscar hospital pelo id");
        }
        return null;
    }

    public List<Pacientes> listarPacientes(){
        String sql = "select * from pacientes";
        
        List<Pacientes> pacientes = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Pacientes paciente = new Pacientes(result.getInt("id_paciente"), result.getString("nome"), result.getString("data_nascimento"), result.getInt("id_credenciamento"), result.getInt("id_risco"), result.getInt("id_medico"));
                pacientes.add(paciente);
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Problemas ao listar pacientes");
            e.printStackTrace();
        }
        return pacientes;
    }
    
    public Pacientes listarPacientesById(int id){
        String sql = "select * from pacientes where id_paciente = ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                return new Pacientes(result.getInt("id_paciente"), result.getString("nome"), result.getString("data_nascimento"), result.getInt("id_credenciamento"), result.getInt("id_risco"), result.getInt("id_medico"));
            }
            
        } catch (SQLException e) {
            System.err.println("Problemas ao buscar paciente pelo id");
        }
        return null;
    }

    public List<Atendimento> listarAtendimento(){
        String sql = "Select * from atendimentos";

        List<Atendimento> atendimentos = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Atendimento atendimento = new Atendimento(result.getInt("id_atendimento"), result.getString("nome"), TipoAtendimento.valueOf(result.getString("tipo")), StatusAtendimento.valueOf(result.getString("status")), result.getString("observacao"), result.getObject("data",LocalDateTime.class), result.getInt("id_paciente"), result.getInt("id_medico"), result.getInt("id_enfermeiro"));
                atendimentos.add(atendimento);
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Problema ao listar os atendimentos");
            e.printStackTrace();
        }
        return atendimentos;
    }

    public Atendimento listarAtendimentoById (Integer id){
        String sql = "Select * from atendimentos where id_atendimento = ? ";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                return new Atendimento(result.getInt("id_atendimento"), result.getString("nome"), TipoAtendimento.valueOf(result.getString("tipo")), StatusAtendimento.valueOf(result.getString("status")), result.getString("observacao"), result.getObject("data",LocalDateTime.class), result.getInt("id_paciente"), result.getInt("id_medico"), result.getInt("id_enfermeiro"));
                                
            }
            result.close();
            stmt.close();
            connection.close();


        } catch (SQLException e) {
            System.err.println("Problema ao buscar atendimento por Id");
            e.printStackTrace();
        }
        return null;
    }

    public List<Exames> listareExames(){
        String sql = "SELECT * FROM EXAMES";

        List<Exames> exames = new ArrayList<>();
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Exames exame = new Exames(result.getInt("id_exame"), result.getString("nome"), result.getString("tipo"), result.getDouble("custo"), result.getString("descricao"), TipoLaboratorio.valueOf(result.getString("laboratorio")), result.getInt("id_medico"), result.getInt("id_paciente"));
                exames.add(exame);
            }
            result.close();
            stmt.close();
            connection.close();
        
        } catch (SQLException e) {
            System.err.println("Problema ao listar os exames");
            e.printStackTrace();
        }
        return exames;
    }
    
    public Exames listarExameById(Integer id){
        String sql = "select * from exames where id_exame = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                return new Exames(result.getInt("id_exame"), result.getString("nome"), result.getString("tipo"), result.getDouble("custo"), result.getString("descricao"), TipoLaboratorio.valueOf(result.getString("laboratorio")), result.getInt("id_medico"), result.getInt("id_paciente"));
                
            }
            result.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.err.println("Problema ao listar exame por ID");
            e.printStackTrace();
        }
        return null;
    }
}