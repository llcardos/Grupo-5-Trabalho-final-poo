package br.com.hospital.model;

public class Hospital {

    private Integer id_hospital;
    private String cnpj;
    private Integer id_setor;
    private Integer id_credenciamento;

    public Hospital() {
    }

    public Hospital(Integer id_hospital, String cnpj, Integer id_setor, Integer id_credenciamento) {
        this.id_hospital = id_hospital;
        this.cnpj = cnpj;
        this.id_setor = id_setor;
        this.id_credenciamento = id_credenciamento;
    }

    @Override
    public String toString() {
        return "Hospital [id_hospital=" + id_hospital + ", cnpj=" + cnpj + ", id_setor=" + id_setor + ", id_credenciamento="
                + id_credenciamento + "]";
    }

    public Integer getId_hospital() {
        return id_hospital;
    }

    public void setId_hospital(Integer id_hospital) {
        this.id_hospital = id_hospital;
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
