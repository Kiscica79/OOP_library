import java.time.LocalDate;

public class Kolcsonzes {

    private Konyv konyv;

    private LocalDate kolcsonzesDatum;

    public Kolcsonzes(Konyv konyv, LocalDate kolcsonzesDatum) {
        this.konyv = konyv;
        this.kolcsonzesDatum = kolcsonzesDatum;
    }

    public Konyv getKonyv() {
        return konyv;
    }

    public LocalDate getKolcsonzesDatum() {
        return kolcsonzesDatum;
    }



}
