package br.com.hospital.model;

import java.math.BigDecimal;

public class Impostos {

    private Integer idImposto;

    private BigDecimal pis;
    private BigDecimal cofins;
    private BigDecimal iss;
    private BigDecimal irpj;
    private BigDecimal csll;

    public Impostos() {
    }

    public Impostos(Integer idImposto, BigDecimal pis, BigDecimal cofins,
                    BigDecimal iss, BigDecimal irpj, BigDecimal csll) {
        this.idImposto = idImposto;
        this.pis = pis;
        this.cofins = cofins;
        this.iss = iss;
        this.irpj = irpj;
        this.csll = csll;
    }

    @Override
    public String toString() {
        return "Impostos [idImposto=" + idImposto +
                ", pis=" + pis +
                ", cofins=" + cofins +
                ", iss=" + iss +
                ", irpj=" + irpj +
                ", csll=" + csll + "]";
    }

    public Integer getIdImposto() {
        return idImposto;
    }

    public void setIdImposto(Integer idImposto) {
        this.idImposto = idImposto;
    }

    public BigDecimal getPis() {
        return pis;
    }

    public void setPis(BigDecimal pis) {
        this.pis = pis;
    }

    public BigDecimal getCofins() {
        return cofins;
    }

    public void setCofins(BigDecimal cofins) {
        this.cofins = cofins;
    }

    public BigDecimal getIss() {
        return iss;
    }

    public void setIss(BigDecimal iss) {
        this.iss = iss;
    }

    public BigDecimal getIrpj() {
        return irpj;
    }

    public void setIrpj(BigDecimal irpj) {
        this.irpj = irpj;
    }

    public BigDecimal getCsll() {
        return csll;
    }

    public void setCsll(BigDecimal csll) {
        this.csll = csll;
    }
}