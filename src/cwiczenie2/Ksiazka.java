package cwiczenie2;

public class Ksiazka {

    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytuł: " + tytul +
                " | Autor: " + autor +
                " | Liczba stron: " + liczbaStron +
                " | Dostępna: " + (dostepna ? "Tak" : "Nie"));
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Pomyślnie wypożyczono książkę: " + tytul);
        } else {
            System.out.println("Niestety, książka '" + tytul + "' jest już wypożyczona.");
        }
    }

    public void zwroc() {
        if (!dostepna) {
            dostepna = true;
            System.out.println("Pomyślnie zwrócono książkę: " + tytul);
        } else {
            System.out.println("Książka '" + tytul + "' nie była wypożyczona (jest dostępna).");
        }
    }
    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}
