package org.costr.railroad_ink;

import java.awt.Image;
import java.io.IOException;

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

    Feld Feld1(int index) throws IOException {
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

    private Feld ZugKurve() throws IOException {
        Feld feld = new Feld();
        feld.id = 0;
        feld.name = "ZugKurve";

        feld.image = ImageIO.read(getClass().getResourceAsStream("number-1.JPG"));

        return feld;
    }

    private Feld ZugKreuzung() throws IOException {
        Feld feld = new Feld();
        feld.id = 1;
        feld.name = "ZugKreuzung";
        feld.image = ImageIO.read(getClass().getResourceAsStream("number-2.JPG"));
        return feld;
    }

    private Feld ZugGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 2;
        feld.name = "ZugGerade";
        feld.image = ImageIO.read(getClass().getResourceAsStream("number-3.JPG"));
        return feld;
    }

    private Feld StraßeKurve() throws IOException {
        Feld feld = new Feld();
        feld.id = 3;
        feld.name = "StraßeKurve";
        feld.image = ImageIO.read(getClass().getResourceAsStream("number-4.JPG"));
        return feld;
    }

    private Feld StraßeKreuzung() throws IOException {
        Feld feld = new Feld();
        feld.id = 4;
        feld.name = "StraßeKreuzung";
        feld.image = ImageIO.read(getClass().getResourceAsStream("number-5.JPG"));
        return feld;
    }

    private Feld StraßeGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 5;
        feld.name = "StraßeGerade";
        feld.image = ImageIO.read(getClass().getResourceAsStream("number-6.JPG"));
        return feld;
    }

    private Feld StraßeMitBrücke() throws IOException {
        Feld feld = new Feld();
        feld.id = 6;
        feld.name = "Straße mit ZugBrücke";
        feld.image = ImageIO.read(getClass().getResourceAsStream("number-7.JPG"));
        return feld;
    }

    private Feld BahnhofGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 7;
        feld.name = "BahnhofGerade";
        feld.image = ImageIO.read(getClass().getResourceAsStream("number-8.JPG"));
        return feld;
    }

    private Feld BahnhofKurve() throws IOException {
        Feld feld = new Feld();
        feld.id = 8;
        feld.name = "BahnhofKurve";
        feld.image = ImageIO.read(getClass().getResourceAsStream("number-9.JPG"));
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