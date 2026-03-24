public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWyporzyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWyporzyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWyporzyczen = liczbaWyporzyczen;
    }


    public void printData() {
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Numer karty: " + this.numerKarty);
        System.out.println("Liczba Wyporzyczeń: " + this.liczbaWyporzyczen);

    }

}