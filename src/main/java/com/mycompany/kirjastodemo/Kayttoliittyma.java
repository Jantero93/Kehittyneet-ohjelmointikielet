
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jani
 */
public class Kayttoliittyma {
    private final Kirjasto kirjasto;
    private final Scanner lukija;

    public Kayttoliittyma(Scanner lukija, Kirjasto kirjasto) {
        this.lukija = lukija;
        this.kirjasto = kirjasto;
    }

    public void paavalikko() {
        while (true) {
            
            this.menuteksti();
            String valinta = this.lukija.nextLine();

            switch (valinta) {
                case "1":
                    this.kirjanJaKirjailijanLisays();
                    break;
                case "2":
                    this.haeKirjaaNimella();
                    break; 
                case "3":
                    this.kirjasto.tulostaKaikkiKirjat();
                case "4":
                    return;
                default:
                    break;
            }

        }

    }

    public void menuteksti() {
        System.out.println("Kirjasto appi");
        System.out.println("1. Lisää kirjailija ja kirja");
        System.out.println("2. Hae kirjan nimellä");
        System.out.println("3. Tulosta kaikki kirjat");
        System.out.println("4. Lopeta ohjelma");
    }

    public void kirjanJaKirjailijanLisays() {
        System.out.println("Kirjailijan nimi: ");
        String kirjailijanNimi = lukija.nextLine();
        
        System.out.println("Kirjailijan ika: ");
        int ika = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Kirjailijan kansalaisuus: ");
        String kansalaisuus = lukija.nextLine();
        
        
        System.out.println("Kirjan nimi: ");
        String kirjaNimi = lukija.nextLine();
        
        System.out.println("Sivumäärä: ");
        int sivumaara = Integer.valueOf(lukija.nextLine());
        
        Kirjoittaja kirjailija = new Kirjoittaja(kirjailijanNimi, ika, kansalaisuus);
        Kirja kirja = new Kirja (kirjaNimi, sivumaara, kirjailija);
        this.kirjasto.lisaaKirja(kirja);
    }
    
    public void haeKirjaaNimella() {
        System.out.println("Nimi jolla haetaan");
        String haettavaNimi = lukija.nextLine();
        this.kirjasto.haeKirjaaNimellä(haettavaNimi);
        //System.out.println(temp.toString());        
    }
}
