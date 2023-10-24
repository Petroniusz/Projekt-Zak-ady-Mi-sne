public class Pracownicy {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String stanowisko;
    private String numertel;

    public Pracownicy(String imie, String nazwisko, int wiek, String stanowisko, String numertel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
        this.numertel = numertel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public String getNumertel() {
        return numertel;
    }

    public void setNumertel(String numertel) {
        this.numertel = numertel;
    }
}
