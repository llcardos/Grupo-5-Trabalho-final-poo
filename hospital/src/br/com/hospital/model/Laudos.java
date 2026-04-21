package br.com.hospital.model;

public class Laudos {
    private Integer id_laudo;
    private String nome;
    private String descricao;
    private String resultado;
    private String anexo;
    
    public Laudos() {
    }

    public Laudos(Integer id_laudo, String nome, String descricao, String resultado, String anexo) {
        this.id_laudo = id_laudo;
        this.nome = nome;
        this.descricao = descricao;
        this.resultado = resultado;
        this.anexo = anexo;
    }

    @Override
    public String toString() {
        return "Laudos [id_laudo=" + id_laudo + ", nome=" + nome + ", descricao=" + descricao + ", resultado=" + resultado
                + ", anexo=" + anexo + "]";
    }

    public Integer getId() {
        return id_laudo;
    }

    public void setId(Integer id_laudo) {
        this.id_laudo = id_laudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    
}
