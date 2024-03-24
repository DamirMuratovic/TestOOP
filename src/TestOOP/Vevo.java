package TestOOP;

import java.util.ArrayList;

//Klasa TestOOP.Vevo nasledjuje klasu TestOOP.YouTubeKanal
public class Vevo extends YouTubeKanal {
    public Vevo(int brojPretplatnika, ArrayList<Video> listaVidea) {
        super(brojPretplatnika, listaVidea);
    }
}