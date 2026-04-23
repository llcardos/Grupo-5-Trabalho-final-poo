package br.com.hospital.model;

public class Enfermeiras {
    private Integer idEnfermeira;
    private String nome;
    private String turno;
    private String coren;
    private Integer idSetor;
    
    public Enfermeiras() {
    }

    public Enfermeiras(Integer idEnfermeira, String nome, String turno, String coren, Integer idSetor) {
        this.idEnfermeira = idEnfermeira;
        this.nome = nome;
        this.turno = turno;
        this.coren = coren;
        this.idSetor = idSetor;
    }

    @Override
    public String toString() {
        return "Enfermeiras [idEnfermeira=" + idEnfermeira + ", nome=" + nome + ", turno=" + turno + ", coren=" + coren
                + ", idSetor=" + idSetor + "]";
    }

    public Integer getIdEnfermeira() {
        return idEnfermeira;
    }

    public void setIdEnfermeira(Integer idEnfermeira) {
        this.idEnfermeira = idEnfermeira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public Integer getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Integer idSetor) {
        this.idSetor = idSetor;
    }
}
