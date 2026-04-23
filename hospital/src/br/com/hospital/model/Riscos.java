package br.com.hospital.model;

import br.com.hospital.enums.CorRisco;

public class Riscos {
    private Integer idRisco;
    private String nome;

    public Riscos() {
    }
    
    public Riscos(Integer idRisco, String nome, CorRisco corRisco) {
        this.idRisco = idRisco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Riscos [idRisco=" + idRisco + ", nome=" + nome + "]";
    }

    public Integer getIdRisco() {
        return idRisco;
    }

    public void setIdRisco(Integer idRisco) {
        this.idRisco = idRisco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
