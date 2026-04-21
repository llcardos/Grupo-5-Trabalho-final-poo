package br.com.hospital.model;

public class Leitos {
    private int id_leito;
    private StatusLeito status_leito;
    private String id_setor;

    public Leitos(int id_leito, StatusLeito status_leito, String id_setor) {
        this.id_leito = id_leito;
        this.status_leito = status_leito;
        this.id_setor = id_setor;
    }

    public Leitos() {
    }

    @Override
    public String toString() {
        return "Leitos [id_leito=" + id_leito + ", status_leito=" + status_leito + ", id_setor=" + id_setor + "]";
    }
    public int getId_leito() {
        return id_leito;
    }
    public void setId_leito(int id_leito) {
        this.id_leito = id_leito;
    }
    public String getId_setor() {
        return id_setor;
    }
    public void setId_setor(String id_setor) {
        this.id_setor = id_setor;
    }    
}