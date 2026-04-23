package br.com.hospital.model;

import br.com.hospital.enums.CoberturaPlano;

public class Credenciamento {
    private Integer id;
    private String nome;
    private String telefone;
    private CoberturaPlano cobertura; 
    private Integer id_Hospital;

    public Credenciamento(Integer id, String nome, String telefone, CoberturaPlano cobertura, Integer id_Hospital) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cobertura = cobertura;
        this.id_Hospital = id_Hospital;
    }

    @Override
    public String toString() {
        return "Credenciamento [id=" + id + ", nome=" + nome + ", telefone=" + telefone 
                + ", cobertura=" + cobertura + ", id_Hospital=" + id_Hospital + "]";
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public CoberturaPlano getCobertura() { return cobertura; }
    public void setCobertura(CoberturaPlano cobertura) { this.cobertura = cobertura; }

    public Integer getIdHospital() { return id_Hospital; }
    public void setIdHospital(Integer id_Hospital) { this.id_Hospital = id_Hospital; }
}