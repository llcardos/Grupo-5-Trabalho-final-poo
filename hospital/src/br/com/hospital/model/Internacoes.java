package br.com.hospital.model;

import java.time.LocalDateTime;

public class Internacoes {

    private Integer idInternacao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Integer idLeito;

    public Internacoes() {
    }

    public Internacoes(Integer idInternacao, LocalDateTime dataInicio,
        LocalDateTime dataFim, Integer idLeito) {
        this.idInternacao = idInternacao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.idLeito = idLeito;
    }

    @Override
    public String toString() {
        return "Internacoes [idInternacao=" + idInternacao +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", idLeito=" + idLeito + "]";
    }

    public Integer getIdInternacao() {
        return idInternacao;
    }

    public void setIdInternacao(Integer idInternacao) {
        this.idInternacao = idInternacao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getIdLeito() {
        return idLeito;
    }

    public void setIdLeito(Integer idLeito) {
        this.idLeito = idLeito;
    }
}