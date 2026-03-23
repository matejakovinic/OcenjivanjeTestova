import java.util.ArrayList;
import java.util.List;


public class PitanjeSpajanje extends Pitanje {

    private List<String> levaKolona = new ArrayList<>();
    private List<String> desnaKolona = new ArrayList<>();
    private List<String> tacniOdgovori = new ArrayList<>();


    public PitanjeSpajanje(String tekstPitanja, int brojPoena) {
        super(tekstPitanja, brojPoena);
    }

    public void dodajPar(String levo,String desno){
        levaKolona.add(levo);
        tacniOdgovori.add(desno);
    }


    @Override
    public int brojPoena(String odgovor) {
        String[] parovi = odgovor.split(",");
        int poeni = 0;

        for(String p : parovi){
            String [] split = p.split("-");
            if(split.length !=2) continue;

            String levo = split[0].trim();
            String desno = split[1].trim();

            int index = levaKolona.indexOf(levo);

            if(index != -1){
                if(tacniOdgovori.get(index).equals(desno)){
                    poeni++;
                }
            }
        } return Math.min(poeni,getBrojPoena());
    }
}


