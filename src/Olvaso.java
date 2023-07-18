import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Olvaso {
    private String nev;
    private int olvasojegy;
    private List<String> preferaltMufajok = new ArrayList<>();
    private List<Kolcsonzes> kolcsonzottKonyvek = new ArrayList<>();

    public Olvaso(String nev, int olvasojegy) {
        this.nev = nev;
        this.olvasojegy = olvasojegy;
    }

    public void hozzaadPreferaltMufaj(String mufaj) {
        preferaltMufajok.add(mufaj);
    }

    public void kolcsonozKonyvet(Konyv konyv, Konyvtar konyvtar) {
        if (konyvtar.getKonyvek().contains(konyv) && konyv.getPeldanyszam() > 0) {
            this.kolcsonzottKonyvek.add(new Kolcsonzes(konyv, LocalDate.now()));
            konyv.setPeldanyszam(konyv.getPeldanyszam() - 1);
            System.out.println(this.nev + " kölcsönzött egy könyvet: " + konyv.getCim());
        } else {
            System.out.println("A(z) " + konyv.getCim() + " könyv jelenleg nem elérhető a könyvtárban.");
        }
    }

    public void visszaadKonyvet(Konyv konyv, Konyvtar konyvtar) {
        Kolcsonzes kolcsonzes = keresKolcsonzes(konyv);
        if (kolcsonzes != null) {
            this.kolcsonzottKonyvek.remove(kolcsonzes);
            konyv.setPeldanyszam(konyv.getPeldanyszam() + 1);
            System.out.println(this.nev + " visszaadott egy könyvet: " + konyv.getCim());
        } else {
            System.out.println(this.nev + " nem kölcsönzött ilyen könyvet: " + konyv.getCim());
        }
    }

    public Kolcsonzes keresKolcsonzes(Konyv konyv) {
        for (Kolcsonzes kolcsonzes : kolcsonzottKonyvek) {
            if (kolcsonzes.getKonyv().equals(konyv)) {
                return kolcsonzes;
            }
        }
        return null;
    }

    public long kolcsonzottNapok(Konyv konyv) {
        Kolcsonzes kolcsonzes = keresKolcsonzes(konyv);
        if (kolcsonzes != null) {
            LocalDate most = LocalDate.now();
            return ChronoUnit.DAYS.between(kolcsonzes.getKolcsonzesDatum(), most);
        }
        return -1; // Visszaadunk -1-et, ha az olvasó nem kölcsönözte még ki a könyvet
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
        List<Konyv> konyvek = new ArrayList<>();
        for (Kolcsonzes kolcsonzes : kolcsonzottKonyvek) {
            konyvek.add(kolcsonzes.getKonyv());
        }
        return konyvek;
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


