package br.com.hospital.model;

public class Medico {
    private int id_medico;
    private String nome;
    private String especialidade;
    private String crm;

    public Medico(int id_medico, String nome, String especialidade, String crm) {
        this.id_medico = id_medico;
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }
    public Medico() {
    }

    @Override
    public String toString() {
        return "Medico [id_medico=" + id_medico + ", nome=" + nome + ", especialidade=" + especialidade + ", crm="
                + crm + "]";
    }
    
    public int getId_medico() {
        return id_medico;
    }
    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
}
