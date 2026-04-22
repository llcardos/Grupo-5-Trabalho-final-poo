package br.com.hospital.model;

public class Medico {
    private int idMedico;
    private String nome;
    private String especialidade;
    private String crm;

    public Medico(int idMedico, String nome, String especialidade, String crm) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }
    public Medico() {
    }

    @Override
    public String toString() {
        return "Medico [idMedico=" + idMedico + ", nome=" + nome + ", especialidade=" + especialidade + ", crm="
                + crm + "]";
    }
    
    public int getIdMedico() {
        return idMedico;
    }
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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
