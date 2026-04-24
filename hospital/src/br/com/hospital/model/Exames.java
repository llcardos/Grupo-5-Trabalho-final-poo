package br.com.hospital.model;

import br.com.hospital.enums.TipoLaboratorio;

public class Exames {
    private Integer idExame;
    private String nome;
    private String tipo;
    private double custo;
    private String descricao;
    private TipoLaboratorio tipoLaboratorio;
    private Integer idMedico;
    private Integer idPaciente;
    
    public Exames() {
    }

    public Exames(Integer idExame, String nome, String tipo, double custo, String descricao,
            TipoLaboratorio tipoLaboratorio, Integer idMedico, Integer idPaciente) {
        this.idExame = idExame;
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.descricao = descricao;
        this.tipoLaboratorio = tipoLaboratorio;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Exames [idExame=" + idExame + ", nome=" + nome + ", tipo=" + tipo + ", custo=" + custo
                + ", tipoLaboratorio=" + tipoLaboratorio + ", descricao=" + descricao + ", idMedico=" + idMedico
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

    public TipoLaboratorio getTipoLaboratorio() {
        return tipoLaboratorio;
    }

    public void setTipoLaboratorio(TipoLaboratorio tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
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
