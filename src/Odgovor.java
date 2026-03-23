import java.util.Objects;

public class Odgovor implements Ocenjivo{

    private String odgovor;
    private Pitanje pitanje;

    public Odgovor( Pitanje pitanje, String odgovor) {
       this.pitanje=pitanje;
       this.odgovor=odgovor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Odgovor odgovor1 = (Odgovor) o;
        return Objects.equals(odgovor, odgovor1.odgovor) && Objects.equals(pitanje, odgovor1.pitanje);
    }

    @Override
    public String toString() {
        return "Pitanje: " + pitanje.getTekstPitanja() +
                "\nTip: " + pitanje.getClass().getSimpleName() +
                "\nOdgovor: " + odgovor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(odgovor, pitanje);
    }

    @Override
    public int oceni() {
        return pitanje.brojPoena(odgovor);
    }

    public String getOdgovor() {return odgovor;}

    public void setOdgovor(String odgovor) {this.odgovor = odgovor;}

    public Pitanje getPitanje() {return pitanje;}

    public void setPitanje(Pitanje pitanje) {this.pitanje = pitanje;}
}
