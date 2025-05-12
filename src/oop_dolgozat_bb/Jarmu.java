/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_dolgozat_bb;

/**
 *
 * @author bohmb
 */
public abstract class Jarmu {

     protected int aktualsebesseg;
    private String rendszam;
    
    public Jarmu(int aktualsebesseg, String rendszam) {
        this.aktualsebesseg = aktualsebesseg;
        this.rendszam = rendszam;
    }
    
    public int getAktualsebesseg() {
        return aktualsebesseg;
    }

    public void setAktualsebesseg(int aktualsebesseg) {
        this.aktualsebesseg = aktualsebesseg;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public abstract boolean gyorshajtottE(int sebessegkorlat);
    
    @Override
    public String toString(){
       return this.rendszam + " - " + this.aktualsebesseg + " km/h";
    }
}
