package br.com.hospital.model;

import java.util.List;

public class Hospital {
    private Integer idHospital;
    private String nome;
    private String cnpj;

    public Hospital() {
    }

    public Hospital(Integer idHospital, String nome, String cnpj) {
        this.idHospital = idHospital;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Hospital [idHospital=" + idHospital +
                ", nome=" + nome +
                ", cnpj=" + cnpj + "]";
    }

    public Integer getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(Integer idHospital) {
        this.idHospital = idHospital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}