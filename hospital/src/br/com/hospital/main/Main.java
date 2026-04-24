package br.com.hospital.main;

import br.com.hospital.model.Exames;
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
        // Integer idBusca = 1;
        // Hospital hospital = notaFiscalDao.listarHospitalById(idBusca);
        // System.out.println(hospital);
        
        //for (Pacientes pacientes : notaFiscalDao.listarPacientes()) {
           // System.out.println(pacientes);
        // }

        
        // Integer idBuscar = 5;
        // Pacientes pacientes = notaFiscalDao.listarPacientesById(idBuscar);
        // System.out.println(pacientes);

        // for (Atendimento atendimento : notaFiscalDao.listarAtendimento()) {
        //     System.out.println(atendimento);
            
        // }

        // Integer idBuscar = 6;
        // Atendimento atendimento = notaFiscalDao.listarAtendimentoById(idBuscar);
        // System.out.println(atendimento);

        // for (Exames exame : notaFiscalDao.listareExames()) {
        //     System.out.println(exame);
            
        
        // }
        
        Integer idBuscar = 10;
        Exames exame = notaFiscalDao.listarExameById(idBuscar);
        System.out.println(exame);
        
    }
}