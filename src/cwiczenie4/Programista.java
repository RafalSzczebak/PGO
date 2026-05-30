package cwiczenie4;

public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztPracownika() {
        return getStawkaBazowa() + (liczbaRepozytoriow * 100.0);
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " Pracuję jako programista " + glownyJezyk + ".";
    }

    public void wypiszTechnologie() {
        System.out.println("Główna technologia: " + glownyJezyk + ", Repozytoria: " + liczbaRepozytoriow);
    }

    @Override
    public String toString() {
        return super.toString() + " - Programista (" + glownyJezyk + ")";
    }
}