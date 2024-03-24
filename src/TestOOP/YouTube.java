package TestOOP;

import TestOOP.GejmingKanal;
import TestOOP.Video;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Klasa TestOOP.YouTube ima listu kanala i ima metode:

public class YouTube {
    private ArrayList<YouTubeKanal> listaKanala;

    public YouTube(ArrayList<YouTubeKanal> listaKanala) {
        this.listaKanala = listaKanala;
    }

    public String toString() {
        return "" + listaKanala;
    }

    public ArrayList<YouTubeKanal> getListaKanala() {
        return listaKanala;
    }

    public void setListaKanala(ArrayList<YouTubeKanal> novaListaKanala) {
        this.listaKanala = novaListaKanala;
    }

    public YouTubeKanal najprofitabilniji() {           //vraca TestOOP.YouTube kanal koji zaradjuje najvise para
        double max = Double.MIN_VALUE;
        YouTubeKanal a = null;
        for (YouTubeKanal k : listaKanala) {
            if (max < k.zarada()) {
                max = k.zarada();
                a = k;
            }
        }
        return a;
    }

    public void izbaciKanal() {             //ukoliko neki gejming kanal ima manje od 100 pretplacenih
        int index = 0;                      //korisnika na tom kanalu, izbaciti ga.
        for (int i = 0; i < listaKanala.size(); i++) {
            if (listaKanala.get(i) instanceof GejmingKanal && listaKanala.get(i).getBrojPretplatnika() < 100) {
                index = i;
                listaKanala.remove(index);
                i--;
            }
        }
        setListaKanala(listaKanala);
    }
    public Video search(String naziv){           //za prosledjeni naziv vraca odredjeni video
        Video x = null;
        for(YouTubeKanal k: listaKanala){
            for(Video v: k.getListaVidea()){
                if(v.getNaziv().equalsIgnoreCase(naziv)){
                    x = v;
                }
            }
        }
        return x;
    }
    public void sort() {            //napraviti metodu koja sortira kanale po broju pretplatnika
    ArrayList<YouTubeKanal> lista = listaKanala;
    Comparator<YouTubeKanal> c = Comparator.comparing(YouTubeKanal::getBrojPretplatnika);
    Collections.sort(lista, c);
    }
}