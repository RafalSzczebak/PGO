package cwiczenie2;

public class Czytelnik {

    private String imie;
    private String nazwisko;
    private String numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, String numerKarty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = 0;
    }

    public void wypiszDane() {
        System.out.println("Ćwiczenie2.Czytelnik: " + imie + " " + nazwisko +
                " | Nr karty: " + numerKarty +
                " | Liczba wypożyczeń: " + liczbaWypozyczen);
    }


    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
        System.out.println("Zwiększono liczbę wypożyczeń dla: " + imie + " " + nazwisko);
    }

    public void zmniejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0) {
            liczbaWypozyczen--;
            System.out.println("Zmniejszono liczbę wypożyczeń dla: " + imie + " " + nazwisko);
        } else {
            System.out.println("Błąd: Ćwiczenie2.Czytelnik " + imie + " " + nazwisko + " nie ma żadnych wypożyczonych książek.");
        }
    }
}


