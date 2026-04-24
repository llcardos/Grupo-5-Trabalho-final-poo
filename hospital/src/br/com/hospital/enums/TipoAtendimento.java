package br.com.hospital.enums;

public enum TipoAtendimento {
    CONSULTA(200.00), EMERGENCIA(500.00), REVISAO(100.00);

    private final double custo;

    TipoAtendimento(double custo) {
        this.custo = custo;
    }

    public double getCusto() {
        return custo;
    }
}