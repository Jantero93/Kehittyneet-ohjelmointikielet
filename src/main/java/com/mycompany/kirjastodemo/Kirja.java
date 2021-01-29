
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

public class Kirja {
    
    final private String nimi;
    final private int sivumaara;
    final private Kirjoittaja kirjailija;
    
    
    public Kirja(String nimi, int sivumaara, Kirjoittaja kirjailija) {
        this.nimi = nimi;
        this.sivumaara= sivumaara;        
        this.kirjailija = kirjailija;
    }      
      
    public String getNimi() {
        return this.nimi;
    }

    public int getSivumaara() {
        return this.sivumaara;
    }

    public Kirjoittaja getKirjailija() {
        return this.kirjailija;
    }
    

    @Override
    public String toString() {
        //tulostetaan ensin kirjan tiedot ja kutsutaan kirjailijan toString metodia
        return "Kirja: " + this.nimi + ", sivumaara: " + this.sivumaara + '\n' +
                this.kirjailija;        
    }
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.kirjailija);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        // onko sama olio mihin verrataan
        if (this == obj) {
            return true;
        }
        //parametrina tullut olio null -> eri suuri
        if (obj == null) {
            return false;
        }
        //parametrina tulleella oliolla eri luokka -> eri suuri
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        final Kirja other = (Kirja) obj;
        //verrataan kirjan kirjoittajia
        return Objects.equals(this.kirjailija, other.kirjailija);
    }

    
    
}
