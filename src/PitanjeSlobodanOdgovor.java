import java.util.ArrayList;
import java.util.List;

public class PitanjeSlobodanOdgovor extends Pitanje{

    private List<String> kljucneReci = new ArrayList<>();

    public PitanjeSlobodanOdgovor(String tekstPitanja) {
        super(tekstPitanja);
    }

    @Override
    public int brojPoena(String odgovor) {
        int poeni = 0;
        for(String kljucna : kljucneReci){
            if(odgovor.toLowerCase().contains(kljucna.toLowerCase())){
                poeni++;
            }
        }
        return poeni;
    }

    public List<String> getKljucneReci() {return kljucneReci;}

    public void setKljucneReci(List<String> kljucneReci) {
        if(kljucneReci.size() != getBrojPoena()) return;
        this.kljucneReci=kljucneReci;
    }

}
