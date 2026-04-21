package br.com.hospital.model;

public class Pacientes {
    private int id_paciente;
    private String nome;
    private String data_nascimento;

    public Pacientes() {
    }

    public Pacientes(String data_nascimento, int id_paciente, String nome) {
        this.data_nascimento = data_nascimento;
        this.id_paciente = id_paciente;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pacientes [id_paciente=" + id_paciente + ", nome=" + nome + ", data_nascimento=" + data_nascimento
                + "]";
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
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
