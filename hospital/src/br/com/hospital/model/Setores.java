package br.com.hospital.model;

import br.com.hospital.enums.TipoSetor;

public class Setores {
    private int idSetor;
    private String nome;
    private String enfermeiroChefe;
    private TipoSetor tipoSetor;

    public Setores() {
    }

    public Setores(int idSetor, String nome, String enfermeiroChefe, TipoSetor tipoSetor) {
        this.idSetor = idSetor;
        this.nome = nome;
        this.enfermeiroChefe = enfermeiroChefe;
        this.tipoSetor = tipoSetor;
    }

    @Override
    public String toString() {
        return "Setores [idSetor=" + idSetor + ", nome=" + nome + ", enfermeiroChefe=" + enfermeiroChefe
                + ", tipoSetor=" + tipoSetor + "]";
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnfermeiroChefe() {
        return enfermeiroChefe;
    }

    public void setEnfermeiroChefe(String enfermeiroChefe) {
        this.enfermeiroChefe = enfermeiroChefe;
    }

    public TipoSetor getTipoSetor() {
        return tipoSetor;
    }

    public void setTipoSetor(TipoSetor tipoSetor) {
        this.tipoSetor = tipoSetor;
    }
}
