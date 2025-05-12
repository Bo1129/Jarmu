/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_dolgozat_bb;

/**
 *
 * @author bohmb
 */
public class AudiS8 extends Jarmu{
    
    public boolean lezerblokkolo;
    
    public AudiS8(int aktualsebesseg, String rendszam, boolean lezerblokkolo){
        super(aktualsebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }
    
    public boolean isLezerblokkolo() {
        return lezerblokkolo;
    }

    public void setLezerblokkolo(boolean lezerblokkolo) {
        this.lezerblokkolo = lezerblokkolo;
    }
    @Override
    public boolean gyorshajtottE(int sebessegkorlat){
       if(this.aktualsebesseg > sebessegkorlat){
          if(this.lezerblokkolo == true){
          return false;
          }
          else{
          return true;
          }
       }
       else{
        return false;
       }
    }
    
    @Override
    public String toString(){
       return "Audi: " + super.toString();
    }
}
