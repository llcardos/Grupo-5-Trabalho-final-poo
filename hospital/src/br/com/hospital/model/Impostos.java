package br.com.hospital.model;

import java.math.BigDecimal;

public class Impostos {

    private Integer id_imposto;
    private Integer id_nf;

    private BigDecimal pis;
    private BigDecimal cofins;
    private BigDecimal iss;
    private BigDecimal irpj;
    private BigDecimal csll;

    public Impostos() {
    }

    public Impostos(Integer id_imposto, Integer id_nf, BigDecimal pis, BigDecimal cofins, BigDecimal iss,
                    BigDecimal irpj, BigDecimal csll) {
        this.id_imposto = id_imposto;
        this.id_nf = id_nf;
        this.pis = pis;
        this.cofins = cofins;
        this.iss = iss;
        this.irpj = irpj;
        this.csll = csll;
    }

    @Override
    public String toString() {
        return "Impostos [id_imposto=" + id_imposto + ", id_nf=" + id_nf + ", pis=" + pis + ", cofins=" + cofins
                + ", iss=" + iss + ", irpj=" + irpj + ", csll=" + csll + "]";
    }

    public Integer getId_imposto() {
        return id_imposto;
    }

    public void setId_imposto(Integer id_imposto) {
        this.id_imposto = id_imposto;
    }

    public Integer getId_nf() {
        return id_nf;
    }

    public void setId_nf(Integer id_nf) {
        this.id_nf = id_nf;
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