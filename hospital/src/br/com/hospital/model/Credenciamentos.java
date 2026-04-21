package br.com.hospital.model;

public class Credenciamentos {
    private Integer id_credenciamento;
    private String nome;
    private String telefone;
    private CoberturaPlano cobertura;

    public Credenciamentos (Integer id_credenciamento, String nome, String telefone, CoberturaPlano cobertura) {
        this.id_credenciamento = id_credenciamento;
        this.nome = nome;
        this.telefone = telefone;
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Credenciamento [id_credenciamento=" + id_credenciamento + ", nome=" + nome + ", cobertura=" + cobertura + "]";
    }

    public Integer getId() {return id_credenciamento;}
    public void setId(Integer id_credenciamento) {this.id_credenciamento = id_credenciamento;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public CoberturaPlano getCobertura() {return cobertura;}
    public void setCobertura(CoberturaPlano cobertura) {this.cobertura = cobertura;}

}