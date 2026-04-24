package br.com.hospital.main;

import br.com.hospital.menu.Menu;
import br.com.hospital.services.FaturaService;

public class Main {
    public static void main(String[] args) {
        FaturaService fs = new FaturaService();

        //fs.calculoImposto(3);


        Menu menu = new Menu();
        menu.menuPrincipal();
    }


}