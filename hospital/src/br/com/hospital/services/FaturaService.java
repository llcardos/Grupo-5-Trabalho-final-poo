package br.com.hospital.services;

import br.com.hospital.model.TotalFaturamento;
import br.com.hospital.persistence.FaturaDao;
import br.com.hospital.utils.AliquotasImpostos;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FaturaService {
    
    public double calculaValorBruto(Integer idPaciente){
        FaturaDao faturaDao = new FaturaDao();
        TotalFaturamento totalFaturamento = faturaDao.getTotalFaturamento(idPaciente);

        if (totalFaturamento == null) {
            throw new IllegalArgumentException("Não foi encontrado faturamento para o paciente informado.");
        }

        return totalFaturamento.getCustoAtendimento() + totalFaturamento.getCustoExame() + totalFaturamento.getCustoInternacao();
    }

    public void calculoImposto(Integer id){
        AliquotasImpostos al = new AliquotasImpostos();

        double valorBruto = calculaValorBruto(id);
        BigDecimal valorBrutoBD = new BigDecimal(valorBruto);

        BigDecimal totalIss = valorBrutoBD.multiply(al.getISS());
        BigDecimal totalPis = valorBrutoBD.multiply(al.getPIS());
        BigDecimal totalCofins = valorBrutoBD.multiply(al.getCOFINS());
        BigDecimal totalIrpj = valorBrutoBD.multiply(al.getIRPJ());
        BigDecimal totalCsll = valorBrutoBD.multiply(al.getCSLL());

        System.out.println("ISS: " + totalIss);
        System.out.println("PIS: " + totalPis);
        System.out.println("COFINS: " + totalCofins);
        System.out.println("IRPJ: " + totalIrpj);
        System.out.println("CSLL: " + totalCsll);
    }

    public BigDecimal calculoImpostoIss(Integer id){
        AliquotasImpostos al = new AliquotasImpostos();

        double valorBruto = calculaValorBruto(id);
        BigDecimal valorBrutoBD = BigDecimal.valueOf(valorBruto);

        BigDecimal totalIss = valorBrutoBD.multiply(al.getISS());

        return totalIss.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculoImpostoPis(Integer id){
        AliquotasImpostos al = new AliquotasImpostos();

        double valorBruto = calculaValorBruto(id);
        BigDecimal valorBrutoBD = BigDecimal.valueOf(valorBruto);

        BigDecimal totalPis = valorBrutoBD.multiply(al.getPIS());

        return totalPis.setScale(2,RoundingMode.HALF_UP);
    }

    public BigDecimal calculoImpostoCofins(Integer id){
        AliquotasImpostos al = new AliquotasImpostos();

        double valorBruto = calculaValorBruto(id);
        BigDecimal valorBrutoBD = BigDecimal.valueOf(valorBruto);

        BigDecimal totalCofins = valorBrutoBD.multiply(al.getCOFINS());

        return totalCofins.setScale(2,RoundingMode.HALF_UP);
    }

    public BigDecimal calculoImpostoIrpj(Integer id){
        AliquotasImpostos al = new AliquotasImpostos();

        double valorBruto = calculaValorBruto(id);
        BigDecimal valorBrutoBD = BigDecimal.valueOf(valorBruto);

        BigDecimal totalIrpj = valorBrutoBD.multiply(al.getIRPJ());

        return totalIrpj.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculoImpostoCsll(Integer id){
        AliquotasImpostos al = new AliquotasImpostos();

        double valorBruto = calculaValorBruto(id);
        BigDecimal valorBrutoBD = BigDecimal.valueOf(valorBruto);

        BigDecimal totalCsll = valorBrutoBD.multiply(al.getCSLL());

        return totalCsll.setScale(2,RoundingMode.HALF_UP);
    }
}
