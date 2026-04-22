package br.com.hospital.model;

public class Pacientes {
    private int idPaciente;
    private String nome;
    private String data_nascimento;

    public Pacientes() {
    }

    public Pacientes(String data_nascimento, int idPaciente, String nome) {
        this.data_nascimento = data_nascimento;
        this.idPaciente = idPaciente;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pacientes [idPaciente=" + idPaciente + ", nome=" + nome + ", data_nascimento=" + data_nascimento
                + "]";
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
