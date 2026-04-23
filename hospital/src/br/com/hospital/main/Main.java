package br.com.hospital.main;

import br.com.hospital.model.Faturamentos;
import br.com.hospital.persistence.FaturaDao;

public class Main {
    public static void main(String[] args) {
        // new Menu().exibirMenuPrincipal();

        FaturaDao faturaDao = new FaturaDao();

        for (Faturamentos f : faturaDao.listar()) {
            System.out.println(f);
        }
    }
}