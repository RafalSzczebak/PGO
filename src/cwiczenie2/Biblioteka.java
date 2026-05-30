package cwiczenie2;

public class Biblioteka {


    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;


    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }


    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Dodano do biblioteki: " + ksiazka.getTytul());
        } else {
            System.out.println("Brak miejsca w bibliotece na nową książkę!");
        }
    }


    public void wypiszDostepneKsiazki() {
        System.out.println("\n--- DOSTĘPNE KSIĄŻKI ---");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }


    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }


    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }
        return licznik;
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        System.out.println("\n[Próba wypożyczenia: '" + tytul + "']");
        Ksiazka znaleziona = znajdzKsiazkePoTytule(tytul);

        if (znaleziona != null) {
            if (znaleziona.isDostepna()) {
                znaleziona.wypozycz();
                czytelnik.zwiekszLiczbeWypozyczen();
            } else {
                System.out.println("Książka jest obecnie wypożyczona.");
            }
        } else {
            System.out.println("Nie znaleziono książki o takim tytule w bibliotece.");
        }
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        System.out.println("\n[Próba zwrotu: '" + tytul + "']");
        Ksiazka znaleziona = znajdzKsiazkePoTytule(tytul);

        if (znaleziona != null) {
            if (!znaleziona.isDostepna()) {
                znaleziona.zwroc();
                czytelnik.zmniejszLiczbeWypozyczen();
            } else {
                System.out.println("Książka nie była wypożyczona (jest dostępna).");
            }
        } else {
            System.out.println("Nie znaleziono książki o takim tytule w bibliotece.");
        }
    }
}
