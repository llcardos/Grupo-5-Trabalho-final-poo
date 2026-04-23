package br.com.hospital.main;

import br.com.hospital.model.Faturamentos;
import br.com.hospital.model.Hospital;
import br.com.hospital.persistence.FaturaDao;
import br.com.hospital.persistence.NotaFiscalDao;

public class Main {
    public static void main(String[] args) {
        // new Menu().exibirMenuPrincipal();

        // FaturaDao faturaDao = new FaturaDao();

        // for (Faturamentos f : faturaDao.listar()) {
        //     System.out.println(f);
        // }
        NotaFiscalDao notaFiscalDao = new NotaFiscalDao();
        // for (Hospital hospital : notaFiscalDao.listarHospital()) {
        // System.err.println(hospital);    
        // }
        Integer idBusca = 1;
        Hospital hospital = notaFiscalDao.listarHospitalById(idBusca);
        System.out.println(hospital);
    }
}