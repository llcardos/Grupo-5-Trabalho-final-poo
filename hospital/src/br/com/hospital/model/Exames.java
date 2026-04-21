package br.com.hospital.model;

public class Exames {
    private Integer id_exame;
    private String nome;
    private String tipo;
    private double custo;
    private String laboratorio;
    private String descricao;
    
    public Exames() {
    }

    public Exames(Integer id_exame, String nome, String tipo, double custo, String laboratorio, String descricao) {
        this.id_exame = id_exame;
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.laboratorio = laboratorio;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Exames [id_exame=" + id_exame + ", nome=" + nome + ", tipo=" + tipo + ", custo=" + custo + ", laboratorio="
                + laboratorio + ", descricao=" + descricao + "]";
    }

    public Integer getId() {
        return id_exame;
    }

    public void setId(Integer id_exame) {
        this.id_exame = id_exame;
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

    
    
    

















    
}
