package wsb.merito.pz.cw02.cwiczenia;

public class Test {


    public static void main(String[] args) throws Exception {

        System.out.println("Start");

        System.out.println(args);
        for (String s : args) {
            System.out.println(s);
        }

        Testowa testowa = new Testowa();

        testowa.setNazwa("qadsdsdsz");

        System.out.println(testowa);


        Testowa testowa1 = new Testowa(12,"dwanascie");
        Testowa testowa2 = new Testowa(12,"dwanascie");

        System.out.println(testowa1 == testowa2);

        int a = 12;
        int b = 12;

        System.out.println(a == b);

        System.out.println(testowa1.equals(testowa2));

        DrugaTestowa drugaTestowa = new DrugaTestowa();

        Testowa innaReferencja = new DrugaTestowa();

        Testowa jeszczeInna = new Testowa();

        System.out.println(drugaTestowa);
        System.out.println(innaReferencja);

        if (innaReferencja instanceof DrugaTestowa) {
            System.out.println(((DrugaTestowa) innaReferencja).nowaMetoda());

        }

        drugaTestowa.wypisz();
        innaReferencja.wypisz();
        jeszczeInna.wypisz();
    }

}

