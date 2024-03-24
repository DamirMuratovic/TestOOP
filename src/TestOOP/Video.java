package TestOOP;

//Napraviti klasu TestOOP.Video koja ima atribute za naziv, broj pregleda i broj lajkova.
public class Video {
    private String naziv;
    private int brojPregleda;
    private int brojLajkova;
    public Video (String naziv, int brojPregleda, int brojLajkova){
        this.naziv = naziv;
        this.brojPregleda = brojPregleda;
        this.brojLajkova = brojLajkova;
    }
    public String toString(){
        return naziv + " " + brojPregleda + " " + brojLajkova;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String noviNaziv) {
        this.naziv = noviNaziv;
    }
    public int getBrojPregleda() {
        return brojPregleda;
    }
    public void setBrojPregleda(int noviBrojPregleda) {
        this.brojPregleda = noviBrojPregleda;
    }
    public int getBrojLajkova() {
        return brojLajkova;
    }
    public void setBrojLajkova(int noviBrojLajkova) {
        this.brojLajkova = noviBrojLajkova;
    }
}