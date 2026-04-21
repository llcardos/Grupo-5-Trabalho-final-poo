package br.com.hospital.model;

import java.math.BigDecimal;

public class Cobranca {
    private Integer id_cobranca;
    private Decimal valor;
    private String status; 
    private Integer id_Faturamento; 


    public Cobranca(Integer id_cobranca, BigDecimal valor, String status, Integer idFaturamento) {
        this.id_cobranca = id_cobranca;
        this.valor = valor;
        this.status = status;
        this.id_Faturamento = id_Faturamento;
    }   

    @Override
    public String toString() {
        return "Cobranca [id_cobranca=" + id_cobranca + ", valor=" + valor + ", status=" + status + "]";
    }

    public Integer getId() {return id_cobranca;}
    public void setId(Integer id_cobranca) {this.id_cobranca = id_cobranca;}

    public BigDecimal getValor() {return valor;}
    public void setValor(BigDecimal valor) {this.valor = valor;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public Integer getIdFaturamento() {return id_Faturamento;}
    public void setIdFaturamento(Integer id_Faturamento) {this.id_Faturamento = id_Faturamento;}

}