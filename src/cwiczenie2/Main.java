package cwiczenie2;

public class Main {
    public static void main(String[] args) {


        Biblioteka biblioteka = new Biblioteka(5);


        Ksiazka k1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 332, true);
        Ksiazka k2 = new Ksiazka("Diuna", "Frank Herbert", 650, true);
        Ksiazka k3 = new Ksiazka("Rok 1984", "George Orwell", 328, true);

        Czytelnik czytelnik = new Czytelnik("Jan", "Kowalski", "CZYT-001");

        System.out.println("--- INICJALIZACJA BIBLIOTEKI ---");
        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);

        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostępnych książek: " + biblioteka.policzDostepneKsiazki());

        biblioteka.wypozyczKsiazke("Diuna", czytelnik);
        czytelnik.wypiszDane();

        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostępnych książek po wypożyczeniu: " + biblioteka.policzDostepneKsiazki());

        biblioteka.wypozyczKsiazke("Diuna", czytelnik);

        biblioteka.zwrocKsiazke("Diuna", czytelnik);
        czytelnik.wypiszDane();

        biblioteka.wypiszDostepneKsiazki();
    }
}