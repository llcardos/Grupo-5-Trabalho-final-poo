package br.com.hospital.model;

public class NotasFiscais {
    private Integer idNotaFical;
    private String nomeEmissor;
    private String descricao;
    private Integer idFaturamento;

    public NotasFiscais(String descricao, Integer idFaturamento, Integer idNotaFical, String nomeEmissor) {
        this.descricao = descricao;
        this.idFaturamento = idFaturamento;
        this.idNotaFical = idNotaFical;
        this.nomeEmissor = nomeEmissor;
    }

    @Override
    public String toString() {
        return "NotasFiscais [idNotaFical=" + idNotaFical + ", nomeEmissor=" + nomeEmissor + ", descricao=" + descricao
                + ", idFaturamento=" + idFaturamento + "]";
    }

    public Integer getIdNotaFical() {
        return idNotaFical;
    }

    public void setIdNotaFical(Integer idNotaFical) {
        this.idNotaFical = idNotaFical;
    }

    public String getNomeEmissor() {
        return nomeEmissor;
    }

    public void setNomeEmissor(String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdFaturamento() {
        return idFaturamento;
    }

    public void setIdFaturamento(Integer idFaturamento) {
        this.idFaturamento = idFaturamento;
    }
}
