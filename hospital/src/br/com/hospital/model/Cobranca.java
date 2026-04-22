package br.com.hospital.model;

import java.math.BigDecimal;

public class Cobranca {
    private Integer idCobranca;
    private Decimal valor;
    private String status; 
    private Integer id_Faturamento; 


    public Cobranca(Integer idCobranca, BigDecimal valor, String status, Integer idFaturamento) {
        this.idCobranca = idCobranca;
        this.valor = valor;
        this.status = status;
        this.id_Faturamento = id_Faturamento;
    }   

    @Override
    public String toString() {
        return "Cobranca [idCobranca=" + idCobranca + ", valor=" + valor + ", status=" + status + "]";
    }

    public Integer getId() {return idCobranca;}
    public void setId(Integer idCobranca) {this.idCobranca = idCobranca;}

    public BigDecimal getValor() {return valor;}
    public void setValor(BigDecimal valor) {this.valor = valor;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public Integer getIdFaturamento() {return id_Faturamento;}
    public void setIdFaturamento(Integer id_Faturamento) {this.id_Faturamento = id_Faturamento;}

}