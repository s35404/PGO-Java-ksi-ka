
public class Main {


    public static void main(String[] args) {
        Ksiazka bloodMeridian=new Ksiazka("Blood Meridian", "Cormac Mccarthy", 350, true );
        bloodMeridian.printInfo();
        Ksiazka droga=new Ksiazka("Droga", "Cormac Mccarthy", 265, true );
        droga.printInfo();
        Ksiazka diuna=new Ksiazka("Diuna", "Frank Herbert", 750, false );
        diuna.printInfo();
        Czytelnik jonSnow=new Czytelnik("Jon", "Snow", 157, 3);
        jonSnow.printData();
        Czytelnik jonConnington=new Czytelnik("Jon", "Connington", 666, 13);
        jonConnington.printData();

        Biblioteka biblioteka = new Biblioteka(20);

        biblioteka.dodajKsiazke(new Ksiazka("Infinite and Divine", "Robert Rath", 368, false));
        biblioteka.dodajKsiazke(new Ksiazka("Lalka", "Bolesław Prus", 450,true));

        biblioteka.wypiszDostepneKsiazki();

        System.out.println("Liczba ksiazek: " + biblioteka.policzDostepneKsiazki());

        Ksiazka znaleziona = biblioteka.znajdzKsiazkePoTytule("Lalka");
        if (znaleziona != null) {
            System.out.println("Znaleziono");
            znaleziona.printInfo();
        } else {
            System.out.println("Nie znaleziono ksiazki");


        }
    }
}



