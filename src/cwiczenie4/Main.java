package cwiczenie4;

public class Main {
    public static void main(String[] args) {
        ZespolProjektowy zespol = new ZespolProjektowy("Campus App");

        Pracownik p1 = new Programista("P-101", "Anna", "Maj", 12000.0, "Java", 4);
        Pracownik p2 = new Tester("T-201", "Piotr", "Kot", 8000.0, true, 21);
        Pracownik p3 = new Programista("P-102", "Karol", "Wojcik", 11500.0, "Kotlin", 3);

        zespol.dodajPracownika(p1);
        zespol.dodajPracownika(p2);
        zespol.dodajPracownika(p3);

        zespol.wypiszSkladZespolu();
        System.out.println("Łączny koszt zespołu: " + zespol.policzLacznyKoszt());
        System.out.println(p1.przedstawSie());
        System.out.println(p2.przedstawSie());

        if (p1 instanceof Programista) {
            Programista programista = (Programista) p1;
            programista.wypiszTechnologie();
        }
        System.out.println(p2.equals(new Tester("T-201", "Inny", "Inny", 8000.0, false, 10)));
        System.out.println(p2);
    }
}