package cwiczenie4;
import java.util.ArrayList;

public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }
    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }
    public void wypiszSkladZespolu() {
        System.out.println("\nSkład zespołu w projekcie: " + nazwaProjektu);
        for (Pracownik p : pracownicy) {
            System.out.println("- " + p.toString());
        }
        System.out.println();
    }
    public double policzLacznyKoszt() {
        double sumaKosztow = 0;
        for (Pracownik p : pracownicy) {
            sumaKosztow += p.obliczKosztPracownika();
        }
        return sumaKosztow;
    }
    public Pracownik znajdzPoId(String idPracownika) {
        for (Pracownik p : pracownicy) {
            if (p.pobierzIdPracownika().equals(idPracownika)) {
                return p;
            }
        }
        return null;
    }
    public void wypiszTesterowAutomatyzujacych() {
        System.out.println("Testerzy automatyzujący w projekcie " + nazwaProjektu + ":");
        for (Pracownik p : pracownicy) {
            if (p instanceof Tester) {
                Tester tester = (Tester) p;
                if (tester.isCzyAutomatyzujacy()) {
                    System.out.println(tester.getImie() + " " + tester.getNazwisko());
                }
            }
        }
    }
}