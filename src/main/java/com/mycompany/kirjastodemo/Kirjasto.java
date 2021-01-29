/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jani
 */
import java.util.HashMap;
import java.util.Iterator;

public class Kirjasto {

    //hashmap: taulukko avain - arvo, avaimena kirjan nimi, jolla haetaan arvo kirja
    final private HashMap<String, Kirja> kirjat;

    //konstruktori
    public Kirjasto() {
        //luodaan hashmap
        this.kirjat = new HashMap<>();
    }

    /* Ei voi olla kahta samaa key arvoa, jälkinmäinen lisätty korvaa ensimmäisen */
    public void lisaaKirja(Kirja kirja) {
        //avaimeksi kirjan nimi ja arvoksi kirja olio
        this.kirjat.put(kirja.getNimi(), kirja);

    }

    public void tulostaKaikkiKirjat() {
        //iteraattorilla hashmap läpi, tulostetaan kaikki arvot            
        Iterator osoitin = this.kirjat.entrySet().iterator();
            
        while (osoitin.hasNext()) {
            HashMap.Entry arvo = (HashMap.Entry) osoitin.next();
            System.out.println(arvo.getValue() + "\n");            
        }

    }

    void haeKirjaaNimellä(String kirjanNimi) {

        Kirja haettavaKirja = this.kirjat.get(kirjanNimi);

        if (haettavaKirja == null) {
            System.out.println("Ei ole");
        } else {
            System.out.println(haettavaKirja.toString());
        }

    }

}
