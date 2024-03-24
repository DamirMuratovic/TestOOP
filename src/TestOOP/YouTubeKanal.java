package TestOOP;

import TestOOP.Video;

import java.util.ArrayList;

//Napraviti klasu TestOOP.YouTubeKanal koji od atributa ima broj ljudi koji su pretplaceni tom kanalu
// i listu videa.

public class YouTubeKanal {
    private int brojPretplatnika;
    private ArrayList<Video> listaVidea;

    public YouTubeKanal(int brojPretplatnika, ArrayList<Video> listaVidea) {
        this.brojPretplatnika = brojPretplatnika;
        this.listaVidea = listaVidea;
    }

    public String toString() {
        return brojPretplatnika + " " + listaVidea;
    }

    public int getBrojPretplatnika() {
        return brojPretplatnika;
    }

    public ArrayList<Video> getListaVidea() {
        return listaVidea;
    }

    public void setBrojPretplatnika(int noviBrojPretplatnika) {
        this.brojPretplatnika = noviBrojPretplatnika;
    }

    public void setListaVidea(ArrayList<Video> novaListaVidea) {
        this.listaVidea = novaListaVidea;
    }

    public Video najpopuarnijiVideo() {           //vraca video sa najvise pregleda
        int max = Integer.MIN_VALUE;
        Video x = null;
        for (Video v : listaVidea) {
            if (max < v.getBrojPregleda()) {
                max = v.getBrojPregleda();
                x = v;
            }
        }
        return x;
    }
    public int ukupnoSvidjanja(){                  //vraca ukupan broj lajkova sa svih Videa
        int ukupno = 0;
        for(Video v: listaVidea){
            ukupno += v.getBrojLajkova();
        }
        return ukupno;
    }
    public double zarada() {                 //vraca ukupnu zaradu kanala ako racunamo da zaradjuje 10 po lajku
        return ukupnoSvidjanja() * 10;
    }
}