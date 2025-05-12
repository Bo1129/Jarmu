/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_dolgozat_bb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;


/**
 *
 * @author bohmb
 */
public class OOP_Dolgozat_BB {

     public static ArrayList<Jarmu> jarmuvek = new ArrayList<Jarmu>();
             
    public static void main(String[] args) {
        jarmuvekJonnek("adatok.txt");
      
    }
    
    public static void jarmuvekJonnek(String eleresiut){
    
           try{
            BufferedReader reader = new BufferedReader(new FileReader(eleresUt));
            String sor;
            while((sor = reader.readLine()) != null){
                String[] db = sor.split(" ");
                if(db[0].equals("robogo")){
                    String rendszam = db[1];
                    int aktualissebesseg = Integer.parseInt(db[2]);
                    int maximumsebesseg = Integer.parseInt(db[3]);
                    Robogo r = new Robogo(rendszam, aktualissebesseg, maximumsebesseg);
                    jarmuvek.add(r);
                    
                }
                else if(db[0].equals("audi")){
                   String rendszam = db[1];
                    int aktualissebesseg = Integer.parseInt(db[2]);
                    int maximumsebesseg = Integer.parseInt(db[3]);
                    boolean lezerblokkolo = Boolean.parseBoolean(db[4]);
                    AudiS8 a = new AudiS8(rendszam, aktualissebesseg, maximumsebesseg, lezerblokkolo);
                    jarmuvek.add(a);
                }
            }
            }
            catch (IOException ex) {
            System.out.println("Hiba történt: " + ex.getMessage());
         }
         }    
       
    
    public static void kiketMertunkBe(){
     for(Robogo r : jarmuvek){
         try {
      FileWriter ujfajl = new FileWriter("buntetes.txt");
      ujfajl.write("Robogó: " + rendszam + aktualissebesseg + maximumsebesseg);
      ujfajl.close();
    } catch (IOException e) {
      System.out.println("Hiba");

       }
       for(AudiS8 a : jarmuvek){
         try {
      FileWriter ujfajl = new FileWriter("buntetes.txt");
      ujfajl.write("Audi: " + rendszam + aktualissebesseg + maximumsebesseg + lezerblokkolo);
      ujfajl.close();
    } catch (IOException e) {
      System.out.println("Hiba");
    }
}
