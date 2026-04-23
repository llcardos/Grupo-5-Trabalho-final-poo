package br.com.hospital.model;

import java.util.List;

public class Hospital {
    private Integer idHospital;
    private String cnpj;
    private List<Credenciamentos> credenciamentos;
    private List<Setores> setores;

    public Hospital() {
    }

    public Hospital(Integer idHospital, String cnpj, List<Credenciamentos> credenciamentos, List<Setores> setores) {
        this.idHospital = idHospital;
        this.cnpj = cnpj;
        this.credenciamentos = credenciamentos;
        this.setores = setores;
    }

    @Override
    public String toString() {
        return "Hospital [idHospital=" + idHospital + ", cnpj=" + cnpj + ", id_setor=" + id_setor + ", id_credenciamento="
                + id_credenciamento + "]";
    }

    public Integer getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(Integer idHospital) {
        this.idHospital = idHospital;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getId_setor() {
        return id_setor;
    }

    public void setId_setor(Integer id_setor) {
        this.id_setor = id_setor;
    }

    public Integer getId_credenciamento() {
        return id_credenciamento;
    }

    public void setId_credenciamento(Integer id_credenciamento) {
        this.id_credenciamento = id_credenciamento;
    }

}
