import java.util.ArrayList;
import java.util.List;

public class Olvaso {
    private String nev;
    private int olvasojegy;
    private List<String> preferaltMufajok = new ArrayList<>();
    private List<Konyv> kolcsonzottKonyvek = new ArrayList<>();

    public Olvaso(String nev, int olvasojegy) {
        this.nev = nev;
        this.olvasojegy = olvasojegy;
    }

    public void hozzaadPreferaltMufaj(String mufaj) {
        preferaltMufajok.add(mufaj);
    }

    public void kolcsonozKonyvet(Konyv konyv, Konyvtar konyvtar) {
        if (konyvtar.getKonyvek().contains(konyv) && konyv.getPeldanyszam() > 0) {
            this.kolcsonzottKonyvek.add(konyv);
            konyv.setPeldanyszam(konyv.getPeldanyszam() - 1);
            System.out.println(this.nev + " kölcsönzött egy könyvet: " + konyv.getCim());
        } else {
            System.out.println("A(z) " + konyv.getCim() + " könyv jelenleg nem elérhető a könyvtárban.");
        }
    }

    public void visszaadKonyvet(Konyv konyv, Konyvtar konyvtar) {
        if (this.kolcsonzottKonyvek.contains(konyv)) {
            this.kolcsonzottKonyvek.remove(konyv);
            konyv.setPeldanyszam(konyv.getPeldanyszam() + 1);
            System.out.println(this.nev + " visszaadott egy könyvet: " + konyv.getCim());
        } else {
            System.out.println(this.nev + " nem kölcsönzött ilyen könyvet: " + konyv.getCim());
        }
    }


    public String getNev() {
        return nev;
    }

    public int getOlvasojegy() {
        return olvasojegy;
    }

    public List<String> getPreferaltMufajok() {
        return preferaltMufajok;
    }

    public List<Konyv> getKolcsonzottKonyvek() {
        return kolcsonzottKonyvek;
    }

    @Override
    public String toString() {
        return "Olvaso{" +
                "nev='" + nev + '\'' +
                ", olvasojegy=" + olvasojegy +
                ", preferaltMufajok=" + preferaltMufajok +
                '}';
    }
}


