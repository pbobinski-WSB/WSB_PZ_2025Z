package wsb.merito.pz.cw02.cwiczenia;

import java.util.Objects;

public class Testowa extends Object{

    private int liczba = 0;

    private String nazwa = null;

    public Testowa() {
    }

    public Testowa(int liczba, String nazwa) {
        this.liczba = liczba;
        this.nazwa = nazwa;
    }

    public Testowa(int liczba, String nazwa, boolean tak) {
        this(liczba, nazwa);
        this.tak = tak;
    }

    public boolean isTak() {
        return tak;
    }

    public void setTak(boolean tak) {
        this.tak = tak;
    }

    boolean tak = false;

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) throws Exception{
        if (nazwa.length() < 5) {
            throw new Exception("za mało znaków");
        }
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Testowa{" +
                "liczba=" + liczba +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Testowa testowa)) return false;
        return getLiczba() == testowa.getLiczba() && isTak() == testowa.isTak() && Objects.equals(getNazwa(), testowa.getNazwa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLiczba(), getNazwa(), isTak());
    }

    public void wypisz () {
        System.out.println("Jestem testowa");
    }
}
