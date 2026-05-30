package cwiczenie4;

public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztPracownika() {
        double koszt = getStawkaBazowa();
        if (czyAutomatyzujacy) {
            koszt += 1500.0;
        }
        return koszt;
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " Pracuję jako tester " + (czyAutomatyzujacy ? "automatyzujący." : "manualny.");
    }

    public void uruchomRaportTestow() {
        System.out.println("Uruchamiam raport dla " + liczbaScenariuszy + " scenariuszy testowych...");
    }

    @Override
    public String toString() {
        return super.toString() + " - Tester (Automatyzacja: " + czyAutomatyzujacy + ")";
    }
}
