package com.paveldejimas.isvestine;

public class StatybininkasImpl implements Statybininkas {
    private int stazas;
    private String specializacija;
    private String issilavinimas;
    private double atlyginimas;

    public StatybininkasImpl(int stazas, String specializacija, String issilavinimas, double atlyginimas){
        this.stazas = stazas;
        this.specializacija = specializacija;
        this.issilavinimas = issilavinimas;
        this.atlyginimas = atlyginimas;
    }

    @Override
    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    @Override
    public int getStazas() {
        return stazas;
    }

    @Override
    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    @Override
    public String getIssilavinimas() {
        return issilavinimas;
    }

    @Override
    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }

    @Override
    public String getSpecializacija() {
        return specializacija;
    }

    @Override
    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    @Override
    public double getAtlyginimas() {
        return atlyginimas;
    }

    @Override
    public String toString() {
        return "StatybininkasImpl{" +
                "stazas=" + stazas +
                ", specializacija='" + specializacija + '\'' +
                ", issilavinimas='" + issilavinimas + '\'' +
                ", atlyginimas=" + atlyginimas +
                '}';
    }
}


