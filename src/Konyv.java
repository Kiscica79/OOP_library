import java.util.ArrayList;
import java.util.List;


public class Konyv {

    private String cim;
    private int kiadasiEv;
    private String mufaj;
    private int peldanyszam;
    private List<String> irok = new ArrayList<>();

    public Konyv(String cim, int kiadasiEv, String mufaj, int peldanyszam) {
        this.cim = cim;
        this.kiadasiEv = kiadasiEv;
        this.mufaj = mufaj;
        this.peldanyszam = peldanyszam;
    }

    public void hozzaadIro(String iroNev) {
        irok.add(iroNev);
    }

    public String getCim() {
        return cim;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public String getMufaj() {
        return mufaj;
    }

    public List<String> getIrok() {
        return irok;
    }

    public int getPeldanyszam() {
        return peldanyszam;
    }

    public void setPeldanyszam(int peldanyszam) {
        this.peldanyszam = peldanyszam;
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", kiadasiEv=" + kiadasiEv +
                ", mufaj='" + mufaj + '\'' +
                ", irok=" + irok +
                '}';
    }
}






