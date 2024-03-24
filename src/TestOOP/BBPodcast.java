package TestOOP;

import java.util.ArrayList;

//Klasa TestOOP.BBPodcast nasledjuje klasu TestOOP.YouTubeKanal i oni dobijaju 15% bonus na svoju zaradu.
public class BBPodcast extends YouTubeKanal {
    public BBPodcast(int brojPretplatnika, ArrayList<Video> listaVidea) {
        super(brojPretplatnika, listaVidea);
    }
    @Override
    public double zarada() {          //vraca ukupnu zaradu kanala ako racunamo da zaradjuje 10 po lajku
        return (ukupnoSvidjanja() * 10) * 1.15;    //oni dobijaju 15% bonus na svoju zaradu
    }
}