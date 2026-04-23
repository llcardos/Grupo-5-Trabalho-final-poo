package br.com.hospital.model;

public class Laudos {
    private Integer idLaudo;
    private String nome;
    private String descricao;
    private String resultado;
    private String anexo;
    private Integer idExame;
    
    public Laudos() {
    }

    public Laudos(Integer idLaudo, String nome, String descricao, String resultado, String anexo, Integer idExame) {
        this.idLaudo = idLaudo;
        this.nome = nome;
        this.descricao = descricao;
        this.resultado = resultado;
        this.anexo = anexo;
        this.idExame = idExame;
    }

    @Override
    public String toString() {
        return "Laudos [idLaudo=" + idLaudo + ", nome=" + nome + ", descricao=" + descricao + ", resultado=" + resultado
                + ", anexo=" + anexo + ", idExame=" + idExame + "]";
    }

    public Integer getIdLaudo() {
        return idLaudo;
    }

    public void setIdLaudo(Integer idLaudo) {
        this.idLaudo = idLaudo;
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

    public Integer getIdExame() {
        return idExame;
    }

    public void setIdExame(Integer idExame) {
        this.idExame = idExame;
    }
}
