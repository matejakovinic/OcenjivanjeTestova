import java.util.Objects;

public abstract class Pitanje {

    private String tekstPitanja;
    private int brojPoena;

    public Pitanje(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public Pitanje(String tekstPitanja, int brojPoena) {
        this.tekstPitanja = tekstPitanja;
        this.brojPoena = brojPoena;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pitanje pitanje = (Pitanje) o;
        return brojPoena == pitanje.brojPoena && Objects.equals(tekstPitanja, pitanje.tekstPitanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tekstPitanja, brojPoena);
    }

    public abstract int brojPoena (String a);


    public String getTekstPitanja() {return tekstPitanja;}

    public void setTekstPitanja(String tekstPitanja) {this.tekstPitanja = tekstPitanja;}

    public int getBrojPoena() {return brojPoena;}

    public void setBrojPoena(int brojPoena) {this.brojPoena = brojPoena;}
}
