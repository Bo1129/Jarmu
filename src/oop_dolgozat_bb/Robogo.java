/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_dolgozat_bb;

/**
 *
 * @author bohmb
 */
public class Robogo extends Jarmu implements IKisGepjarmu{

    public int max_sebesseg;
    
    public Robogo(int aktualsebesseg, String rendszam, int max_sebesseg){
        super(aktualsebesseg, rendszam);
        this.max_sebesseg = max_sebesseg;
    }
    
      public int getMax_sebesseg() {
        return max_sebesseg;
    }

    public void setMax_sebesseg(int max_sebesseg) {
        this.max_sebesseg = max_sebesseg;
    }
    
    
    @Override
    public boolean gyorshajtottE(int sebessegkorlat){
       if(this.aktualsebesseg > sebessegkorlat){
       return true;
       }
       else{
        return false;
       }
    }
    
    @Override
    public boolean haladhatItt(int sebesseg){
      if(this.max_sebesseg > sebesseg){
      return false;
      }
      else{
      return true;
      }
    }
    
    @Override
    public String toString(){
       return "Robogó: " + super.toString();
    }
}
