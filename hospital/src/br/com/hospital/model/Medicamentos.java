package br.com.hospital.model;

public class Medicamentos {
    private Integer idMedicamento;
    private String nome;
    private String dosagem;

    public Medicamentos(Integer idMedicamento, String nome, String dosagem) {
        this.idMedicamento = idMedicamento;
        this.nome = nome;
        this.dosagem = dosagem;
    }
    public Medicamentos() {
    }
    @Override
    public String toString() {
        return "Medicamentos [idMedicamento=" + idMedicamento + ", nome=" + nome + ", dosagem=" + dosagem + "]";
    }
    public Integer getIdMedicamento() {
        return idMedicamento;
    }
    public void setIdMedicamento(Integer idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDosagem() {
        return dosagem;
    }
    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }
}