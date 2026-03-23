public class OpsegOcena {

    private int min;
    private int max;
    private int ocena;

    public OpsegOcena(int min, int max, int ocena) {
        this.min = min;
        this.max = max;
        this.ocena = ocena;
    }

    public boolean sadrzi(int poeni) {
        return poeni >= min && poeni <= max;
    }

    public boolean preklapaSe(OpsegOcena o) {
        return !(this.max < o.min || this.min > o.max);
    }

    public int getOcena() {
        return ocena;
    }
}

