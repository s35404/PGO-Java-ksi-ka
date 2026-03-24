class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka nowaKsiazka) {
        if (this.liczbaKsiazek < this.ksiazki.length) {
            this.ksiazki[this.liczbaKsiazek] = nowaKsiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Brak miejsca w bibliotece");
        }
    }

    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < this.liczbaKsiazek; i++) {
            this.ksiazki[i].printInfo();
        }
    }


    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < this.liczbaKsiazek; i++) {
            if (this.ksiazki[i].getTytul().equals(tytul)) {
                return this.ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < this.liczbaKsiazek; i++) {
            if (this.ksiazki[i].czyDostepna()) {
                licznik++;
            }
        }
        return this.liczbaKsiazek;
    }
}