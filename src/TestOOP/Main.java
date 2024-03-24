package TestOOP;

import TestOOP.BBPodcast;
import TestOOP.GejmingKanal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Pravljenje primera videa
        Video video1 = new Video("TestOOP.Video 1", 1500, 200);
        Video video2 = new Video("TestOOP.Video 2", 1200, 150);
        Video video3 = new Video("TestOOP.Video 3", 2000, 300);
        Video video4 = new Video("TestOOP.Video 4", 800, 450);
        Video video5 = new Video("TestOOP.Video 5", 2500, 80);
        Video video6 = new Video("TestOOP.Video 6", 3750, 625);

        // Pravljenje primera kanala
        ArrayList<Video> listaVidea1 = new ArrayList<>();
        listaVidea1.add(video1);
        listaVidea1.add(video2);

        ArrayList<Video> listaVidea3 = new ArrayList<>();
        listaVidea3.add(video5);
        listaVidea3.add(video6);

        YouTubeKanal kanal1 = new YouTubeKanal(5000, listaVidea1);

        ArrayList<Video> listaVidea2 = new ArrayList<>();
        listaVidea2.add(video3);

        GejmingKanal gejmingKanal = new GejmingKanal(80, listaVidea2);

        BBPodcast kanal4 = new BBPodcast(7500, listaVidea3);

        // Pravljenje instance TestOOP.YouTube
        ArrayList<YouTubeKanal> listaKanala = new ArrayList<>();
        listaKanala.add(kanal1);
        listaKanala.add(gejmingKanal);
        listaKanala.add(kanal4);

        YouTube youtube = new YouTube(listaKanala);

        // Testiranje metoda
        System.out.println("Najpopuarniji video: " + kanal4.najpopuarnijiVideo().getNaziv());
        System.out.println("Ukupan broj lajkova: " + kanal4.ukupnoSvidjanja());
        System.out.println("Zarada kanala: $ " + kanal1.zarada());

        System.out.println("Najprofitabilniji kanal: " + youtube.najprofitabilniji().getClass().getSimpleName());

        youtube.izbaciKanal();
        System.out.println("Nakon izbacivanja gejming kanala sa manje od 100 pretplatnika: " + youtube.getListaKanala().size() + " kanala");

        System.out.println("Pretraga kanala po imenu: " + youtube.search("TestOOP.Video 5"));

        // Sortiranje kanala po broju pretplatnika
        youtube.sort();
        System.out.println("Sortirani kanali po broju pretplatnika:");
        for (YouTubeKanal kanal : youtube.getListaKanala()) {
            System.out.println(kanal.getClass().getSimpleName() + " - " + kanal.getBrojPretplatnika() + " pretplatnika");
        }
    }
}