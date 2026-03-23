import java.util.ArrayList;
import java.util.List;

public class ResenjeTesta implements Ocenjivo{

    private String nazivTesta;
    private String kandidat;
    private List<Odgovor> odgovori = new ArrayList<>();
    private Ocenjivanje ocenjivanje;

    public ResenjeTesta(String nazivTesta, String kandidat) {
        this.nazivTesta = nazivTesta;
        this.kandidat = kandidat;
    }

    public void odgovori(Pitanje p,String tekst){
        odgovori.add(new Odgovor(p,tekst));
    }


    public int izracunajOcenu(Ocenjivanje o) {
        return o.odrediOcenu(oceni());
    }

    @Override
    public int oceni() {
        int suma = 0;
        for(Odgovor o : odgovori){
            suma += o.oceni();
        }
        return suma;
    }

    public String toString(Ocenjivanje o) {
        return "Test: " + nazivTesta +
                "\nKandidat: " + kandidat +
                "\nBroj odgovora: " + odgovori.size() +
                "\nPoena: " + oceni() +
                "\nOcena: " + izracunajOcenu(o);
    }

    public String getNazivTesta() {return nazivTesta;}

    public void setNazivTesta(String nazivTesta) {this.nazivTesta = nazivTesta;}

    public String getKandidat() {return kandidat;}

    public void setKandidat(String kandidat) {this.kandidat = kandidat;}

    public List<Odgovor> getOdgovori() {return odgovori;}

    public void setOdgovori(List<Odgovor> odgovori) {this.odgovori = odgovori;}
}
