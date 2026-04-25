package br.com.hospital.utils;

public interface Saudacao {
    String SAUDACAO = "Bem-vindo ao sistema de faturamento hospitalar!";

    default void exibirSaudacao() {
        System.out.println(SAUDACAO);
    }
}
