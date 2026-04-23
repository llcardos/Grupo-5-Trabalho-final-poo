package br.com.hospital.utils;

import java.math.BigDecimal;

public interface AliquotasImpostos {

    BigDecimal ISS = new BigDecimal("0.03");
    BigDecimal PIS = new BigDecimal("0.0065");
    BigDecimal COFINS = new BigDecimal("0.03");
    BigDecimal IRPJ = new BigDecimal("0.012");
    BigDecimal CSLL = new BigDecimal("0.0108");

}