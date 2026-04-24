package br.com.hospital.services;

import br.com.hospital.model.Pacientes;
import br.com.hospital.persistence.NotaFiscalDao;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Locale;

public class GeradorArquivo {

    public void gerarArquivo(Integer id, String nomeArquivo){

        NotaFiscalDao notaFiscalDao = new NotaFiscalDao();
        Pacientes pacientes = notaFiscalDao.listarPacientesById(1);
        String nomePaciente = pacientes.getNome();

        FaturaService fs = new FaturaService();
        double valorBruto = fs.calculaValorBruto(1);
        BigDecimal valorIss = fs.calculoImpostoIss(1);
        BigDecimal valorPis = fs.calculoImpostoPis(1);
        BigDecimal valorCofins = fs.calculoImpostoCofins(1);
        BigDecimal valorIrpj = fs.calculoImpostoIrpj(1);
        BigDecimal valorCsll = fs.calculoImpostoCsll(1);

        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {

            String nome = nomePaciente;
            double valorNota = valorBruto;
            BigDecimal iss = valorIss;
            BigDecimal pis = valorPis;
            BigDecimal cofins = valorCofins;
            BigDecimal irpj = valorIrpj;
            BigDecimal csll = valorCsll;

            String linha = String.format(Locale.US, "%s;%d;%.2f;%.2f;%.2f;%.2f;%.2f",
                    nome, valorNota, iss, pis, cofins, irpj, csll);

            writer.println(linha);

            System.out.println("Arquivo gerado com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}