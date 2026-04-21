package br.com.hospital.model;

import java.time.LocalDateTime;

public class Internacoes {

    private Integer id_internacao;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    private Integer id_leito;

    public Internacoes() {
    }

    public Internacoes(Integer id_internacao, LocalDateTime data_inicio, LocalDateTime data_fim, Integer id_leito) {
        this.id_internacao = id_internacao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.id_leito = id_leito;
    }

    @Override
    public String toString() {
        return "Internacoes [id_internacao=" + id_internacao +
            ", data_inicio=" + data_inicio +
            ", data_fim=" + data_fim +
            ", id_leito=" + id_leito + "]";
    }

    public Integer getId_internacao() {
        return id_internacao;
    }

    public void setId_internacao(Integer id_internacao) {
        this.id_internacao = id_internacao;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDateTime getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDateTime data_fim) {
        this.data_fim = data_fim;
    }

    public Integer getId_leito() {
        return id_leito;
    }

    public void setId_leito(Integer id_leito) {
        this.id_leito = id_leito;
    }

}