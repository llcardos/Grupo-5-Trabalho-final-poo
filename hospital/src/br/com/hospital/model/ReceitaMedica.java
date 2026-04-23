package br.com.hospital.model;

import java.time.LocalDateTime;

public class ReceitaMedica {
    private Integer id_Receita;
    private String prescricao;
    private LocalDateTime data;
    private Integer id_Atendimento;
    private Integer id_Medicamento;

    public ReceitaMedica(Integer id_Receita, String prescricao, LocalDateTime data, Integer id_Atendimento, Integer id_Medicamento) {
        this.id_Receita = id_Receita;
        this.prescricao = prescricao;
        this.data = data;
        this.id_Atendimento = id_Atendimento;
        this.id_Medicamento = id_Medicamento;
    }

    @Override
    public String toString() {
        return "ReceitaMedica [id_Receita=" + id_Receita + ", prescricao=" + prescricao + ", data=" + data 
                + ", id_Atendimento=" + id_Atendimento + ", id_Medicamento=" + id_Medicamento + "]";
    }

    public Integer getId() { return id_Receita; }
    public void setId(Integer id_Receita) { this.id_Receita = id_Receita; }

    public String getPrescricao() { return prescricao; }
    public void setPrescricao(String prescricao) { this.prescricao = prescricao; }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }

    public Integer getIdAtendimento() { return id_Atendimento; }
    public void setIdAtendimento(Integer id_Atendimento) { this.id_Atendimento = id_Atendimento; }

    public Integer getIdMedicamento() { return id_Medicamento; }
    public void setIdMedicamento(Integer id_Medicamento) { this.id_Medicamento = id_Medicamento; }
}