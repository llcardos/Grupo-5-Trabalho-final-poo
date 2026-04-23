package br.com.hospital.persistence;
import br.com.hospital.conexao.ConnectionFactory;
import br.com.hospital.model.Hospital;

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
}
