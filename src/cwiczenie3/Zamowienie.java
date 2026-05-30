package cwiczenie3;
import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;

    public Zamowienie(KlientKawiarni klient) {
        this.numerZamowienia = pobierzKolejnyNumer();
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }

    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);
    }

    public double policzWartosc() {
        double suma = 0;
        for (ProduktMenu p : produkty) {
            suma += p.getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    public void oznaczJakoOplacone() {
        this.oplacone = true;
    }

    public static int pobierzKolejnyNumer() {
        return kolejnyNumer++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zamówienie nr ").append(numerZamowienia).append("\n");
        sb.append("Klient: ").append(klient.toString()).append("\n");
        sb.append("Status opłacenia: ").append(oplacone).append("\n");
        sb.append("Produkty:\n");
        for (ProduktMenu p : produkty) {
            sb.append("- ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}