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
        Pacientes pacientes = notaFiscalDao.listarPacientesById(id);
        if (pacientes == null) {
            System.out.println("Paciente não encontrado. Arquivo não foi gerado.");
            return;
        }
        String nomePaciente = pacientes.getNome();

        FaturaService fs = new FaturaService();
        double valorBruto = fs.calculaValorBruto(id);
        BigDecimal valorIss = fs.calculoImpostoIss(id);
        BigDecimal valorPis = fs.calculoImpostoPis(id);
        BigDecimal valorCofins = fs.calculoImpostoCofins(id);
        BigDecimal valorIrpj = fs.calculoImpostoIrpj(id);
        BigDecimal valorCsll = fs.calculoImpostoCsll(id);

        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {

            String nome = nomePaciente;
            double valorNota = valorBruto;
            BigDecimal iss = valorIss;
            BigDecimal pis = valorPis;
            BigDecimal cofins = valorCofins;
            BigDecimal irpj = valorIrpj;
            BigDecimal csll = valorCsll;

            String linha = String.format(Locale.US, "%s;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f",
                    nome, valorNota, iss, pis, cofins, irpj, csll);

            writer.println(linha);

            System.out.println("Arquivo gerado com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}