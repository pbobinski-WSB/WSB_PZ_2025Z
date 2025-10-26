package wsb.merito.pz.cw02.cwiczenia;

public class DrugaTestowa extends Testowa {

    private String nowePole = null;

    public DrugaTestowa() {
    }

    public DrugaTestowa(int liczba, String nazwa, String nowePole) {
        super(liczba, nazwa);
        this.nowePole = nowePole;
    }

    public DrugaTestowa(int liczba, String nazwa, boolean tak) {
        super(liczba, nazwa, tak);
    }

    @Override
    public String toString() {
        return "DrugaTestowa{} " + super.toString();
    }

    public String nowaMetoda() {
        return "jestem nową metodą";
    }

    public void wypisz () {
        System.out.println("Jestem Druga testowa");
    }
}
