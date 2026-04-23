package br.com.hospital.model;

import br.com.hospital.enums.TipoSetor;

public class Setores {
    private Integer idSetor;
    private String nome;
    private String enfermeiroChefe;
    private TipoSetor tipoSetor;
    private Integer idHopital;

    public Setores() {
    }

    public Setores(Integer idSetor, String nome, String enfermeiroChefe, TipoSetor tipoSetor, Integer idHopital) {
        this.idSetor = idSetor;
        this.nome = nome;
        this.enfermeiroChefe = enfermeiroChefe;
        this.tipoSetor = tipoSetor;
        this.idHopital = idHopital;
    }

    @Override
    public String toString() {
        return "Setores [idSetor=" + idSetor + ", nome=" + nome + ", enfermeiroChefe=" + enfermeiroChefe
                + ", tipoSetor=" + tipoSetor + ", idHopital=" + idHopital + "]";
    }

    public Integer getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Integer idSetor) {
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

    public Integer getIdHopital() {
        return idHopital;
    }

    public void setIdHopital(Integer idHopital) {
        this.idHopital = idHopital;
    }
}
