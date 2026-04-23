package br.com.hospital.model;

import br.com.hospital.enums.StatusLeito;

public class Leitos {
    private Integer idLeito;
    private String identifier;
    private StatusLeito statusLeito;
    private String idSetor;

    public Leitos(Integer idLeito, String identifier, StatusLeito statusLeito, String idSetor) {
        this.idLeito = idLeito;
        this.identifier = identifier;
        this.statusLeito = statusLeito;
        this.idSetor = idSetor;
    }

    public Leitos() {
    }

    @Override
    public String toString() {
        return "Leitos [idLeito=" + idLeito + ", identifier=" + identifier + ", statusLeito=" + statusLeito
                + ", idSetor=" + idSetor + "]";
    }

    public Integer getIdLeito() {
        return idLeito;
    }

    public void setIdLeito(Integer idLeito) {
        this.idLeito = idLeito;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public StatusLeito getStatusLeito() {
        return statusLeito;
    }

    public void setStatusLeito(StatusLeito statusLeito) {
        this.statusLeito = statusLeito;
    }

    public String getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(String idSetor) {
        this.idSetor = idSetor;
    }
}