package org.costr.railroad_ink;

import java.awt.Image;
import java.io.File;
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
    Feld(int index) throws IOException {
        Feld1(index);
    }

    Feld() {
        // Default constructor
    }

    Feld Feld1(int index) throws IOException {
        Feld zFeld = null;
        switch (index) {
            case 0 -> zFeld = ZugKurve();
            case 1 -> zFeld = ZugKreuzung();
            case 2 -> zFeld = ZugGerade();
            case 3 -> zFeld = StraßeKurve();
            case 4 -> zFeld = StraßeKreuzung();
            case 5 -> zFeld = StraßeGerade();
            case 6 -> zFeld = StraßeMitBrücke();
            case 7 -> zFeld = BahnhofGerade();
            case 8 -> zFeld = BahnhofKurve();
            default -> throw new IllegalArgumentException("Invalid index: " + index);
        }
        return zFeld;
    }

    private Feld ZugKurve() throws IOException {
        Feld feld = new Feld();
        feld.id = 0;
        feld.name = "ZugKurve";

        feld.image = ImageIO.read(
                new File(getClass().getResource("/Zug_Kurve.JPG").getFile()));

        return feld;
    }

    private Feld ZugKreuzung() throws IOException {
        Feld feld = new Feld();
        feld.id = 1;
        feld.name = "ZugKreuzung";
        feld.image = ImageIO.read(new File(
                getClass().getResource("/Zug_Kreuzung.JPG").getFile()));
        return feld;
    }

    private Feld ZugGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 2;
        feld.name = "ZugGerade";
        feld.image = ImageIO.read(new File(
                getClass().getResource("/Zug_Gerade.JPG").getFile()));
        return feld;
    }

    private Feld StraßeKurve() throws IOException {
        Feld feld = new Feld();
        feld.id = 3;
        feld.name = "StraßeKurve";
        feld.image = ImageIO.read(new File(
                getClass().getResource("/Straße_Kurve.JPG").getFile()));
        return feld;
    }

    private Feld StraßeKreuzung() throws IOException {
        Feld feld = new Feld();
        feld.id = 4;
        feld.name = "StraßeKreuzung";
        feld.image = ImageIO.read(new File(
                getClass().getResource("/Straße_Kreuzung.JPG").getFile()));
        return feld;
    }

    private Feld StraßeGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 5;
        feld.name = "StraßeGerade";
        feld.image = ImageIO.read(new File(
                getClass().getResource("/Straße_Gerade.JPG").getFile()));
        return feld;
    }

    private Feld StraßeMitBrücke() throws IOException {
        Feld feld = new Feld();
        feld.id = 6;
        feld.name = "Straße mit Brücke";
        feld.image = ImageIO.read(new File(
                getClass().getResource("/Straße_mit_Brücke.JPG").getFile()));
        return feld;
    }

    private Feld BahnhofGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 7;
        feld.name = "BahnhofGerade";
        feld.image = ImageIO.read(new File(
                getClass().getResource("/Bahnhof_Gerade.JPG").getFile()));
        return feld;
    }

    private Feld BahnhofKurve() throws IOException {
        Feld feld = new Feld();
        feld.id = 8;
        feld.name = "BahnhofKurve";
        feld.image = ImageIO.read(new File(
                getClass().getResource("/Bahnhof_Kurve.JPG").getFile()));
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