package br.com.hospital.model;

public class Hospital {

    private Integer idHospital;
    private String cnpj;
    private Integer id_setor;
    private Integer id_credenciamento;

    public Hospital() {
    }

    public Hospital(Integer idHospital, String cnpj, Integer id_setor, Integer id_credenciamento) {
        this.idHospital = idHospital;
        this.cnpj = cnpj;
        this.id_setor = id_setor;
        this.id_credenciamento = id_credenciamento;
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
