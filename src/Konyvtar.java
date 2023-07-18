import java.util.ArrayList;
import java.util.List;

public class Konyvtar {


    private List<Konyv> konyvek;
    private List<Olvaso> olvasok;

    public Konyvtar() {
        this.konyvek = new ArrayList<>();
        this.olvasok = new ArrayList<>();
    }

    public void konyvetHozzaad(Konyv konyv) {
        konyvek.add(konyv);
    }

    public void olvasotHozzaad(Olvaso olvaso) {
        olvasok.add(olvaso);
    }

    public List<Konyv> getKonyvek() {
        return konyvek;
    }

    public List<Olvaso> getOlvasok() {
        return olvasok;
    }

    @Override
    public String toString() {
        return "Konyvtar{" +
                "konyvek=" + konyvek +
                ", olvasok=" + olvasok +
                '}';
    }
}

