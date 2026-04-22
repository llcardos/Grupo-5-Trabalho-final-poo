package br.com.hospital.model;

import br.com.hospital.enums.CoberturaPlano;

public class Credenciamentos {
    private Integer idCredenciamento;
    private String nome;
    private String telefone;
    private CoberturaPlano cobertura;

    public Credenciamentos (Integer idCredenciamento, String nome, String telefone, CoberturaPlano cobertura) {
        this.idCredenciamento = idCredenciamento;
        this.nome = nome;
        this.telefone = telefone;
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Credenciamento [idCredenciamento=" + idCredenciamento + ", nome=" + nome + ", cobertura=" + cobertura + "]";
    }

    public Integer getId() {return idCredenciamento;}
    public void setId(Integer idCredenciamento) {this.idCredenciamento = idCredenciamento;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public CoberturaPlano getCobertura() {return cobertura;}
    public void setCobertura(CoberturaPlano cobertura) {this.cobertura = cobertura;}

}