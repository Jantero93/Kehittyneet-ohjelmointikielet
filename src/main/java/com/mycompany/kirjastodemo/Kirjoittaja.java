
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jani
 */
public class Kirjoittaja {
    private String nimi;
    private int ika;
    private String kansalaisuus;
        
    public Kirjoittaja(String nimi, int ika, String kansalaisuus) {
        this.nimi = nimi;
        this.ika = ika;
        this.kansalaisuus = kansalaisuus;
    }
    
    public Kirjoittaja (String nimi) {
        this.nimi = nimi;
        this.ika = -1;
        this.kansalaisuus = null;
    }
    

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getIka() {
        return this.ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public String getKansalaisuus() {
        return this.kansalaisuus;
    }

    public void setKansalaisuus(String kansalaisuus) {
        this.kansalaisuus = kansalaisuus;
    }    
 
    @Override
    public String toString() {
        return "Kirjoittaja: " + this.nimi + ", ika: " + this.ika + ", kansalaisuus: " + this.kansalaisuus;        
    }  
    
    
   
}
