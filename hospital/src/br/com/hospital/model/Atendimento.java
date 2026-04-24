package br.com.hospital.model;
import br.com.hospital.enums.StatusAtendimento;
import br.com.hospital.enums.TipoAtendimento;
import java.time.LocalDateTime;

public class Atendimento {
    private Integer id_atendimento;
    private String nome;
    private TipoAtendimento tipo;       
    private StatusAtendimento status;   
    private String observacao;
    private LocalDateTime data;         
    private Integer id_Paciente;
    private Integer id_Medico;
    private Integer id_Enfermeiro;

    public Atendimento(Integer id_atendimento, String nome, TipoAtendimento tipo, StatusAtendimento status, 
    String observacao, LocalDateTime data, Integer id_Paciente, Integer id_Medico, Integer id_Enfermeiro) {
        this.id_atendimento = id_atendimento;
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
        this.observacao = observacao;
        this.data = data;
        this.id_Paciente = id_Paciente;
        this.id_Medico = id_Medico;
        this.id_Enfermeiro = id_Enfermeiro;
    }

    @Override
    public String toString() {
        return "Atendimento [id_atendimento=" + id_atendimento + ", nome=" + nome + ", tipo=" + tipo + ", data=" + data + ", status=" + status + "]";
    }

    public Integer getId() { return id_atendimento; }
    public void setId(Integer id_atendimento) { this.id_atendimento = id_atendimento; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public TipoAtendimento getTipo() { return tipo; }
    public void setTipo(TipoAtendimento tipo) { this.tipo = tipo; }

    public StatusAtendimento getStatus() { return status; }
    public void setStatus(StatusAtendimento status) { this.status = status; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }

    public Integer getIdPaciente() { return id_Paciente; }
    public void setIdPaciente(Integer id_Paciente) { this.id_Paciente = id_Paciente; }

    public Integer getIdMedico() { return id_Medico; }
    public void setIdMedico(Integer id_Medico) { this.id_Medico = id_Medico; }

    public Integer getIdEnfermeiro() { return id_Enfermeiro; }
    public void setIdEnfermeiro(Integer id_Enfermeiro) { this.id_Enfermeiro = id_Enfermeiro; }

    
}