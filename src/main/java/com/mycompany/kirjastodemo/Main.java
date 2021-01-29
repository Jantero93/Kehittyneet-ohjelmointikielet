/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jani
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Kirjoittaja pena = new Kirjoittaja("Tapani Aalto", 22, "Suomalainen");
        Kirjoittaja matti = new Kirjoittaja("Matti Rautavaara", 33, "Suomalainen");
        Kirjoittaja jean_free = new Kirjoittaja("Jéan Blebeou", 65, "Ranskalainen");

        
        Kirja raamattu = new Kirja("raamattu", 222, pena);
        Kirja romaani = new Kirja("kokenut konkari", 965, pena);
        Kirja koulukirja = new Kirja("koulukirja", 123, pena);
        Kirja kirja2 = new Kirja("abc-kirja", 321, matti);
        Kirja kirja3 = new Kirja("Kuvakokoelma", 12, jean_free);

        Kirjasto pääkirjasto = new Kirjasto();
        pääkirjasto.lisaaKirja(raamattu);
        pääkirjasto.lisaaKirja(kirja3);
        pääkirjasto.lisaaKirja(kirja2);
        pääkirjasto.lisaaKirja(koulukirja);
        pääkirjasto.lisaaKirja(romaani);

        System.out.println("Printtaa kirjoittaja, jolla on toString kuormitettu:");
        System.out.println(pena);
        System.out.println("Printtaa käyttöliittymä, jolla ei ole toString kuormitettu");
        System.out.println(pääkirjasto);

        System.out.println("Onko sama kirjoittaja kirjalla:");
        if (raamattu.equals(romaani)) {
            /* romaani */
            System.out.println("Sama kirjoittaja!");
        } else {
            System.out.println("Eri kirjoittaja...");
        }

        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija, pääkirjasto);
        //kayttoliittyma.paavalikko();

        /*
        ArrayList<Kirja> kirjaLista = new ArrayList<>();
        kirjaLista.add(raamattu);
        kirjaLista.add(koulukirja);
        kirjaLista.add(romaani);
         */
 /*
        if (kirjaLista.contains(raamattu)) {
            System.out.println("Listasta löytyi kyseinen kirja");
        } else {
            System.out.println("Kirjaa ei löytynyt listasta");
        }
         */
        // pääkirjasto.tulostaKaikkiKirjat();
    }
}
