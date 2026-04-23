package br.com.hospital.model;

public class Exames {
    private Integer idExame;
    private String nome;
    private String tipo;
    private double custo;
    private String laboratorio;
    private String descricao;
    private Integer idMedico;
    private Integer idPaciente;
    
    public Exames() {
    }

    public Exames(Integer idExame, String nome, String tipo, double custo, String laboratorio, String descricao,
            Integer idMedico, Integer idPaciente) {
        this.idExame = idExame;
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.laboratorio = laboratorio;
        this.descricao = descricao;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Exames [idExame=" + idExame + ", nome=" + nome + ", tipo=" + tipo + ", custo=" + custo
                + ", laboratorio=" + laboratorio + ", descricao=" + descricao + ", idMedico=" + idMedico
                + ", idPaciente=" + idPaciente + "]";
    }

    public Integer getIdExame() {
        return idExame;
    }

    public void setIdExame(Integer idExame) {
        this.idExame = idExame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
