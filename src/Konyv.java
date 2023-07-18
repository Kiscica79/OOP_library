import java.util.List;


public class Konyv {

    private String cim;
    private int kiadasiEv;
    private String mufaj;
    private List<String> irok;

    public Konyv(String cim, int kiadasiEv, String mufaj) {
        this.cim = cim;
        this.kiadasiEv = kiadasiEv;
        this.mufaj = mufaj;
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






