package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač nelze zapnout, protože už je zapnutý.");
        } else if (cpu == null) {
            System.err.println("Chybí procesor");
        } else if (ram == null) {
            System.err.println("Chybí paměť.");
        } else if (pevnyDisk == null) {
            System.err.println("Chybí pevný disk");
        } else {
            System.out.println("Počítač se zapnul.");
            jeZapnuty = true;
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul.");
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        String zapnuto = "Zapnutý";
        if (!jeZapnuty) {
            zapnuto = "Vypnutý";
        }
        return zapnuto + " počítač (" +
                "cpu: " + cpu +
                ", ram: " + ram +
                ", pevný disk: " + pevnyDisk +
                ")";
    }
}
