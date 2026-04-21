package br.com.hospital.model;

public class Riscos {
    private int id_risco;
    private String nome;
    private CorRisco cor_risco;

    public Riscos() {
    }
    
    public Riscos(int id_risco, String nome, CorRisco cor_risco) {
        this.id_risco = id_risco;
        this.nome = nome;
        this.cor_risco = cor_risco;
    }

    @Override
    public String toString() {
        return "Riscos [id_risco=" + id_risco + ", nome=" + nome + ", cor_risco=" + cor_risco + "]";
    }

    public int getId_risco() {
        return id_risco;
    }

    public void setId_risco(int id_risco) {
        this.id_risco = id_risco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CorRisco getCor_risco() {
        return cor_risco;
    }

    public void setCor_risco(CorRisco cor_risco) {
        this.cor_risco = cor_risco;
    }
}
