import java.util.ArrayList;
import java.util.List;

public class Ocenjivanje {

    private List<Ocenjivo> zaOcenjivanje = new ArrayList<>();
    private List<OpsegOcena> opsezi = new ArrayList<>();

    public void dodajOpseg(OpsegOcena novi) {

        for (OpsegOcena o : opsezi) {
            if (o.preklapaSe(novi)) {
                throw new IllegalArgumentException("Opsezi se preklapaju!");
            }
        }

        opsezi.add(novi);
    }

    public int odrediOcenu(int poeni) {

        for (OpsegOcena o : opsezi) {
            if (o.sadrzi(poeni)) {
                return o.getOcena();
            }
        }

        return 5; // fallback
    }

    public Ocenjivanje() {
    }


    public void dodaj(Ocenjivo a){
        zaOcenjivanje.add(a);
    }

    public void ispisRezultata(){

        for(Ocenjivo o : zaOcenjivanje){
            System.out.println("----------------");
            if( o instanceof Odgovor){
                Odgovor odg = (Odgovor) o;
                System.out.println(odg);
                System.out.println("Poena :" + odg.oceni());
            }else if ( o instanceof ResenjeTesta){
                ResenjeTesta rt = (ResenjeTesta) o;
                System.out.println(rt.toString(this));
            }
        }

    }



    public List<Ocenjivo> getZaOcenjivanje() {return zaOcenjivanje;}

    public void setZaOcenjivanje(List<Ocenjivo> zaOcenjivanje) {this.zaOcenjivanje = zaOcenjivanje;}
}
