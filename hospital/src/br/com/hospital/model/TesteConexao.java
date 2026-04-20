package br.com.hospital.model;
import br.com.hospital.conexao.ConnectionFactory;

public class TesteConexao {
        public static void main(String[] args) {
            ConnectionFactory factory = new ConnectionFactory();
            factory.getConnection();
        }
}