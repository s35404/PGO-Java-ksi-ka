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


    public void printInfo() {
        System.out.println("Tytul: " + this.imie);
        System.out.println("Autor: " + this.nazwisko);
        System.out.println("Liczba Stron: " + this.numerKarty);
        System.out.println("Dostępna: " + this.liczbaWyporzyczen);

    }

}