package br.com.hospital.utils;

import java.math.BigDecimal;

public class AliquotasImpostos {
    BigDecimal ISS = new BigDecimal("0.03");
    BigDecimal PIS = new BigDecimal("0.0065");
    BigDecimal COFINS = new BigDecimal("0.03");
    BigDecimal IRPJ = new BigDecimal("0.012");
    BigDecimal CSLL = new BigDecimal("0.0108");

    public BigDecimal getISS() {
        return ISS;
    }
    public BigDecimal getPIS() {
        return PIS;
    }
    public BigDecimal getCOFINS() {
        return COFINS;
    }
    public BigDecimal getIRPJ() {
        return IRPJ;
    }
    public BigDecimal getCSLL() {
        return CSLL;
    }
}