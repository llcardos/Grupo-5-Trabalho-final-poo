package br.com.hospital.model;

import java.time.LocalDate;

public class Atendimento {
    private Integer idAtendimento;
    private String nome;
    private String tipo;
    private String status;    
    private String observacao;
    private LocalDate data;
    private Integer id_Paciente;
    private Integer id_Medico;
    private Integer id_Enfermeira;

    public Atendimento(Integer idAtendimento, String nome, String tipo, String status, String observacao, 
        LocalDate data, Integer id_Paciente, Integer id_Medico, Integer id_Enfermeira) {
       
        this.idAtendimento = idAtendimento;
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
        this.observacao = observacao;
        this.data = data;
        this.id_Paciente = id_Paciente;
        this.id_Medico = id_Medico;
        this.id_Enfermeira = id_Enfermeira;
    }

    @Override
    public String toString() {
        return "Atendimento [idAtendimento=" + idAtendimento + ", nome=" + nome + ", data=" + data + ", status=" + status + "]";
    }

    public Integer getId() { return idAtendimento; }
    public void setId(Integer idAtendimento) { this.idAtendimento = idAtendimento; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

}

