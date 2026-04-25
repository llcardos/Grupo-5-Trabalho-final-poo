package br.com.hospital.menu;

import br.com.hospital.model.Exames;
import br.com.hospital.model.Hospital;
import br.com.hospital.model.Pacientes;
import br.com.hospital.persistence.NotaFiscalDao;
import br.com.hospital.services.FaturaService;
import br.com.hospital.services.GeradorArquivo;
import br.com.hospital.utils.Saudacao;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Menu {

    public void menuPrincipal() {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Integer idPaciente = null;

        while (idPaciente == null) {
            System.out.print("Informe o ID do paciente: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
                continue;
            }

            int idInformado = scanner.nextInt();

            if (idInformado <= 0) {
                System.out.println("O ID deve ser maior que zero.");
                continue;
            }

            idPaciente = idInformado;
        }

        NotaFiscalDao notaFiscalDao = new NotaFiscalDao();

        // hospital sempre 1
        Hospital hospital = notaFiscalDao.listarHospitalById(1);

        String nomeHospital = hospital.getNome();
        String cnpjHospital = hospital.getCnpj();

        Saudacao saudacao = new Saudacao() {};
        saudacao.exibirSaudacao();

        System.out.println("\n=== DADOS DA NOTA FISCAL ===\n");

        System.out.println("Prestador de Serviço");
        System.out.println(nomeHospital);
        System.out.println("CNPJ: " + cnpjHospital);

        Pacientes paciente = notaFiscalDao.listarPacientesById(idPaciente);
        if (paciente == null) {
            System.out.println("Paciente não encontrado para o ID informado.");
            return;
        }

        System.out.println("\nTomador");
        System.out.println("\nPaciente: " + paciente.getNome());

        Exames exame = notaFiscalDao.listarExameById(idPaciente);
        System.out.println("\nDescricao do serviço");
        System.out.println(exame.getDescricao());

        System.out.println("\nValores da Nota");

        FaturaService ftserv = new FaturaService();
        double valorBruto;
        try {
            valorBruto = ftserv.calculaValorBruto(idPaciente);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.printf("Valor bruto do serviço: R$ %.2f%n", valorBruto);

        BigDecimal iss = ftserv.calculoImpostoIss(idPaciente);
        System.out.println("\nISS");
        System.out.println("Alíquota: 3%");
        System.out.println("Valor: R$" + iss);

        BigDecimal pis = ftserv.calculoImpostoPis(idPaciente);
        System.out.println("\nPIS");
        System.out.println("Alíquota: 0,65%");
        System.out.println("Valor: R$" + pis);

        BigDecimal cofins = ftserv.calculoImpostoCofins(idPaciente);
        System.out.println("\nCOFINS");
        System.out.println("Alíquota: 3%");
        System.out.println("Valor: R$" + cofins);

        BigDecimal irpj = ftserv.calculoImpostoIrpj(idPaciente);
        System.out.println("\nIRPJ");
        System.out.println("Alíquota: 1,2%");
        System.out.println("Valor: R$" + irpj);

        BigDecimal csll = ftserv.calculoImpostoCsll(idPaciente);
        System.out.println("\nCSLL");
        System.out.println("Alíquota: 1,08%");
        System.out.println("Valor: R$" + csll);

        System.out.println("\nRESUMO DOS IMPOSTOS");

        System.out.println("-------------------------------------------");
        System.out.printf("%-10s %-10s %-10s\n", "Imposto", "Aliquota", "Valor");
        System.out.println("-------------------------------------------");

        System.out.printf("%-10s %-10s %-10s\n", "ISS", "3,00%", "R$ " + iss);
        System.out.printf("%-10s %-10s %-10s\n", "PIS", "0,65%", "R$ " + pis);
        System.out.printf("%-10s %-10s %-10s\n", "COFINS", "3,00%", "R$ " + cofins);
        System.out.printf("%-10s %-10s %-10s\n", "IRPJ", "1,20%", "R$ " + irpj);
        System.out.printf("%-10s %-10s %-10s\n", "CSLL", "1,08%", "R$ " + csll);

        System.out.println("-------------------------------------------");

        GeradorArquivo gerador = new GeradorArquivo();
        gerador.gerarArquivo(idPaciente, "nota_fiscal_paciente_" + idPaciente + ".txt");
    }

    public void menuSwing() {
        Integer idPaciente = null;

        JOptionPane.showMessageDialog( null, Saudacao.SAUDACAO, "Saudacao", JOptionPane.INFORMATION_MESSAGE);
        while (idPaciente == null) {
            String entrada = JOptionPane.showInputDialog( null, "Informe o ID do paciente:", "Nota Fiscal", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                JOptionPane.showMessageDialog( null, "Operacao cancelada pelo usuario.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            entrada = entrada.trim();
            if (entrada.isEmpty()) {
                JOptionPane.showMessageDialog( null, "Entrada invalida. Digite um numero inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            try {
                int idInformado = Integer.parseInt(entrada);
                if (idInformado <= 0) {
                    JOptionPane.showMessageDialog( null, "O ID deve ser maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                idPaciente = idInformado;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog( null, "Entrada invalida. Digite um numero inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        NotaFiscalDao notaFiscalDao = new NotaFiscalDao();

        Hospital hospital = notaFiscalDao.listarHospitalById(1);
        if (hospital == null) {
            JOptionPane.showMessageDialog( null, "Hospital nao encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pacientes paciente = notaFiscalDao.listarPacientesById(idPaciente);
        if (paciente == null) {
            JOptionPane.showMessageDialog( null, "Paciente nao encontrado para o ID informado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Exames exame = notaFiscalDao.listarExameById(idPaciente);
        if (exame == null) {
            JOptionPane.showMessageDialog( null, "Exame nao encontrado para o ID informado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        FaturaService ftserv = new FaturaService();
        double valorBruto;
        try {
            valorBruto = ftserv.calculaValorBruto(idPaciente);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog( null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        BigDecimal iss = ftserv.calculoImpostoIss(idPaciente);
        BigDecimal pis = ftserv.calculoImpostoPis(idPaciente);
        BigDecimal cofins = ftserv.calculoImpostoCofins(idPaciente);
        BigDecimal irpj = ftserv.calculoImpostoIrpj(idPaciente);
        BigDecimal csll = ftserv.calculoImpostoCsll(idPaciente);

        StringBuilder resumo = new StringBuilder();
        resumo.append("=== DADOS DA NOTA FISCAL ===\n\n");
        resumo.append("Prestador de Servico\n");
        resumo.append(hospital.getNome()).append("\n");
        resumo.append("CNPJ: ").append(hospital.getCnpj()).append("\n\n");
        resumo.append("Tomador\n");
        resumo.append("Paciente: ").append(paciente.getNome()).append("\n\n");
        resumo.append("Descricao do servico\n");
        resumo.append(exame.getDescricao()).append("\n\n");
        resumo.append("Valores da Nota\n");
        resumo.append(String.format("Valor bruto do servico: R$ %.2f\n\n", valorBruto));

        resumo.append("ISS\n");
        resumo.append("Aliquota: 3%\n");
        resumo.append("Valor: R$").append(iss).append("\n\n");

        resumo.append("PIS\n");
        resumo.append("Aliquota: 0,65%\n");
        resumo.append("Valor: R$").append(pis).append("\n\n");

        resumo.append("COFINS\n");
        resumo.append("Aliquota: 3%\n");
        resumo.append("Valor: R$").append(cofins).append("\n\n");

        resumo.append("IRPJ\n");
        resumo.append("Aliquota: 1,2%\n");
        resumo.append("Valor: R$").append(irpj).append("\n\n");

        resumo.append("CSLL\n");
        resumo.append("Aliquota: 1,08%\n");
        resumo.append("Valor: R$").append(csll).append("\n\n");

        resumo.append("RESUMO DOS IMPOSTOS\n");
        resumo.append("-------------------------------------------\n");
        resumo.append(String.format("%-10s %-10s %-10s\n", "Imposto", "Aliquota", "Valor"));
        resumo.append("-------------------------------------------\n");
        resumo.append(String.format("%-10s %-10s %-10s\n", "ISS", "3,00%", "R$ " + iss));
        resumo.append(String.format("%-10s %-10s %-10s\n", "PIS", "0,65%", "R$ " + pis));
        resumo.append(String.format("%-10s %-10s %-10s\n", "COFINS", "3,00%", "R$ " + cofins));
        resumo.append(String.format("%-10s %-10s %-10s\n", "IRPJ", "1,20%", "R$ " + irpj));
        resumo.append(String.format("%-10s %-10s %-10s\n", "CSLL", "1,08%", "R$ " + csll));
        resumo.append("-------------------------------------------\n");

        JTextArea textArea = new JTextArea(resumo.toString(), 28, 60);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        textArea.setEditable(false);
        textArea.setLineWrap(false);
        textArea.setCaretPosition(0);

        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(
                null,
                scrollPane,
                "Nota Fiscal",
                JOptionPane.INFORMATION_MESSAGE
        );

        GeradorArquivo gerador = new GeradorArquivo();
        String nomeArquivo = "nota_fiscal_paciente_" + idPaciente + ".txt";
        gerador.gerarArquivo(idPaciente, nomeArquivo);

        JOptionPane.showMessageDialog( null, "Arquivo gerado: " + nomeArquivo, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
