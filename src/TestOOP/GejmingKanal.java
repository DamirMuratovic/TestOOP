package TestOOP;

import java.util.ArrayList;

//Klasa TestOOP.GejmingKanal nasledjuje TestOOP.YouTubeKanal i zaradjuje 100 od videa koji imaju vise od 1000 pregleda.
public class GejmingKanal extends YouTubeKanal {
    public GejmingKanal(int brojPretplatnika, ArrayList<Video> listaVidea) {
        super(brojPretplatnika, listaVidea);
    }
    @Override
    public double zarada() {                    //zaradjuje 100 od videa koji imaju vise od 1000 pregleda
        double suma = 0;
        for(Video v: getListaVidea()){
            if(v.getBrojPregleda() > 1000){
                suma += 100;
            }
        }
        return suma;
    }
}