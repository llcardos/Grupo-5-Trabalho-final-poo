package br.com.hospital.model;

import br.com.hospital.enums.StatusFatura;
import java.sql.Date;

public class Faturamentos {
    private Integer idFaturamento;
    private Date dataEmissao;
    private Date dataVencimento;
    private Integer idAtendimento;
    private StatusFatura statusFatura;

    public Faturamentos() {
    }

    public Faturamentos(Date dataEmissao, Date dataVencimento, Integer idAtendimento,
            StatusFatura statusFatura) {
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.idAtendimento = idAtendimento;
        this.statusFatura = statusFatura;
    }

    public Faturamentos(Integer idFaturamento, Date dataEmissao, Date dataVencimento,
            Integer idAtendimento, StatusFatura statusFatura) {
        this.idFaturamento = idFaturamento;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.idAtendimento = idAtendimento;
        this.statusFatura = statusFatura;
    }

    @Override
    public String toString() {
        return "Faturamentos [idFaturamento=" + idFaturamento + ", dataEmissao=" + dataEmissao + ", dataVencimento="
                + dataVencimento + ", idAtendimento=" + idAtendimento + ", statusFatura=" + statusFatura + "]";
    }

    public Integer getIdFaturamento() {
        return idFaturamento;
    }

    public void setIdFaturamento(Integer idFaturamento) {
        this.idFaturamento = idFaturamento;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Integer getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Integer idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public StatusFatura getStatusFatura() {
        return statusFatura;
    }

    public void setStatusFatura(StatusFatura statusFatura) {
        this.statusFatura = statusFatura;
    }

    
}
