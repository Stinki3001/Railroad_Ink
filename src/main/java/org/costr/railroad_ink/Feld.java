package org.costr.railroad_ink;

import java.awt.Image;

import javax.imageio.ImageIO;

/**
 *
 * @author costr
 */
public class Feld {

    private int id;
    private String name;
    private Image image;

    public static final int ANZ_FELDER = 9;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    Feld(int index) {
        Feld1(index);
    }

    Feld() {
        // Default constructor
    }

    Feld Feld1(int index) {
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
        try {
            feld.image = ImageIO.read(getClass().getResourceAsStream("number-1.JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return feld;
    }

    private Feld ZugKreuzung() {
        Feld feld = new Feld();
        feld.id = 1;
        feld.name = "ZugKreuzung";
        try {
            feld.image = ImageIO.read(getClass().getResourceAsStream("number-2.JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return feld;
    }

    private Feld ZugGerade() {
        Feld feld = new Feld();
        feld.id = 2;
        feld.name = "ZugGerade";
        try {
            feld.image = ImageIO.read(getClass().getResourceAsStream("number-3.JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return feld;
    }

    private Feld StraßeKurve() {
        Feld feld = new Feld();
        feld.id = 3;
        feld.name = "StraßeKurve";
        try {
            feld.image = ImageIO.read(getClass().getResourceAsStream("number-4.JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public Image getImage() {
        return image;
    }
}