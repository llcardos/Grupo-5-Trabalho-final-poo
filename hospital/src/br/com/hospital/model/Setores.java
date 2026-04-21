package br.com.hospital.model;

public class Setores {
    private int id_setor;
    private String nome;
    private String enfermeiro_chefe;
    private TipoSetor tipo_setor;

    public Setores() {
    }

    public Setores(int id_setor, String nome, String enfermeiro_chefe, TipoSetor tipo_setor) {
        this.id_setor = id_setor;
        this.nome = nome;
        this.enfermeiro_chefe = enfermeiro_chefe;
        this.tipo_setor = tipo_setor;
    }

    @Override
    public String toString() {
        return "Setores [id_setor=" + id_setor + ", nome=" + nome + ", enfermeiro_chefe=" + enfermeiro_chefe
                + ", tipo_setor=" + tipo_setor + "]";
    }

    public int getId_setor() {
        return id_setor;
    }

    public void setId_setor(int id_setor) {
        this.id_setor = id_setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnfermeiro_chefe() {
        return enfermeiro_chefe;
    }

    public void setEnfermeiro_chefe(String enfermeiro_chefe) {
        this.enfermeiro_chefe = enfermeiro_chefe;
    }

    public TipoSetor getTipo_setor() {
        return tipo_setor;
    }

    public void setTipo_setor(TipoSetor tipo_setor) {
        this.tipo_setor = tipo_setor;
    }
}
