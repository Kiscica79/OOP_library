import java.util.List;

public class Olvaso {
    private String nev;
    private int olvasojegy;
    private List<String> preferaltMufajok;

    public Olvaso(String nev, int olvasojegy) {
        this.nev = nev;
        this.olvasojegy = olvasojegy;
    }

    public void hozzaadPreferaltMufaj(String mufaj) {
        preferaltMufajok.add(mufaj);
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

    @Override
    public String toString() {
        return "Olvaso{" +
                "nev='" + nev + '\'' +
                ", olvasojegy=" + olvasojegy +
                ", preferaltMufajok=" + preferaltMufajok +
                '}';
    }
}


