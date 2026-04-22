package br.com.hospital.model;

import br.com.hospital.enums.CorRisco;

public class Riscos {
    private int idRisco;
    private String nome;
    private CorRisco corRisco;

    public Riscos() {
    }
    
    public Riscos(int idRisco, String nome, CorRisco corRisco) {
        this.idRisco = idRisco;
        this.nome = nome;
        this.corRisco = corRisco;
    }

    @Override
    public String toString() {
        return "Riscos [idRisco=" + idRisco + ", nome=" + nome + ", corRisco=" + corRisco + "]";
    }

    public int getIdRisco() {
        return idRisco;
    }

    public void setIdRisco(int idRisco) {
        this.idRisco = idRisco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CorRisco getCorRisco() {
        return corRisco;
    }

    public void setCorRisco(CorRisco corRisco) {
        this.corRisco = corRisco;
    }
}
