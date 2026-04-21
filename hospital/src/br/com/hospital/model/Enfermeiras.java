package br.com.hospital.model;

public class Enfermeiras {
    private Integer id_enfermeira;
    private String nome;
    private String turno;
    private String coren;

    
    public Enfermeiras() {
    }

    public Enfermeiras(Integer id_enfermeira, String nome, String turno, String coren) {
        this.id_enfermeira = id_enfermeira;
        this.nome = nome;
        this.turno = turno;
        this.coren = coren;
    }

    @Override
    public String toString() {
        return "Enfermeiras [id_enfermeira=" + id_enfermeira + ", nome=" + nome + ", turno=" + turno + ", coren=" + coren + "]";
    }

    public Integer getId() {
        return id_enfermeira;
    }

    public void setId(Integer id_enfermeira) {
        this.id_enfermeira = id_enfermeira;
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

    
    






















}
