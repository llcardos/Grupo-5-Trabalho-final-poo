package br.com.hospital.model;

import br.com.hospital.enums.TipoAtendimento;

public class TotalFaturamento {
    private int idAtendimento;
    private TipoAtendimento tipoAtendimento;
    private double custoAtendimento;
    private double custoExame;
    private double custoInternacao;
    private double custoTotal;
    private int idPaciente;

    public TotalFaturamento() {
    }

    
    public TotalFaturamento(int idAtendimento, TipoAtendimento tipoAtendimento, double custoAtendimento,
            double custoExame, double custoInternacao, double custoTotal, int idPaciente) {
        this.idAtendimento = idAtendimento;
        this.tipoAtendimento = tipoAtendimento;
        this.custoAtendimento = custoAtendimento;
        this.custoExame = custoExame;
        this.custoInternacao = custoInternacao;
        this.custoTotal = custoTotal;
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "TotalFaturamento [idAtendimento=" + idAtendimento + ", tipoAtendimento=" + tipoAtendimento
                + ", custoAtendimento=" + custoAtendimento + ", custoExame=" + custoExame + ", custoInternacao="
                + custoInternacao + ", custoTotal=" + custoTotal + ", idPaciente=" + idPaciente + "]";
    }

    public int getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public double getCustoExame() {
        return custoExame;
    }

    public void setCustoExame(double custoExame) {
        this.custoExame = custoExame;
    }

    public double getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(double custoInternacao) {
        this.custoInternacao = custoInternacao;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getCustoAtendimento() {
        return custoAtendimento;
    }

    public void setCustoAtendimento(double custoAtendimento) {
        this.custoAtendimento = custoAtendimento;
    }
}
