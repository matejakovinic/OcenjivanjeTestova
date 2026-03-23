import java.util.*;
public class Main {
            public static void main(String[] args) {

                Ocenjivanje ocenjivanje = new Ocenjivanje();

                ocenjivanje.dodajOpseg(new OpsegOcena(0, 2, 5));
                ocenjivanje.dodajOpseg(new OpsegOcena(3, 4, 6));
                ocenjivanje.dodajOpseg(new OpsegOcena(5, 6, 7));

                PitanjePonudjeniOdgovori p1 = new PitanjePonudjeniOdgovori("Glavni grad Srbije?");
                p1.setBrojPoena(1);
                p1.dodajPonudjeniOdgovor("Beograd", true);
                p1.dodajPonudjeniOdgovor("Novi Sad", false);

                PitanjePonudjeniOdgovori p2 = new PitanjePonudjeniOdgovori("2+2?");
                p2.setBrojPoena(1);
                p2.dodajPonudjeniOdgovor("4", true);
                p2.dodajPonudjeniOdgovor("5", false);

                PitanjeSlobodanOdgovor p3 = new PitanjeSlobodanOdgovor("Programski jezik?");
                p3.setBrojPoena(2);
                p3.setKljucneReci(List.of("java", "python"));

                PitanjeSlobodanOdgovor p4 = new PitanjeSlobodanOdgovor("Boje?");
                p4.setBrojPoena(2);
                p4.setKljucneReci(List.of("crvena", "plava"));

                PitanjeSpajanje p5 = new PitanjeSpajanje("Spoji:", 3);
                p5.dodajPar("A", "1");
                p5.dodajPar("B", "2");
                p5.dodajPar("C", "3");

                PitanjeSpajanje p6 = new PitanjeSpajanje("Spoji2:", 2);
                p6.dodajPar("X", "10");
                p6.dodajPar("Y", "20");

                ResenjeTesta rt = new ResenjeTesta("Test1", "Mateja");

                rt.odgovori(p1, "Beograd");
                rt.odgovori(p2, "4");
                rt.odgovori(p3, "Java i Python");
                rt.odgovori(p4, "crvena");
                rt.odgovori(p5, "A-1,B-2,C-3");

                Odgovor o1 = new Odgovor(p6, "X-10");

                ocenjivanje.dodaj(rt);
                ocenjivanje.dodaj(o1);


                ocenjivanje.ispisRezultata();
            }
        }




