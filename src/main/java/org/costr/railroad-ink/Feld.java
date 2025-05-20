public class Feld {

    private int id;
    private String name;

    public static final int ANZ_FELDER = 9;

    Feld Feld(int index) {
        return (switch (index) {
            case 0 -> ZugKurve();
            case 1 -> ZugKreuzung();
            case 2 -> ZugGerade();
            case 3 -> StraßeKurve();
            case 4 -> StraßeKreuzung();
            case 5 -> StraßeGerade();
            case 6 -> StraßeMitBrücke();
            case 7 -> BahnhofGerade();
            case 8 -> BahnhofKurve();
            default -> throw new IllegalArgumentException("Invalid index: " + index);
        });
    }

    private Feld ZugKurve() {
        Feld feld = new Feld();
        feld.id = 0;
        feld.name = "ZugKurve";
        return feld;
    }

    private Feld ZugKreuzung() {
        Feld feld = new Feld();
        feld.id = 1;
        feld.name = "ZugKreuzung";
        return feld;
    }

    private Feld ZugGerade() {
        Feld feld = new Feld();
        feld.id = 2;
        feld.name = "ZugGerade";
        return feld;
    }

    private Feld StraßeKurve() {
        Feld feld = new Feld();
        feld.id = 3;
        feld.name = "StraßeKurve";
        return feld;
    }

    private Feld StraßeKreuzung() {
        Feld feld = new Feld();
        feld.id = 4;
        feld.name = "StraßeKreuzung";
        return feld;
    }

    private Feld StraßeGerade() {
        Feld feld = new Feld();
        feld.id = 5;
        feld.name = "StraßeGerade";
        return feld;
    }

    private Feld StraßeMitBrücke() {
        Feld feld = new Feld();
        feld.id = 6;
        feld.name = "Straße mit ZugBrücke";
        return feld;
    }

    private Feld BahnhofGerade() {
        Feld feld = new Feld();
        feld.id = 7;
        feld.name = "BahnhofGerade";
        return feld;
    }

    private Feld BahnhofKurve() {
        Feld feld = new Feld();
        feld.id = 8;
        feld.name = "BahnhofKurve";
        return feld;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}