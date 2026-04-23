package br.com.hospital.model;

public class Pacientes {
    private Integer idPaciente;
    private String nome;
    private String data_nascimento;
    private Integer idCredenciamento;
    private Integer idRisco;
    private Integer idMedico;

    public Pacientes() {
    }

    public Pacientes(String data_nascimento, Integer idCredenciamento, Integer idMedico, Integer idPaciente, Integer idRisco, String nome) {
        this.data_nascimento = data_nascimento;
        this.idCredenciamento = idCredenciamento;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.idRisco = idRisco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pacientes [idPaciente=" + idPaciente + ", nome=" + nome + ", data_nascimento=" + data_nascimento
                + ", idCredenciamento=" + idCredenciamento + ", idRisco=" + idRisco + ", idMedico=" + idMedico + "]";
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
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

    public Integer getIdCredenciamento() {
        return idCredenciamento;
    }

    public void setIdCredenciamento(Integer idCredenciamento) {
        this.idCredenciamento = idCredenciamento;
    }

    public Integer getIdRisco() {
        return idRisco;
    }

    public void setIdRisco(Integer idRisco) {
        this.idRisco = idRisco;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }
}
