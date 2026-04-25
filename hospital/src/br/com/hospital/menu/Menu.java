package br.com.hospital.menu;

import br.com.hospital.model.Atendimento;
import br.com.hospital.model.Hospital;
import br.com.hospital.model.Pacientes;
import br.com.hospital.persistence.NotaFiscalDao;
import br.com.hospital.services.FaturaService;
import br.com.hospital.services.GeradorArquivo;
import java.math.BigDecimal;

public class Menu {

    public void menuPrincipal() {

        NotaFiscalDao notaFiscalDao = new NotaFiscalDao();

        // hospital sempre 1
        Hospital hospital = notaFiscalDao.listarHospitalById(1);

        String nomeHospital = hospital.getNome();
        String cnpjHospital = hospital.getCnpj();

        System.out.println("\n=== DADOS DA NOTA FISCAL ===\n");

        System.out.println("Prestador de Serviço");
        System.out.println(nomeHospital);
        System.out.println("CNPJ: " + cnpjHospital);

        Pacientes paciente = notaFiscalDao.listarPacientesById(1);

        System.out.println("\nTomador");
        System.out.println("\nPaciente: " + paciente.getNome());

        Atendimento atendimento = notaFiscalDao.listarAtendimentoById(1);
        System.out.println("\nDescricao do serviço");
        System.out.println(atendimento.getObservacao());

        System.out.println("\nValores da Nota");

        FaturaService ftserv = new FaturaService();
        double valorBruto = ftserv.calculaValorBruto(1);
        System.out.printf("Valor bruto do serviço: R$ %.2f%n", valorBruto);

        BigDecimal iss = ftserv.calculoImpostoIss(1);
        System.out.println("\nISS");
        System.out.println("Alíquota: 3%");
        System.out.println("Valor: R$" + iss);

        BigDecimal pis = ftserv.calculoImpostoPis(1);
        System.out.println("\nPIS");
        System.out.println("Alíquota: 0,65%");
        System.out.println("Valor: R$" + pis);

        BigDecimal cofins = ftserv.calculoImpostoCofins(1);
        System.out.println("\nCOFINS");
        System.out.println("Alíquota: 3%");
        System.out.println("Valor: R$" + cofins);

        BigDecimal irpj = ftserv.calculoImpostoIrpj(1);
        System.out.println("\nIRPJ");
        System.out.println("Alíquota: 1,2%");
        System.out.println("Valor: R$" + irpj);

        BigDecimal csll = ftserv.calculoImpostoCsll(1);
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
        gerador.gerarArquivo(1, "nota_fiscal_nova.txt");
    }
}
