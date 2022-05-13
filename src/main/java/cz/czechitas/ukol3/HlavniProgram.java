package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.*;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vypnutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(2_400_000_000L);
        mujProcesor.setVyrobce("Intel");
        mujPocitac.setCpu(mujProcesor);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(8_000_000_000L);
        mujPocitac.setRam(mojePamet);

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(512_000_000_000L);
        mujPocitac.setPevnyDisk(mujDisk);

        mujPocitac.zapniSe();
        System.out.println(mujPocitac);

        //mujPocitac.vypniSe();

        mujPocitac.vytvorSouborOVelikosti(262_000_000_000L);
        mujPocitac.vytvorSouborOVelikosti(262_000_000_000L);
        mujPocitac.vytvorSouborOVelikosti(2_000_000_000L);

        System.out.println(mujPocitac);

        mujPocitac.vymazSouboryOVelikosti(562_000_000_000L);

        mujPocitac.vypniSe();
    }
}
