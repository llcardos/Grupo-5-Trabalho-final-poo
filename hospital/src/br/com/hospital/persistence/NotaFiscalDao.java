package br.com.hospital.persistence;
import br.com.hospital.conexao.ConnectionFactory;
import br.com.hospital.model.Hospital;
import br.com.hospital.model.Pacientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}