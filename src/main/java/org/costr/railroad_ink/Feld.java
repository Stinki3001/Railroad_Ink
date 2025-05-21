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

        feld.image = ImageIO.read(
                new File("C:\\Users\\costr\\Desktop\\Prgrammieren\\Railroad_Ink\\src\\main\\resources\\number-1.JPG"));

        return feld;
    }

    private Feld ZugKreuzung() throws IOException {
        Feld feld = new Feld();
        feld.id = 1;
        feld.name = "ZugKreuzung";
        feld.image = ImageIO.read(getClass().getResourceAsStream("Zug_Kreuzung.JPG"));
        return feld;
    }

    private Feld ZugGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 2;
        feld.name = "ZugGerade";
        feld.image = ImageIO.read(getClass().getResourceAsStream("Zug_Gerade.JPG"));
        return feld;
    }

    private Feld StraßeKurve() throws IOException {
        Feld feld = new Feld();
        feld.id = 3;
        feld.name = "StraßeKurve";
        feld.image = ImageIO.read(getClass().getResourceAsStream("Straße_Kurve.JPG"));
        return feld;
    }

    private Feld StraßeKreuzung() throws IOException {
        Feld feld = new Feld();
        feld.id = 4;
        feld.name = "StraßeKreuzung";
        feld.image = ImageIO.read(getClass().getResourceAsStream("Straße_Kreuzung.JPG"));
        return feld;
    }

    private Feld StraßeGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 5;
        feld.name = "StraßeGerade";
        feld.image = ImageIO.read(getClass().getResourceAsStream("Straße_Gerade.JPG"));
        return feld;
    }

    private Feld StraßeMitBrücke() throws IOException {
        Feld feld = new Feld();
        feld.id = 6;
        feld.name = "Straße mit Brücke";
        feld.image = ImageIO.read(getClass().getResourceAsStream("Straße_mit_Brücke.JPG"));
        return feld;
    }

    private Feld BahnhofGerade() throws IOException {
        Feld feld = new Feld();
        feld.id = 7;
        feld.name = "BahnhofGerade";
        feld.image = ImageIO.read(getClass().getResourceAsStream("Bahnhof_Gerade.JPG"));
        return feld;
    }

    private Feld BahnhofKurve() throws IOException {
        Feld feld = new Feld();
        feld.id = 8;
        feld.name = "BahnhofKurve";
        feld.image = ImageIO.read(getClass().getResourceAsStream("Bahnhof_Kurve.JPG"));
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