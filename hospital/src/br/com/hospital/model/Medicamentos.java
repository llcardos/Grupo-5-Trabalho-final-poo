package br.com.hospital.model;

public class Medicamentos {
    private int id_medicamento;
    private String nome;
    private String dosagem;
    private int quantidade;

    public Medicamentos(int id_medicamento, String nome, String dosagem, int quantidade) {
        this.id_medicamento = id_medicamento;
        this.nome = nome;
        this.dosagem = dosagem;
        this.quantidade = quantidade;
    }

    public Medicamentos() {
    }

    @Override
    public String toString() {
        return "Medicamentos [id_medicamento=" + id_medicamento + ", nome=" + nome + ", dosagem=" + dosagem
                + ", quantidade=" + quantidade + "]";
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
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