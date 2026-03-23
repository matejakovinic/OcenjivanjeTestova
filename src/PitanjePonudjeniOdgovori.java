import java.util.ArrayList;
import java.util.List;

public class PitanjePonudjeniOdgovori extends Pitanje{


    private List<String> ponudjeniOdgovori = new ArrayList<>();
    private List<Integer> indeksiTacnih = new ArrayList<>();

    public PitanjePonudjeniOdgovori(String tekstPitanja) {
        super(tekstPitanja);
    }

    public void dodajPonudjeniOdgovor(String tekst, boolean tacan){

        if(tacan && indeksiTacnih.size() >= getBrojPoena()) return;
        ponudjeniOdgovori.add(tekst);
        if(tacan){
            indeksiTacnih.add(ponudjeniOdgovori.size() - 1);
        }
    }

    @Override
    public int brojPoena(String odgovor) {
    String[] odgovori = odgovor.split(",");
    int poeni = 0;

    for(String o : odgovori){
        o = o.trim();
        int index = ponudjeniOdgovori.indexOf(o);
        if(index != -1 && indeksiTacnih.contains(index)){
            poeni++;
        }
    }
            return poeni;
        }



    public List<String> getPonudjeniOdgovori() {return ponudjeniOdgovori;}

    public void setPonudjeniOdgovori(List<String> ponudjeniOdgovori) {this.ponudjeniOdgovori = ponudjeniOdgovori;}

    public List<Integer> getIndeksiTacnih() {return indeksiTacnih;}

    public void setIndeksiTacnih(List<Integer> indeksiTacnih) {this.indeksiTacnih = indeksiTacnih;}
}
