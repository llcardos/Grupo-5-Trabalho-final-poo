package br.com.hospital.model;

import br.com.hospital.enums.StatusLeito;

public class Leitos {
    private int idLeito;
    private StatusLeito statusLeito;
    private String id_setor;

    public Leitos(int idLeito, StatusLeito statusLeito, String id_setor) {
        this.idLeito = idLeito;
        this.statusLeito = statusLeito;
        this.id_setor = id_setor;
    }

    public Leitos() {
    }

    @Override
    public String toString() {
        return "Leitos [idLeito=" + idLeito + ", statusLeito=" + statusLeito + ", id_setor=" + id_setor + "]";
    }
    public int getIdLeito() {
        return idLeito;
    }
    public void setIdLeito(int idLeito) {
        this.idLeito = idLeito;
    }
    public String getId_setor() {
        return id_setor;
    }
    public void setId_setor(String id_setor) {
        this.id_setor = id_setor;
    }    
}