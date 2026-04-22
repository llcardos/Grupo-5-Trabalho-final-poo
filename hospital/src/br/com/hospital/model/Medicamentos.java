package br.com.hospital.model;

public class Medicamentos {
    private int idMedicamento;
    private String nome;
    private String dosagem;
    private int quantidade;

    public Medicamentos(int idMedicamento, String nome, String dosagem, int quantidade) {
        this.idMedicamento = idMedicamento;
        this.nome = nome;
        this.dosagem = dosagem;
        this.quantidade = quantidade;
    }

    public Medicamentos() {
    }

    @Override
    public String toString() {
        return "Medicamentos [idMedicamento=" + idMedicamento + ", nome=" + nome + ", dosagem=" + dosagem
                + ", quantidade=" + quantidade + "]";
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}